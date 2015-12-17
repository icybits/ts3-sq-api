package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a ban rule
 * 
 * @author Iceac
 */
public class BanaddCommand extends Command implements ITS3CommandNames {
	public BanaddCommand() {
		super(COMMAND_BANADD);
	}
}