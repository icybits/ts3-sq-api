package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * ban a client
 * 
 * @author Alias: Iceac Sarutobi
 */
public class BanclientCommand extends Command implements ITS3CommandNames {
	public BanclientCommand() {
		super(COMMAND_BANCLIENT);
	}
}