package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * rename a file
 * 
 * @author Iceac
 */
public class FtrenamefileCommand extends Command implements ITS3CommandNames {
	public FtrenamefileCommand() {
		super(COMMAND_FTRENAMEFILE);
	}
}