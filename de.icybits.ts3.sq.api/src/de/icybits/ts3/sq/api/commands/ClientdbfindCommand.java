package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client database ID by nickname or UID
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientdbfindCommand extends Command implements ITS3CommandNames {
	public ClientdbfindCommand() {
		super(COMMAND_CLIENTDBFIND);
	}
}