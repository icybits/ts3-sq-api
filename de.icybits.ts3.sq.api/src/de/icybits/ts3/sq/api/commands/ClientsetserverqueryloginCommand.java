package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * set own login credentials
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientsetserverqueryloginCommand extends Command
		implements
			ITS3CommandNames {
	public ClientsetserverqueryloginCommand() {
		super(COMMAND_CLIENTSETSERVERQUERYLOGIN);
	}
}