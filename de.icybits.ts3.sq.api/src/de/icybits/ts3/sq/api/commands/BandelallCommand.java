package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete all ban rules
 * 
 * @author Alias: Iceac Sarutobi
 */
public class BandelallCommand extends Command implements ITS3CommandNames {
	public BandelallCommand() {
		super(COMMAND_BANDELALL);
	}
}