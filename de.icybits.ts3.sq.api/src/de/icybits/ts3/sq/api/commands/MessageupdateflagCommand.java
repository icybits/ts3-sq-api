package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * mark an offline message as read
 * 
 * @author Alias: Iceac Sarutobi
 */
public class MessageupdateflagCommand extends Command
		implements
			ITS3CommandNames {
	public MessageupdateflagCommand() {
		super(COMMAND_MESSAGEUPDATEFLAG);
	}
}