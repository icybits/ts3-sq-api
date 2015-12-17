package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list channel-client specific permissions
 * 
 * @author Iceac
 */
public class ChannelclientpermlistCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelclientpermlistCommand() {
		super(COMMAND_CHANNELCLIENTPERMLIST);
	}
}