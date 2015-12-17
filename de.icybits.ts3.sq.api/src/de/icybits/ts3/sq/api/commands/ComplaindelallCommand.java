package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete all client complaints
 * 
 * @author Iceac
 */
public class ComplaindelallCommand extends Command implements ITS3CommandNames {
	public ComplaindelallCommand() {
		super(COMMAND_COMPLAINDELALL);
	}
}