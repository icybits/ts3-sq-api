package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Starts the virtual server specified with sid. Depending on your permissions,
 * you're able to start either your own virtual server only or all virtual
 * servers in the server instance.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerstartCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_START,
			Permissions.B_VIRTUALSERVER_START_ANY};

	/**
	 * Starts the virtual server specified with sid. Depending on your
	 * permissions, you're able to start either your own virtual server only or
	 * all virtual servers in the server instance.
	 * 
	 * @param sid
	 *            the server ID
	 */
	public ServerstartCommand(Integer sid) {
		super(COMMAND_SERVERSTART);
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
