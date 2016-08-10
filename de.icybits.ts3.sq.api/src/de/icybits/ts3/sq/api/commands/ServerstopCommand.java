package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Stops the virtual server specified with sid. Depending on your permissions,
 * you're able to stop either your own virtual server only or all virtual
 * servers in the server instance.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerstopCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_STOP,
			Permissions.B_VIRTUALSERVER_STOP_ANY};

	/**
	 * Stops the virtual server specified with sid. Depending on your
	 * permissions, you're able to stop either your own virtual server only or
	 * all virtual servers in the server instance.
	 * 
	 * @param sid
	 *            the virtual server ID
	 */
	public ServerstopCommand(Integer sid) {
		super(COMMAND_SERVERSTOP);
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
