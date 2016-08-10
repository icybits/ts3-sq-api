package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list offline messages from your inbox
 * 
 * @author Alias: Iceac Sarutobi
 */
public class MessagelistCommand extends Command implements ITS3CommandNames {
	public MessagelistCommand() {
		super(COMMAND_MESSAGELIST);
	}
}