package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display client permission value for yourself
 * 
 * @author Alias: Iceac Sarutobi
 */
public class PermgetCommand extends Command implements ITS3CommandNames {
	public PermgetCommand() {
		super(COMMAND_PERMGET);
	}
}