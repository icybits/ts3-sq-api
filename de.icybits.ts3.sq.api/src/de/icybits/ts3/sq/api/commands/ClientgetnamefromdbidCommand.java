package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client nickname by database ID
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ClientgetnamefromdbidCommand extends Command
		implements
			ITS3CommandNames {
	public ClientgetnamefromdbidCommand() {
		super(COMMAND_CLIENTGETNAMEFROMDBID);
	}
}