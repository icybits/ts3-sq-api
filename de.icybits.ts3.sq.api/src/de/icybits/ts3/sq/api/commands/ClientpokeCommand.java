package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * poke a client
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientpokeCommand extends Command implements ITS3CommandNames {
	public ClientpokeCommand() {
		super(COMMAND_CLIENTPOKE);
	}
}