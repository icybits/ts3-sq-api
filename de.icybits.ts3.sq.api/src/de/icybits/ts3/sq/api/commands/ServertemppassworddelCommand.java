package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete an existing temporary server password
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServertemppassworddelCommand extends Command
		implements
			ITS3CommandNames {
	public ServertemppassworddelCommand() {
		super(COMMAND_SERVERTEMPPASSWORDDEL);
	}
}