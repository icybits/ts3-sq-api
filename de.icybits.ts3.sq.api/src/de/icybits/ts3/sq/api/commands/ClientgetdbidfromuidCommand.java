package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client database ID by UID
 * 
 * @author Iceac
 */
public class ClientgetdbidfromuidCommand extends Command
		implements
			ITS3CommandNames {
	public ClientgetdbidfromuidCommand() {
		super(COMMAND_CLIENTGETDBIDFROMUID);
	}
}