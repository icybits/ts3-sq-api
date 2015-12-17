package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display an offline message from your inbox
 * 
 * @author Iceac
 */
public class MessagegetCommand extends Command implements ITS3CommandNames {
	public MessagegetCommand() {
		super(COMMAND_MESSAGEGET);
	}
}