package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list permissions available
 * 
 * @author Alias: Iceac Sarutobi
 */
public class PermissionlistCommand extends Command implements ITS3CommandNames {
	public PermissionlistCommand() {
		super(COMMAND_PERMISSIONLIST);
	}
}