package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete an existing privilege key
 * 
 * @author Alias: Iceac Sarutobi
 */
public class PrivilegekeydeleteCommand extends Command
		implements
			ITS3CommandNames {
	public PrivilegekeydeleteCommand() {
		super(COMMAND_PRIVILEGEKEYDELETE);
	}
}