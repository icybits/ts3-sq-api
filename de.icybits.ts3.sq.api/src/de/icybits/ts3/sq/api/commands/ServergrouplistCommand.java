package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Displays a list of server groups available. Depending on your permissions,
 * the output may also contain global ServerQuery groups and template groups.
 *
 * @author iceac
 */
public class ServergrouplistCommand extends Command
		implements
			ITS3CommandNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_MODIFY_QUERYGROUP,
			Permissions.B_SERVERINSTANCE_MODIFY_TEMPLATES,
			Permissions.B_VIRTUALSERVER_SERVERGROUP_LIST};

	/**
	 * Displays a list of server groups available. Depending on your
	 * permissions, the output may also contain global ServerQuery groups and
	 * template groups.
	 */
	public ServergrouplistCommand() {
		super(COMMAND_SERVERGROUPLIST);
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
