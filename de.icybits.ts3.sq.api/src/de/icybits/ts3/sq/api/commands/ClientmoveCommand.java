package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * move a client
 * 
 * @author Iceac
 */
public class ClientmoveCommand extends Command implements ITS3CommandNames {
	public ClientmoveCommand() {
		super(COMMAND_CLIENTMOVE);
	}
}