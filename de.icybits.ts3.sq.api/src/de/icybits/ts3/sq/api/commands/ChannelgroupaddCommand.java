package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a channel group
 * 
 * @author Iceac
 */
public class ChannelgroupaddCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupaddCommand() {
		super(COMMAND_CHANNELGROUPADD);
	}
}