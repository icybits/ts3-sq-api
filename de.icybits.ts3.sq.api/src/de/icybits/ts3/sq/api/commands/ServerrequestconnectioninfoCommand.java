package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Displays detailed connection information about the selected virtual server
 * including uptime, traffic information, etc.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerrequestconnectioninfoCommand extends Command
		implements
			ITS3CommandNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_CONNECTIONINFO_VIEW};

	/**
	 * Displays detailed connection information about the selected virtual
	 * server including uptime, traffic information, etc.
	 */
	public ServerrequestconnectioninfoCommand() {
		super(COMMAND_SERVERREQUESTCONNECTIONINFO);
	}

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
