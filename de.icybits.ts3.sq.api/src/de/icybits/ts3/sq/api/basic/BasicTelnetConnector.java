package de.icybits.ts3.sq.api.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

import de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector;

/**
 * The Basic telnet connector is an unsecured connection to the server query. <br>
 * It is implemented as easy as possible, so it may contain bugs.
 *
 * @author Alias: Iceac Sarutobi
 */
public class BasicTelnetConnector implements ITS3Connector {

	private BufferedReader bufferedReader = null;
	private BufferedWriter bufferedWriter = null;
	private Charset charset;
	private Socket socket = null;

	/**
	 * Telnet connector with UTF-8 encoding
	 *
	 * @throws UnsupportedCharsetException
	 *           If no support for the UTF-8 charset is available in this instance of the Java virtual machine
	 */
	public BasicTelnetConnector() {
		this(null);
	}

	/**
	 * Telnet connector with given character encoding. If character encoding is null, UTF-8 encoding is set.
	 *
	 * @param charsetName
	 *          The name of the preferred character encoding
	 * @throws IllegalCharsetNameException
	 *           If the given charset name is illegal
	 * @throws UnsupportedCharsetException
	 *           If no support for the named charset is available in this instance of the Java virtual machine
	 */
	public BasicTelnetConnector(String charsetName) {
		if (charset != null) {
			charset = Charset.forName(charsetName);
		} else {
			charset = Charset.forName("UTF-8");
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#close()
	 */
	@Override
	public void close() throws IOException {
		socket.close();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#connect(java.net. InetAddress, int)
	 */
	@Override
	public void connect(InetAddress address, int port) throws IOException {
		// close the last socket if it is not actually closed
		if (socket != null && !socket.isClosed()) {
			socket.close();
		}
		socket = new Socket(address, port);
		socket.setKeepAlive(true);
		bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
		bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), charset));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#hasInput()
	 */
	@Override
	public boolean hasInput() throws IOException {
		return bufferedReader.ready();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#receive()
	 */
	@Override
	public String receive() throws IOException {
		return bufferedReader.readLine();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#resetInput()
	 */
	@Override
	public String resetInput() throws IOException {
		StringBuilder builder = new StringBuilder();
		while (hasInput()) {
			builder.append(receive());
			builder.append('\n');
		}
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector#send(java.lang.String)
	 */
	@Override
	public void send(String string) throws IOException {
		bufferedWriter.write(string);
		if (!string.endsWith("\n")) {
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
	}
}
