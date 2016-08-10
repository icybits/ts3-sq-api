package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
/**
 * create a ban rule
 * 
 * @author Iceac
 * @author Saali
 */
public class BanaddCommand extends Command 
		implements 
			ITS3CommandNames, 
			ITS3ParameterNames {
	
	public enum Mode { IP, NAME, UID };
	
	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.I_CLIENT_BAN_POWER};
	
	public BanaddCommand(Mode mode, String value){
		super(COMMAND_BANADD);
		switch(mode){
			case IP: 
				setParameter(new ParameterStringValue(IP, value));
				break;
			case NAME: 
				setParameter(new ParameterStringValue(NAME, value));
				break;
			case UID: 
				setParameter(new ParameterStringValue(UID, value));	
				break;
		}
	}
	
	@Override
	public Permissions[] getPermissions(){
		return PERMISSIONS;
	};
	
	public BanaddCommand setBanName(String name){
		setParameter(new ParameterStringValue(NAME, name));
		return this;
	}
	
	public BanaddCommand setBanIp(String ip){
		setParameter(new ParameterStringValue(IP, ip));
		return this;
	}
	
	public BanaddCommand setBanUid(String uid){
		setParameter(new ParameterStringValue(UID, uid));
		return this;
	}
	
	public BanaddCommand setBanReason(String reason){
		setParameter(new ParameterStringValue(BANREASON, reason));
		return this;
	}
	
	public BanaddCommand setBanTime(int miliseconds){
		setParameter(new ParameterIntegerValue(TIME, miliseconds));
		return this;
	}
	
}