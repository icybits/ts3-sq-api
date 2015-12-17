package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete client database properties
 * 
 * @author Iceac
 */
public class ClientdbdeleteCommand extends Command implements ITS3CommandNames {
	public ClientdbdeleteCommand() {
		super(COMMAND_CLIENTDBDELETE);
	}
}