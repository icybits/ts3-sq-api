package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * rename a server group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergrouprenameCommand extends Command
		implements
			ITS3CommandNames {
	public ServergrouprenameCommand() {
		super(COMMAND_SERVERGROUPRENAME);
	}
}