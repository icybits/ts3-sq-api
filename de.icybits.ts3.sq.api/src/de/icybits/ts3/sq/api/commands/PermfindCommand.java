package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find permission assignments by ID
 * 
 * @author Alias: Iceac Sarutobi
 */
public class PermfindCommand extends Command implements ITS3CommandNames {
	public PermfindCommand() {
		super(COMMAND_PERMFIND);
	}
}