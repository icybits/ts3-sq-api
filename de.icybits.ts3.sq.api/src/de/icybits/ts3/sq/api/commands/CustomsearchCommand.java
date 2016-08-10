package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * search for custom client properties
 * 
 * @author Alias: Iceac Sarutobi
 */
public class CustomsearchCommand extends Command implements ITS3CommandNames {
	public CustomsearchCommand() {
		super(COMMAND_CUSTOMSEARCH);
	}
}