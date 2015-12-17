package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list ban rules on a virtual server
 * 
 * @author Iceac
 */
public class BanlistCommand extends Command implements ITS3CommandNames {
	public BanlistCommand() {
		super(COMMAND_BANLIST);
	}
}