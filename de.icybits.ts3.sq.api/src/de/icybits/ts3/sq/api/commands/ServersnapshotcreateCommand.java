package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create snapshot of a virtual server
 * 
 * @author Iceac
 */
public class ServersnapshotcreateCommand extends Command
		implements
			ITS3CommandNames {
	public ServersnapshotcreateCommand() {
		super(COMMAND_SERVERSNAPSHOTCREATE);
	}
}