package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * creates a new privilege key
 * 
 * @author Iceac
 */
public class PrivilegekeyaddCommand extends Command
		implements
			ITS3CommandNames {
	public PrivilegekeyaddCommand() {
		super(COMMAND_PRIVILEGEKEYADD);
	}
}