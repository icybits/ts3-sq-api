package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * assign permission to client
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientaddpermCommand extends Command implements ITS3CommandNames {
	public ClientaddpermCommand() {
		super(COMMAND_CLIENTADDPERM);
	}
}