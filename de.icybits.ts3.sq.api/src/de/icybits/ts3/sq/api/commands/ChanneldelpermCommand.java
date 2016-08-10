package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
import de.icybits.ts3.sq.api.enums.PermissionMode;
import de.icybits.ts3.sq.api.enums.Permissions;
/**
 * remove permission from channel
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class ChanneldelpermCommand extends Command 
		implements 
			ITS3CommandNames,
			ITS3ParameterNames {
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.I_GROUP_MODIFY_POWER,
			Permissions.I_GROUP_NEEDED_MODIFY_POWER,
			Permissions.I_PERMISSION_MODIFY_POWER
	};
	
	public ChanneldelpermCommand(int cid, PermissionMode mode, Permissions perm) {
		super(COMMAND_CHANNELDELPERM);
		setParameter(new ParameterIntegerValue(CID, cid));
		delPermisson(mode, perm);
	}
	
	private void delPermisson(PermissionMode mode, Permissions perm){
		switch(mode){
			case PERMID:
				setParameter(new ParameterIntegerValue(PERMID, perm.getId()));
				break;
			case PERMSID:
				setParameter(new ParameterIntegerValue(PERMSID, perm.toString()));
				break;
			case BOTH:
				setParameter(new ParameterIntegerValue(PERMID, perm.getId()));
				setParameter(new ParameterIntegerValue(PERMSID, perm.toString()));
				break;
		}
	}
	
	public ChanneldelpermCommand deletePermission(PermissionMode mode, Permissions perm){
		delPermisson(mode, perm);
		return this;
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}