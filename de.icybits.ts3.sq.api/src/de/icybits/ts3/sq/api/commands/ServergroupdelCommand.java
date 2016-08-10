package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * @author Alias: Iceac Sarutobi
 *
 */
public class ServergroupdelCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_SERVERGROUP_DELETE};

	/**
	 * @param name
	 */
	public ServergroupdelCommand(int groupID) {
		super(COMMAND_SERVERGROUPDEL);
		setParameter(new ParameterIntegerValue(SGID, groupID));
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

	public void force(boolean force) {
	}
}
