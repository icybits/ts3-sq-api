package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Selects the virtual server specified with 'sid' or 'port' to allow further
 * interaction. The ServerQuery client will appear on the virtual server and
 * acts like a real TeamSpeak 3 Client, except it's unable to send or receive
 * voice data.
 * <p>
 * If your database contains multiple virtual servers using the same UDP port,
 * use will select a random virtual server using the specified port.
 *
 * @author Alias: Iceac Sarutobi
 */
public class UseCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_SELECT};

	/**
	 * Selects the virtual server specified with 'sid' or 'port' to allow
	 * further interaction. The ServerQuery client will appear on the virtual
	 * server and acts like a real TeamSpeak 3 Client, except it's unable to
	 * send or receive voice data.
	 * <p>
	 * If your database contains multiple virtual servers using the same UDP
	 * port, use will select a random virtual server using the specified port.
	 */
	public UseCommand() {
		super(COMMAND_USE);
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

	/**
	 * Set the port used by a TS3 Virtual Server.
	 * 
	 * @param port
	 *            the port of a Server
	 * @return This command.
	 */
	public UseCommand setPort(int port) {
		setParameter(new ParameterIntegerValue(PORT, port));
		return this;
	}

	/**
	 * Set the server id of the TS3 Virtual Server.
	 * 
	 * @param sid
	 *            the server id
	 * @return This command.
	 */
	public UseCommand setSID(int sid) {
		setParameter(new ParameterIntegerValue(SID, sid));
		return this;
	}

	/**
	 * Toggle the option "virtual" on or off.
	 * 
	 * @return This command.
	 */
	public UseCommand toggleVirtual() {
		toggleOption(VIRTUAL);
		return this;
	}
}
