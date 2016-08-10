package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * unregister from event notifications
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServernotifyunregisterCommand extends Command
		implements
			ITS3CommandNames {
	public ServernotifyunregisterCommand() {
		super(COMMAND_SERVERNOTIFYUNREGISTER);
	}
}