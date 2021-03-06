package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * rename a channel group
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelgrouprenameCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgrouprenameCommand() {
		super(COMMAND_CHANNELGROUPRENAME);
	}
}