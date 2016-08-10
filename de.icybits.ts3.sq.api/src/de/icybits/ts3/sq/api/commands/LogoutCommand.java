package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Deselects the active virtual server and logs out from the server instance.
 *
 * @author Alias: Iceac Sarutobi
 */
public class LogoutCommand extends Command implements ITS3CommandNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERQUERY_LOGIN};

	/**
	 * Deselects the active virtual server and logs out from the server
	 * instance.
	 */
	public LogoutCommand() {
		super(COMMAND_LOGOUT);
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
