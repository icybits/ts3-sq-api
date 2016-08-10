package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * assign permission to channel
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChanneladdpermCommand extends Command implements ITS3CommandNames {
	public ChanneladdpermCommand() {
		super(COMMAND_CHANNELADDPERM);
	}
}