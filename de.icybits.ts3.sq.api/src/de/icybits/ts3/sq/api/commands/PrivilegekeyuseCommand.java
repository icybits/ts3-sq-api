package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * use a privilege key
 * 
 * @author Iceac
 */
public class PrivilegekeyuseCommand extends Command
		implements
			ITS3CommandNames {
	public PrivilegekeyuseCommand() {
		super(COMMAND_PRIVILEGEKEYUSE);
	}
}