package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list channel group permissions
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelgrouppermlistCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelgrouppermlistCommand() {
		super(COMMAND_CHANNELGROUPPERMLIST);
	}
}