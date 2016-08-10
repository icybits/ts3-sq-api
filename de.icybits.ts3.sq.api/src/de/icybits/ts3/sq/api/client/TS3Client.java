package de.icybits.ts3.sq.api.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.icybits.ts3.sq.api.basic.interfaces.ICommand;
import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.basic.interfaces.IResponse;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector;
import de.icybits.ts3.sq.api.client.event.NotifyClientEnterView;
import de.icybits.ts3.sq.api.client.event.NotifyClientLeftView;
import de.icybits.ts3.sq.api.client.event.NotifyEvent;
import de.icybits.ts3.sq.api.client.event.NotifyListener;
import de.icybits.ts3.sq.api.client.event.interfaces.INotifyTypes;
import de.icybits.ts3.sq.api.exception.ErrorException;
import de.icybits.ts3.sq.api.exception.IllegalCommandException;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.util.Messages;
import de.icybits.ts3.sq.api.util.Util;

/**
 * @author Alias: Iceac Sarutobi
 */
public class TS3Client extends Thread implements INotifyTypes {

	public static final String CLASS_NAME = TS3Client.class.getName();
	private static final Logger LOGGER = Logger.getLogger(TS3Client.class.getName());
	private ITS3Connector client;
	private ConcurrentSkipListSet<NotifyListener> notifyer = new ConcurrentSkipListSet<NotifyListener>();;
	private ConcurrentLinkedQueue<String> response = new ConcurrentLinkedQueue<String>();

	public TS3Client(ITS3Connector client, String host, int port) throws IOException {
		this.client = client;
		InetAddress address = null;
		try {
			address = InetAddress.getByName(host);
		} catch (UnknownHostException e) {
			LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.00"), e); //$NON-NLS-1$
			throw e;
		}
		try {
			client.connect(address, port);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.01"), e); //$NON-NLS-1$
			throw e;
		}
		// delete three lines of the welcome message from queue
		start();
		String response = getResponseFromQueue(60);
		if (response == null) {
			LOGGER.log(Level.WARNING, Messages.getString("TS3Client.02")); //$NON-NLS-1$
		} else {
			if (!response.equalsIgnoreCase("TS3")) { //$NON-NLS-1$
				LOGGER.log(Level.WARNING, Messages.getString("TS3Client.03")); //$NON-NLS-1$
			} else {
				response = getResponseFromQueue(60);
				if (response == null) {
					LOGGER.log(Level.WARNING, Messages.getString("TS3Client.04")); //$NON-NLS-1$
				} else {
					if (!response.equalsIgnoreCase(
							"Welcome to the TeamSpeak 3 ServerQuery interface, type \"help\" for a list of commands and \"help <command>\" for information on a specific command.")) { //$NON-NLS-1$
						LOGGER.log(Level.WARNING, Messages.getString("TS3Client.05")); //$NON-NLS-1$
					} else {
						LOGGER.log(Level.INFO, Messages.getString("TS3Client.06")); //$NON-NLS-1$
					}
				}
			}
		}
	}

	public boolean addNotifyListener(NotifyListener listener) {
		if (listener != null) {
			return notifyer.add(listener);
		}
		return false;
	}

	private void addResponseToQueue(String input) {
		response.offer(input);
	}

	private boolean checkWord(String word) {
		if (word.matches("\\w+")) { //$NON-NLS-1$
			return true;
		}
		return false;
	}

	private String createTS3CommandString(ICommand command) throws IllegalCommandException {
		StringBuilder builder = new StringBuilder();
		if (checkWord(command.getName())) {
			builder.append(command.getName());
		} else {
			throw new IllegalCommandException(Messages.getString("TS3Client.07") //$NON-NLS-1$
					+ command.getName());
		}
		Iterator<IParameter<?>> parameterIterator = command.getParameters().iterator();
		while (parameterIterator.hasNext()) {
			IParameter<?> parameter = parameterIterator.next();
			if (checkWord(parameter.getName())) {
				builder.append(" "); //$NON-NLS-1$
				if (parameter.getValue() != null && !parameter.getValue().toString().isEmpty()) {
					builder.append(parameter.getName());
					builder.append("="); //$NON-NLS-1$
					if (parameter.getValue() instanceof List<?>) {
						Iterator<?> valueIterator = ((List<?>) parameter.getValue()).iterator();
						while (valueIterator.hasNext()) {
							builder.append(valueIterator.next());
							if (valueIterator.hasNext()) {
								builder.append("|"); //$NON-NLS-1$
							}
						}
					} else if (parameter.getValue() instanceof Boolean) {
						builder.append(Util.booleanToNumber((Boolean) parameter.getValue()));
					} else {
						builder.append(Util.toTS3String(parameter.getValue().toString()));
					}
				} else {
					throw new IllegalCommandException(Messages.getString("TS3Client.19") //$NON-NLS-1$
							+ parameter.getName());
				}
			} else {
				throw new IllegalCommandException(Messages.getString("TS3Client.08") //$NON-NLS-1$
						+ parameter.getName());
			}
		}
		Iterator<String> optionIterator = command.getOptions().iterator();
		while (optionIterator.hasNext()) {
			String option = optionIterator.next();
			if (checkWord(option)) {
				builder.append(" "); //$NON-NLS-1$
				builder.append("-"); //$NON-NLS-1$
				builder.append(option);
			} else {
				throw new IllegalCommandException(Messages.getString("TS3Client.09") //$NON-NLS-1$
						+ option);
			}
		}
		return builder.toString();
	}

