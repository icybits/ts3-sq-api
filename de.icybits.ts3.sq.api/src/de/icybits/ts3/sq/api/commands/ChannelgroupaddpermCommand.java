package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * assign permission to channel group
 * 
 * @author Iceac
 */
public class ChannelgroupaddpermCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupaddpermCommand() {
		super(COMMAND_CHANNELGROUPADDPERM);
	}
}