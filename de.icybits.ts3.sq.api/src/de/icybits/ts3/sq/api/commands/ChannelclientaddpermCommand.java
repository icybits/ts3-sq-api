package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * assign permission to channel-client combi
 * 
 * @author Iceac
 */
public class ChannelclientaddpermCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelclientaddpermCommand() {
		super(COMMAND_CHANNELCLIENTADDPERM);
	}
}