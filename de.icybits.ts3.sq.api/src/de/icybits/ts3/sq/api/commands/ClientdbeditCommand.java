package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * change client database properties
 * 
 * @author Iceac
 */
public class ClientdbeditCommand extends Command implements ITS3CommandNames {
	public ClientdbeditCommand() {
		super(COMMAND_CLIENTDBEDIT);
	}
}