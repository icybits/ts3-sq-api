package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Stops the entire TeamSpeak 3 Server instance by shutting down the process.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerprocessstopCommand extends Command
		implements
			ITS3CommandNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_STOP};

	/**
	 * Stops the entire TeamSpeak 3 Server instance by shutting down the
	 * process.
	 */
	public ServerprocessstopCommand() {
		super(COMMAND_SERVERPROCESSSTOP);
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
