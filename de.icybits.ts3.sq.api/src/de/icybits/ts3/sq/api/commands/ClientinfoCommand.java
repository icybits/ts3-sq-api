package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display client properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientinfoCommand extends Command implements ITS3CommandNames {
	public ClientinfoCommand() {
		super(COMMAND_CLIENTINFO);
	}
}