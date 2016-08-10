package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3VirtualServerProperties;

/**
 * Displays detailed configuration information about the selected virtual server
 * including unique ID, number of clients online, configuration, etc.
 * <p>
 * For detailed information, see {@link ITS3VirtualServerProperties}.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerinfoCommand extends Command
		implements
			ITS3CommandNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_INFO_VIEW};

	/**
	 * Displays detailed configuration information about the selected virtual
	 * server including unique ID, number of clients online, configuration, etc.
	 * <p>
	 * For detailed information, see {@link ITS3VirtualServerProperties}.
	 */
	public ServerinfoCommand() {
		super(COMMAND_SERVERINFO);
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
