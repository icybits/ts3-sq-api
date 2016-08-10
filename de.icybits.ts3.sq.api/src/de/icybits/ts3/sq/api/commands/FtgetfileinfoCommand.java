package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display details about a file
 * 
 * @author Alias: Iceac Sarutobi
 */
public class FtgetfileinfoCommand extends Command implements ITS3CommandNames {
	public FtgetfileinfoCommand() {
		super(COMMAND_FTGETFILEINFO);
	}
}