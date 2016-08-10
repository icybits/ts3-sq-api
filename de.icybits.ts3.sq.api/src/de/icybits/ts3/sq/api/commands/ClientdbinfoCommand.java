package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display client database properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientdbinfoCommand extends Command implements ITS3CommandNames {
	public ClientdbinfoCommand() {
		super(COMMAND_CLIENTDBINFO);
	}
}