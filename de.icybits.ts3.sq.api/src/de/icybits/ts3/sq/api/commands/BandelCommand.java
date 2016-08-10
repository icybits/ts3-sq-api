package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
/**
 * delete a ban rule
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class BandelCommand extends Command 
		implements
			ITS3CommandNames, 
			ITS3ParameterNames {
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.B_CLIENT_BAN_DELETE,
			Permissions.B_CLIENT_BAN_DELETE_OWN
	};
	
	public BandelCommand(int banId){
		super(COMMAND_BANDEL);
		setParameter(new ParameterIntegerValue(BANID, banId));
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}