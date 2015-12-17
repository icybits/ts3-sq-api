package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list channel groups
 * 
 * @author Iceac
 */
public class ChannelgrouplistCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgrouplistCommand() {
		super(COMMAND_CHANNELGROUPLIST);
	}
}