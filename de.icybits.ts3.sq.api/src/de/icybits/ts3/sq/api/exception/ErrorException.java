/**
 *
 */
package de.icybits.ts3.sq.api.exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.icybits.ts3.sq.api.util.Util;

/**
 * Exception class for the "TS3 server query" error message
 *
 * @author Alias: Iceac Sarutobi
 */
public class ErrorException extends Exception {

	/**
	 * The error message "OK status" <b>code</b>.
	 */
	private static final int CODE_OK = 0;
	/**
	 * the error message pattern
	 */
	private static final Pattern ERROR = Pattern.compile("error id=\\d+ msg=\\S+( extra_msg=\\S+)?");
	/**
	 * the error id parameter pattern
	 */
	private static final Pattern ERROR_ID = Pattern.compile("id=\\d+");
	/**
	 * the error msg parameter pattern
	 */
	private static final Pattern ERROR_MSG = Pattern.compile("msg=\\S+");
	/**
	 * the error extra_msg parameter pattern
	 */
	private static final Pattern ERROR_EXTRA_MSG = Pattern.compile("extra_msg=\\S+");
	/**
	 * Generated Serial Version UID.
	 */
	private static final long serialVersionUID = 2323587875568076955L;

	/**
	 * Create new {@link ErrorException} from response,<br>
	 * or <code>null</code> if error message is <b>OK</b> message.
	 * 
	 * @param response
	 *          the response {@link String}
	 * @return An new {@link ErrorException}
	 */
	public static ErrorException createFromResponse(String response) {
		int code = 0;
		String message = null;
		String extraMessage = null;
		Scanner scanner = new Scanner(response);
		try {
			if (!scanner.hasNext("error")) {
				throw new IllegalArgumentException("error message not found");
			}
			scanner.skip("error");
			if (!scanner.hasNext(ERROR_ID)) {
				throw new IllegalArgumentException("error \"id\" not found");
			}
			String id = scanner.next(ERROR_ID);
			code = Integer.parseInt(id.substring(id.indexOf('=') + 1));
			if (code == CODE_OK) {
				return null;
			}
			if (!scanner.hasNext(ERROR_MSG)) {
				throw new IllegalArgumentException("error \"msg\" not found");
			}
			String msg = scanner.next(ERROR_MSG);
			message = msg.substring(msg.indexOf('=') + 1);
			if (scanner.hasNext(ERROR_EXTRA_MSG)) {
				String extraMsg = scanner.next(ERROR_EXTRA_MSG);
				extraMessage = extraMsg.substring(extraMsg.indexOf('=') + 1);
			}
		} finally {
			scanner.close();
		}
		return new ErrorException(code, message, extraMessage);
	}

	/**
	 * @param tmpResponseString
	 *          the response string
	 * @return <code>true</code> if the given string is an error message
	 */
	public static boolean isErrorResponse(String tmpResponseString) {
		if (tmpResponseString != null) {
			Matcher responseMatcher = ERROR.matcher(tmpResponseString);
			return responseMatcher.find();
		}
		return false;
	}

	/**
	 * The code of the "TS3 server query" error message.
	 */
	private final int code;

	/**
	 * An extra message for more detailed info.
	 */
	private final String extraMessage;

	/**
	 * Create a new {@link ErrorException} with the<br>
	 * error message <b>code</b> and <b>message</b>.
	 * 
	 * @param code
	 *          from error message
	 * @param message
	 *          from error message
	 */
	public ErrorException(int code, String message) {
		this(code, message, null);
	}

	/**
	 * Create a new {@link ErrorException} with the<br>
	 * error message <b>code</b> and <b>message</b>.
	 * 
	 * @param code
	 *          from error message
	 * @param message
	 *          from error message
	 */
	public ErrorException(int code, String message, String extraMessage) {
		super(message);
		this.code = code;
		this.extraMessage = extraMessage;
	}

	/**
	 * Returns the <b>code</b> from the "TS3 server query" error message.
	 * 
	 * @return The <b>code</b>
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Returns the <b>message</b> form the "TS3 server query" error message.
	 * 
	 * @return The <b>message</b>
	 */
	@Override
	public String getMessage() {
		if (super.getMessage() != null) {
			return Util.fromTS3String(super.getMessage());
		}
		return null;
	}

	/**
	 * Returns the <b>extra message</b> form the "TS3 server query" error message.
	 * 
	 * @return The <b>extra message</b>
	 */
	public String getExtraMessage() {
		if (extraMessage != null) {
			return Util.fromTS3String(extraMessage);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		String s = super.toString();
		String extraMessage = getExtraMessage();
		return extraMessage != null ? s + ": " + extraMessage : s;
	}

}