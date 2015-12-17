package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client UID by client ID
 * 
 * @author Iceac
 */
public class ClientgetuidfromclidCommand extends Command
		implements
			ITS3CommandNames {
	public ClientgetuidfromclidCommand() {
		super(COMMAND_CLIENTGETUIDFROMCLID);
	}
}