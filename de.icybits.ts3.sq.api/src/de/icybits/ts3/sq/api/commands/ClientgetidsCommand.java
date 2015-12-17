package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * find client IDs by UID
 * 
 * @author Iceac
 */
public class ClientgetidsCommand extends Command implements ITS3CommandNames {
	public ClientgetidsCommand() {
		super(COMMAND_CLIENTGETIDS);
	}
}