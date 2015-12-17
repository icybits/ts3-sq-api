package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list privilege keys (tokens) available
 * 
 * @author Iceac
 */
public class TokenlistCommand extends Command implements ITS3CommandNames {
	public TokenlistCommand() {
		super(COMMAND_TOKENLIST);
	}
}