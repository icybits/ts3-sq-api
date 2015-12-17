package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client by nickname
 * 
 * @author Iceac
 */
public class ClientfindCommand extends Command implements ITS3CommandNames {
	public ClientfindCommand() {
		super(COMMAND_CLIENTFIND);
	}
}