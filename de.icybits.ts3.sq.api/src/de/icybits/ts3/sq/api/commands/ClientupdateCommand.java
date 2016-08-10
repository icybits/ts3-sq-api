package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * set own properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientupdateCommand extends Command implements ITS3CommandNames {
	public ClientupdateCommand() {
		super(COMMAND_CLIENTUPDATE);
	}
}