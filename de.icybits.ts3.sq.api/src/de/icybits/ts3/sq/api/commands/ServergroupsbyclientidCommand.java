package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find server groups by client ID
 * 
 * @author Iceac
 */
public class ServergroupsbyclientidCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupsbyclientidCommand() {
		super(COMMAND_SERVERGROUPSBYCLIENTID);
	}
}