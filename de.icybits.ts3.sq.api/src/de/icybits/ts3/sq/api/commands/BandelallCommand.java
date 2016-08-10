package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * delete all ban rules
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class BandelallCommand extends Command 
		implements 
			ITS3CommandNames {
	
	private static final Permissions[] PERMISSIONS = new Permissions[] { 
			Permissions.B_CLIENT_BAN_DELETE
	};
	
	public BandelallCommand() {
		super(COMMAND_BANDELALL);
	}

	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}