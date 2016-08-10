package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display channel properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelinfoCommand extends Command implements ITS3CommandNames {
	public ChannelinfoCommand() {
		super(COMMAND_CHANNELINFO);
	}
}