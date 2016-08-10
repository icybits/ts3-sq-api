package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list clients in a server group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergroupclientlistCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupclientlistCommand() {
		super(COMMAND_SERVERGROUPCLIENTLIST);
	}
}