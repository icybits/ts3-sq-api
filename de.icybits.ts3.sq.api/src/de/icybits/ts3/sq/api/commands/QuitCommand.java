package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Closes the ServerQuery connection to the TeamSpeak 3 Server instance.
 *
 * @author Alias: Iceac Sarutobi
 */
public class QuitCommand extends Command implements ITS3CommandNames {

	private static final Permissions[] PERMISSIONS = new Permissions[0];

	/**
	 * Closes the ServerQuery connection to the TeamSpeak 3 Server instance.
	 */
	public QuitCommand() {
		super(COMMAND_QUIT);
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
