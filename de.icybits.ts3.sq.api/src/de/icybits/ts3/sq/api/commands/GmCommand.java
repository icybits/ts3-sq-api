package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * send global text message
 * 
 * @author Alias: Iceac Sarutobi
 */
public class GmCommand extends Command implements ITS3CommandNames {
	public GmCommand() {
		super(COMMAND_GM);
	}
}