package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * kick a client
 * 
 * @author Iceac
 */
public class ClientkickCommand extends Command implements ITS3CommandNames {
	public ClientkickCommand() {
		super(COMMAND_CLIENTKICK);
	}
}