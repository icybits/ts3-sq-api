package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Displays a list of IP addresses used by the server instance on multi-homed
 * machines.
 *
 * @author iceac_000
 */
public class BindinglistCommand extends Command
		implements
			ITS3CommandNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_BINDING_LIST};

	/**
	 * Displays a list of IP addresses used by the server instance on
	 * multi-homed machines.
	 */
	public BindinglistCommand() {
		super(COMMAND_BINDINGLIST);
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
