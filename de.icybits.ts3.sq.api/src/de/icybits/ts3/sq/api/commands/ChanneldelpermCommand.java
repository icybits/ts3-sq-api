package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * remove permission from channel
 * 
 * @author Iceac
 */
public class ChanneldelpermCommand extends Command implements ITS3CommandNames {
	public ChanneldelpermCommand() {
		super(COMMAND_CHANNELDELPERM);
	}
}