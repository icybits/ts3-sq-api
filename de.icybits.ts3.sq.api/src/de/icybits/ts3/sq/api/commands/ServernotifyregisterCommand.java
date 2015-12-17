package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * register for event notifications
 * 
 * @author Iceac
 */
public class ServernotifyregisterCommand extends Command
		implements
			ITS3CommandNames {
	public ServernotifyregisterCommand() {
		super(COMMAND_SERVERNOTIFYREGISTER);
	}
}