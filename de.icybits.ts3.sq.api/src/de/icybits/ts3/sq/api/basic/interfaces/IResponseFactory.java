package de.icybits.ts3.sq.api.basic.interfaces;

import de.icybits.ts3.sq.api.exception.ParseResponseException;

/**
 * This interface defines that an IResponseFactory can create an IResponse, from
 * a response String.
 *
 * @author iceac_000
 * @param <RESPONSE>
 */
public interface IResponseFactory<RESPONSE extends IResponse> {

	/**
	 * Create an IResponse object from a response String.
	 * 
	 * @param response
	 *          the response String
	 * @return an instance of an IResponse implementation.
	 */
	public RESPONSE createResponse(String response) throws ParseResponseException;
}
