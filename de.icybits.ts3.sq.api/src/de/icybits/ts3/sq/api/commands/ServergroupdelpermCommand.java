package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove permissions from server group
 * 
 * @author Iceac
 */
public class ServergroupdelpermCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupdelpermCommand() {
		super(COMMAND_SERVERGROUPDELPERM);
	}
}