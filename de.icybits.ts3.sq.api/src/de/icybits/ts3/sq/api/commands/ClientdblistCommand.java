package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list known client UIDs
 * 
 * @author Iceac
 */
public class ClientdblistCommand extends Command implements ITS3CommandNames {
	public ClientdblistCommand() {
		super(COMMAND_CLIENTDBLIST);
	}
}