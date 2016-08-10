package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * assign permissions to server group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergroupaddpermCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupaddpermCommand() {
		super(COMMAND_SERVERGROUPADDPERM);
	}
}