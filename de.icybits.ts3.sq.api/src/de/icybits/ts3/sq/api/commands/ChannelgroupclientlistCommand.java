package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find channel groups by client ID
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelgroupclientlistCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgroupclientlistCommand() {
		super(COMMAND_CHANNELGROUPCLIENTLIST);
	}
}