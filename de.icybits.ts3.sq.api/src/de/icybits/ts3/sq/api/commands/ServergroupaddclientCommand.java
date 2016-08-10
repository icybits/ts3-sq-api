package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * add client to server group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergroupaddclientCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupaddclientCommand() {
		super(COMMAND_SERVERGROUPADDCLIENT);
	}
}