package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a copy of an existing server group
 * 
 * @author Iceac
 */
public class ServergroupcopyCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupcopyCommand() {
		super(COMMAND_SERVERGROUPCOPY);
	}
}