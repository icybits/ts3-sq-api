package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * display custom client properties
 * 
 * @author Iceac
 */
public class CustominfoCommand extends Command implements ITS3CommandNames {
	public CustominfoCommand() {
		super(COMMAND_CUSTOMINFO);
	}
}