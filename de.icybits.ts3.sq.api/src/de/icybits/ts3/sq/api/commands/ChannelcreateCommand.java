package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a channel
 * 
 * @author Iceac
 */
public class ChannelcreateCommand extends Command implements ITS3CommandNames {
	public ChannelcreateCommand() {
		super(COMMAND_CHANNELCREATE);
	}
}