package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete all ban rules
 * 
 * @author Iceac
 */
public class BandelallCommand extends Command implements ITS3CommandNames {
	public BandelallCommand() {
		super(COMMAND_BANDELALL);
	}
}