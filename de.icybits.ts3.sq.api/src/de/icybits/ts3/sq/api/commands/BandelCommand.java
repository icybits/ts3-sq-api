package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete a ban rule
 * 
 * @author Iceac
 */
public class BandelCommand extends Command implements ITS3CommandNames {
	public BandelCommand() {
		super(COMMAND_BANDEL);
	}
}