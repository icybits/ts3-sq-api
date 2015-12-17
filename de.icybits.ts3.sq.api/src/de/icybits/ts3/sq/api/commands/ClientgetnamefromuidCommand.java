package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client nickname by UID
 * 
 * @author Iceac
 */
public class ClientgetnamefromuidCommand extends Command
		implements
			ITS3CommandNames {
	public ClientgetnamefromuidCommand() {
		super(COMMAND_CLIENTGETNAMEFROMUID);
	}
}