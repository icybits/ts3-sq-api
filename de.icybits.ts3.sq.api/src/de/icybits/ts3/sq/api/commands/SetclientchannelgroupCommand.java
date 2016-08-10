package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * set a clients channel group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class SetclientchannelgroupCommand extends Command
		implements
			ITS3CommandNames {
	public SetclientchannelgroupCommand() {
		super(COMMAND_SETCLIENTCHANNELGROUP);
	}
}