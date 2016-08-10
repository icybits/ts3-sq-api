package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list all existing temporary server passwords
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServertemppasswordlistCommand extends Command
		implements
			ITS3CommandNames {
	public ServertemppasswordlistCommand() {
		super(COMMAND_SERVERTEMPPASSWORDLIST);
	}
}