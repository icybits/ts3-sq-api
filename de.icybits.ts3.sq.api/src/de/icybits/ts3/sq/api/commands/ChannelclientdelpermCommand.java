package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove permission from channel-client combi
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelclientdelpermCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelclientdelpermCommand() {
		super(COMMAND_CHANNELCLIENTDELPERM);
	}
}