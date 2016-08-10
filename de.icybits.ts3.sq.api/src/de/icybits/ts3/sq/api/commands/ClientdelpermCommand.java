package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove permission from client
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientdelpermCommand extends Command implements ITS3CommandNames {
	public ClientdelpermCommand() {
		super(COMMAND_CLIENTDELPERM);
	}
}