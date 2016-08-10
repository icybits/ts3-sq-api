package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterBooleanValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
/**
 * delete a channel
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class ChanneldeleteCommand extends Command 
		implements 
			ITS3CommandNames,
			ITS3ParameterNames{
	
	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_CHANNEL_DELETE_PERMANENT,
			Permissions.B_CHANNEL_DELETE_SEMI_PERMANENT,
			Permissions.B_CHANNEL_DELETE_TEMPORARY,
			Permissions.B_CHANNEL_DELETE_FLAG_FORCE
	};
	
	public ChanneldeleteCommand(int cid, boolean force) {
		super(COMMAND_CHANNELDELETE);
		setParameter(new ParameterIntegerValue(CID, cid));
		setParameter(new ParameterBooleanValue(FORCE, force));
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}