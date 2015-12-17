package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Deletes the virtual server specified with 'sid'. Please note that only
 * virtual servers in stopped state can be deleted.
 *
 * @author iceac_000
 */
public class ServerdeleteCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_DELETE};

	/**
	 * Deletes the virtual server specified with 'sid'. Please note that only
	 * virtual servers in stopped state can be deleted.
	 * 
	 * @param sid
	 *            the server id
	 */
	public ServerdeleteCommand(int sid) {
		super(COMMAND_SERVERDELETE);
		setParameter(new ParameterIntegerValue(SID, sid));
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
