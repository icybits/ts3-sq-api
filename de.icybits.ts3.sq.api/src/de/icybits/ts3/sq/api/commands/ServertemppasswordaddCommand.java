package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a new temporary server password
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServertemppasswordaddCommand extends Command
		implements
			ITS3CommandNames {
	public ServertemppasswordaddCommand() {
		super(COMMAND_SERVERTEMPPASSWORDADD);
	}
}