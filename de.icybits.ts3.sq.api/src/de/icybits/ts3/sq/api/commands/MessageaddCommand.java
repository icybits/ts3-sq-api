package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * send an offline message
 * 
 * @author Alias: Iceac Sarutobi
 */
public class MessageaddCommand extends Command implements ITS3CommandNames {
	public MessageaddCommand() {
		super(COMMAND_MESSAGEADD);
	}
}