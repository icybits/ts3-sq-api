package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete all server and channel groups and restore default permissions
 * 
 * @author Iceac
 */
public class PermresetCommand extends Command implements ITS3CommandNames {
	public PermresetCommand() {
		super(COMMAND_PERMRESET);
	}
}