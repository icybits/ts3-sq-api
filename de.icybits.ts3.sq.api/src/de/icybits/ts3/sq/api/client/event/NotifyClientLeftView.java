package de.icybits.ts3.sq.api.client.event;

import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;

/**
 * This class extends NotifyEvent. An instance of this class is an
 * ClientLeftView event fired by the "TS3 Server Query".
 *
 * @author Alias: Iceac Sarutobi
 */
public class NotifyClientLeftView extends NotifyEvent {

	/**
	 * Create a new NotifyClientLeftView from the event string
	 * 
	 * @param eventString
	 *          the event string
	 */
	public NotifyClientLeftView(String eventString) {
		super(NOTIFY_CLIENT_LEFT_VIEW);
		String[] split = eventString.split(" ");
		for (String parameterString : split) {
			if (parameterString.contains("=")) {
				IParameter<?> parameter = createParameter(parameterString);
				if (parameter != null) {
					addParameter(parameter);
				}
			}
		}
	}

	/**
	 * Create a parameter from the parameter string
	 * 
	 * @param parameter
	 *          the parameter string
	 * @return the corresponding Parameter
	 */
	private IParameter<?> createParameter(String parameter) {
		int separatorPos = parameter.indexOf("=");
		String parameterName = parameter.substring(0, separatorPos);
		String parameterValue = parameter.substring(separatorPos + 1);
		switch (parameterName) {
		case CFID:
			return new ParameterIntegerValue(CFID, parameterValue);
		case CTID:
			return new ParameterIntegerValue(CTID, parameterValue);
		case REASONID:
			return new ParameterIntegerValue(REASONID, parameterValue);
		case REASONMSG:
			return new ParameterStringValue(REASONMSG, parameterValue);
		case CLID:
			return new ParameterIntegerValue(CLID, parameterValue);
		default:
			return null;
		}
	}

	/**
	 * @return the CFID
	 */
	public int getCFID() {
		return getIntegerValue(CFID);
	}

	/**
	 * @return the client id
	 */
	public int getCLID() {
		return getIntegerValue(CLID);
	}

	/**
	 * @return the CTID
	 */
	public int getCTID() {
		return getIntegerValue(CTID);
	}

	/**
	 * @return the reason id
	 */
	public int getReasonID() {
		return getIntegerValue(REASONID);
	}

	/**
	 * @return the reason message
	 */
	public String getReasonMSG() {
		return getStringValue(REASONMSG);
	}
}
