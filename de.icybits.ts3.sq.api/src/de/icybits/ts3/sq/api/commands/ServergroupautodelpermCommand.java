package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * globally remove permissions from server group
 * 
 * @author Iceac
 */
public class ServergroupautodelpermCommand extends Command
		implements
			ITS3CommandNames {
	public ServergroupautodelpermCommand() {
		super(COMMAND_SERVERGROUPAUTODELPERM);
	}
}