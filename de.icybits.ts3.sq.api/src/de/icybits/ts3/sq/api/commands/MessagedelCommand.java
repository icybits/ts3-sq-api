package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete an offline message from your inbox
 * 
 * @author Alias: Iceac Sarutobi
 */
public class MessagedelCommand extends Command implements ITS3CommandNames {
	public MessagedelCommand() {
		super(COMMAND_MESSAGEDEL);
	}
}