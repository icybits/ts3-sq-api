package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.PermissionMode;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

//import static [import].ID
/**
 * assign permission to channel
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class ChanneladdpermCommand extends Command 
		implements 
			ITS3CommandNames, 
			ITS3ParameterNames{
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.I_GROUP_MODIFY_POWER,
			Permissions.I_GROUP_NEEDED_MODIFY_POWER,
			Permissions.I_PERMISSION_MODIFY_POWER
	};
	
	public ChanneladdpermCommand(int cid, PermissionMode mode, Permissions perm, int permvalue) {
		super(COMMAND_CHANNELADDPERM);
		setParameter(new ParameterIntegerValue(CID, cid));
		setParameter(new ParameterIntegerValue(PERMVALUE, permvalue));
		
		switch (mode) {
		case PERMID: 
			setParameter(new ParameterIntegerValue(PERMID, perm.getId()));
			break;
		case PERMSID: 
			setParameter(new ParameterStringValue(PERMSID, perm.toString()));
			break;
		case BOTH:
			setParameter(new ParameterIntegerValue(PERMID, perm.getId()));
			setParameter(new ParameterStringValue(PERMSID, perm.toString()));
			break;
		}
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
	
}