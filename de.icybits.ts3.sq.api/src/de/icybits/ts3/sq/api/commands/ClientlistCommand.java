package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list clients online on a virtual server
 * 
 * @author Iceac
 */
public class ClientlistCommand extends Command implements ITS3CommandNames {
	public ClientlistCommand() {
		super(COMMAND_CLIENTLIST);
	}
}