package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3VirtualServerProperties;

/**
 * Displays the database ID of the virtual server running on the UDP port
 * specified by virtualserver_port.
 *
 * @author iceac_000
 */
public class ServeridgetbyportCommand extends Command
		implements
			ITS3CommandNames,
			ITS3VirtualServerProperties,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_VIRTUALSERVER_LIST};

	/**
	 * Displays the database ID of the virtual server running on the UDP port
	 * specified by virtualserver_port.
	 * 
	 * @param serverPort
	 *            the server related port
	 */
	public ServeridgetbyportCommand(int serverPort) {
		super(COMMAND_SERVERIDGETBYPORT);
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_PORT, serverPort));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory#createResponse(
	 * java .lang.String)
	 */
	@Override
	public Response createResponse(String response)
			throws ParseResponseException {
		return new Response(response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.icybits.ts3.sq.api.interfaces.ITS3Permission#getPermissions()
	 */
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}
