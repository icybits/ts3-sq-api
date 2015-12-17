package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * get all server groups of specified client
 * 
 * @author Iceac
 */
public class ServergroupbyclientidCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupbyclientidCommand() {
		super(COMMAND_SERVERGROUPBYCLIENTID);
	}
}