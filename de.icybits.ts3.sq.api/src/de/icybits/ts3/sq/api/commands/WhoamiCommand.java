package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display current session info
 * 
 * @author Iceac
 */
public class WhoamiCommand extends Command implements ITS3CommandNames {
	public WhoamiCommand() {
		super(COMMAND_WHOAMI);
	}
}