	public synchronized IResponse execute(ICommand command) throws IOException, ErrorException, ParseResponseException, IllegalCommandException {
		try {
			client.send(createTS3CommandString(command));
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.10"), e); //$NON-NLS-1$
			throw e;
		}
		String responseString = null;
		String errorString = null;
		String tmpResponseString = null;
		do {
			tmpResponseString = getResponseFromQueue(60);
			if (tmpResponseString == null) {
				IOException e = new IOException(Messages.getString("TS3Client.11")); //$NON-NLS-1$
				LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.12") //$NON-NLS-1$
						+ command.getName(), e);
				throw e;
			}
			if (ErrorException.isErrorResponse(tmpResponseString)) {
				errorString = tmpResponseString;
			} else {
				if (responseString == null) {
					responseString = tmpResponseString;
				} else {
					responseString = responseString + "\n" + tmpResponseString; //$NON-NLS-1$
				}
			}
		} while (!ErrorException.isErrorResponse(tmpResponseString));
		ErrorException errorException = ErrorException.createFromResponse(errorString);
		if (errorException != null) {
			LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.13") //$NON-NLS-1$
					+ command.getName(), errorException);
			throw errorException;
		} else {
			if (command instanceof IResponseFactory<?>) {
				try {
					return ((IResponseFactory<?>) command).createResponse(responseString);
				} catch (ParseResponseException e) {
					LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.14") //$NON-NLS-1$
							+ command.getName(), e);
					throw e;
				}
			}
		}
		return null;
	}

	private void fireNotifyEvent(String eventType, String input) {
		LOGGER.log(Level.INFO, Messages.getString("TS3Client.15") + eventType); //$NON-NLS-1$
		NotifyEvent event = null;
		switch (eventType) {
			case NOTIFY_CLIENT_ENTER_VIEW_NAME :
				event = new NotifyClientEnterView(input);
				break;
			case NOTIFY_CLIENT_LEFT_VIEW_NAME :
				event = new NotifyClientLeftView(input);
				break;
		}
		if (event != null) {
			Iterator<NotifyListener> iterator = notifyer.iterator();
			while (iterator.hasNext()) {
				NotifyListener listener = iterator.next();
				if ((listener.getTypes() & event.getType()) == event.getType()) {
					listener.notify(event);
				}
			}
		}
	}

	private String getResponseFromQueue(int timeout) {
		String responseString = null;
		while ((responseString = response.poll()) == null && timeout >= 0) {
			timeout--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.16"), e); //$NON-NLS-1$
				timeout = -1;
			}
		}
		return responseString;
	}

	public boolean removeNotifyListener(NotifyListener listener) {
		if (listener != null) {
			return notifyer.remove(listener);
		}
		return false;
	}

	@Override
	public void run() {
		while (!isInterrupted()) {
			try {
				if (client.hasInput()) {
					String input = client.receive();
					if (input == null) {
						continue;
					}
					if (input.isEmpty()) {
						continue;
					}
					int index = input.indexOf(" "); //$NON-NLS-1$
					String type;
					if (index > -1) {
						type = input.substring(0, index);
					} else {
						type = input;
					}
					switch (type) {
						case NOTIFY_CLIENT_ENTER_VIEW_NAME :
						case NOTIFY_CLIENT_LEFT_VIEW_NAME :
							fireNotifyEvent(type, input);
							break;
						default :
							addResponseToQueue(input);
							break;
					}
				}
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, Messages.getString("TS3Client.17"), e); //$NON-NLS-1$
				interrupt();
			}
			try {
				sleep(10);
			} catch (InterruptedException e) {
				interrupt();
			}
		}
		LOGGER.log(Level.INFO, Messages.getString("TS3Client.18")); //$NON-NLS-1$
	}

}
