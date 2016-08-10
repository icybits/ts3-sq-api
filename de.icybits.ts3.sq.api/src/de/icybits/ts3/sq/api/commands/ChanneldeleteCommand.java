package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete a channel
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChanneldeleteCommand extends Command implements ITS3CommandNames {
	public ChanneldeleteCommand() {
		super(COMMAND_CHANNELDELETE);
	}
}