package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list channels on a virtual server
 * 
 * @author Iceac
 */
public class ChannellistCommand extends Command implements ITS3CommandNames {
	public ChannellistCommand() {
		super(COMMAND_CHANNELLIST);
	}
}