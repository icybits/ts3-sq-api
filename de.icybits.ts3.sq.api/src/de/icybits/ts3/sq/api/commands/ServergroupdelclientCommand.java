package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove client from server group
 * 
 * @author Iceac
 */
public class ServergroupdelclientCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupdelclientCommand() {
		super(COMMAND_SERVERGROUPDELCLIENT);
	}
}