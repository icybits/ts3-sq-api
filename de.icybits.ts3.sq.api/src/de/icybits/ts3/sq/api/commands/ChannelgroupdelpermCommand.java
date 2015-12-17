package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove permission from channel group
 * 
 * @author Iceac
 */
public class ChannelgroupdelpermCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupdelpermCommand() {
		super(COMMAND_CHANNELGROUPDELPERM);
	}
}