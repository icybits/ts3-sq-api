package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list active file transfers
 * 
 * @author Iceac
 */
public class FtlistCommand extends Command implements ITS3CommandNames {
	public FtlistCommand() {
		super(COMMAND_FTLIST);
	}
}