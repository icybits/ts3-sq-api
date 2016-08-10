package de.icybits.ts3.sq.api.basic;

import de.icybits.ts3.sq.api.basic.interfaces.IResponse;

/**
 * This class implements the IResponse interface. An instance of this class is
 * an response with the give response string.
 *
 * @author Alias: Iceac Sarutobi
 */
public class Response implements IResponse {

	private final String response;

	/**
	 * Create an empty response with an empty {@link String} as response.
	 */
	public Response() {
		response = "";
	}

	/**
	 * Create a response with the given {@link String} as response. If the given
	 * {@link String} is <code>null</code>, the response {@link String},<br>
	 * is the empty {@link String}.
	 * 
	 * @param response
	 *          the response {@link String}.
	 */
	public Response(String response) {
		if (response != null) {
			this.response = response;
		} else {
			this.response = "";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof Response)) {
			return false;
		}
		Response other = (Response) object;
		return other.response.equals(response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.icybits.ts3.sq.api.basic.interfaces.IResponse#getResponse()
	 */
	@Override
	public String getResponse() {
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return response.hashCode();
	}
}
