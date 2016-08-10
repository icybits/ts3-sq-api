package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * globally assign permissions to server groups
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServergroupautoaddpermCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupautoaddpermCommand() {
		super(COMMAND_SERVERGROUPAUTOADDPERM);
	}
}