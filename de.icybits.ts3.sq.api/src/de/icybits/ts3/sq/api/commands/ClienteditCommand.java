package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * change client properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClienteditCommand extends Command implements ITS3CommandNames {
	public ClienteditCommand() {
		super(COMMAND_CLIENTEDIT);
	}
}