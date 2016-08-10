package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find permission ID by name
 * 
 * @author Alias: Iceac Sarutobi
 */
public class PermidgetbynameCommand extends Command
		implements
			ITS3CommandNames {
	public PermidgetbynameCommand() {
		super(COMMAND_PERMIDGETBYNAME);
	}
}