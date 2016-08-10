package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * create a privilege key (token)
 * 
 * @author Alias: Iceac Sarutobi
 */
public class TokenaddCommand extends Command implements ITS3CommandNames {
	public TokenaddCommand() {
		super(COMMAND_TOKENADD);
	}
}