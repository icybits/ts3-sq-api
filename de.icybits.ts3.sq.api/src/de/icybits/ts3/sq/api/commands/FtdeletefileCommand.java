package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete a file
 * 
 * @author Iceac
 */
public class FtdeletefileCommand extends Command implements ITS3CommandNames {
	public FtdeletefileCommand() {
		super(COMMAND_FTDELETEFILE);
	}
}