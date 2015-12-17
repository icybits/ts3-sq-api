package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list client specific permissions
 * 
 * @author Iceac
 */
public class ClientpermlistCommand extends Command implements ITS3CommandNames {
	public ClientpermlistCommand() {
		super(COMMAND_CLIENTPERMLIST);
	}
}