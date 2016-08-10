package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * use a privilege key (token)
 * 
 * @author Alias: Iceac Sarutobi
 */
public class TokenuseCommand extends Command implements ITS3CommandNames {
	public TokenuseCommand() {
		super(COMMAND_TOKENUSE);
	}
}