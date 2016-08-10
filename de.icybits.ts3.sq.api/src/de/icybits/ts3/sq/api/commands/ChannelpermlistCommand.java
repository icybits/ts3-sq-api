package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list channel specific permissions
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ChannelpermlistCommand extends Command
		implements
			ITS3CommandNames {
	public ChannelpermlistCommand() {
		super(COMMAND_CHANNELPERMLIST);
	}
}