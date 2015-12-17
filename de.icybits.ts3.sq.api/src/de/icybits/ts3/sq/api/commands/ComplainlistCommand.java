package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list client complaints on a virtual server
 * 
 * @author Iceac
 */
public class ComplainlistCommand extends Command implements ITS3CommandNames {
	public ComplainlistCommand() {
		super(COMMAND_COMPLAINLIST);
	}
}