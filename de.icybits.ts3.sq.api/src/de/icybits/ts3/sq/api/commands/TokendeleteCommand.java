package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete a privilege key (token)
 * 
 * @author Alias: Iceac Sarutobi
 */
public class TokendeleteCommand extends Command implements ITS3CommandNames {
	public TokendeleteCommand() {
		super(COMMAND_TOKENDELETE);
	}
}