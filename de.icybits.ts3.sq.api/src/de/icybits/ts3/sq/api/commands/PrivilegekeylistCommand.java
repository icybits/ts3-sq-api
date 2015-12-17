package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list all existing privilege keys on this server
 * 
 * @author Iceac
 */
public class PrivilegekeylistCommand extends Command
		implements
			ITS3CommandNames {
	public PrivilegekeylistCommand() {
		super(COMMAND_PRIVILEGEKEYLIST);
	}
}