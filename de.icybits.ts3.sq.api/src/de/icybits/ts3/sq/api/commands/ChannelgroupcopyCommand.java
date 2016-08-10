package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * copy a channel group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelgroupcopyCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupcopyCommand() {
		super(COMMAND_CHANNELGROUPCOPY);
	}
}