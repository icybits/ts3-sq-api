package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Displays the server instance configuration including database revision
 * number, the file transfer port, default group IDs, etc. For detailed
 * information, see Server Instance Properties.
 *
 * @author Alias: Iceac Sarutobi
 */
public class InstanceinfoCommand extends Command
		implements
			ITS3CommandNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_INFO_VIEW};

	/**
	 * Displays the server instance configuration including database revision
	 * number, the file transfer port, default group IDs, etc. For detailed
	 * information, see Server Instance Properties.
	 */
	public InstanceinfoCommand() {
		super(COMMAND_INSTANCEINFO);
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
