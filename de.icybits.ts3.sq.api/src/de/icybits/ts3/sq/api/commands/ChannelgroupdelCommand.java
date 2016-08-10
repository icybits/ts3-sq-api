package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete a channel group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelgroupdelCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupdelCommand() {
		super(COMMAND_CHANNELGROUPDEL);
	}
}