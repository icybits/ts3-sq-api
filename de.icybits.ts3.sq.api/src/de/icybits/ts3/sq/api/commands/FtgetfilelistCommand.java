package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list files stored in a channel filebase
 * 
 * @author Alias: Iceac Sarutobi
 */
public class FtgetfilelistCommand extends Command implements ITS3CommandNames {
	public FtgetfilelistCommand() {
		super(COMMAND_FTGETFILELIST);
	}
}