package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list server group permissions
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergrouppermlistCommand extends Command
		implements
			ITS3CommandNames {
	public ServergrouppermlistCommand() {
		super(COMMAND_SERVERGROUPPERMLIST);
	}
}