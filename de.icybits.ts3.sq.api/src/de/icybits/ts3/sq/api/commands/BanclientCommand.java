package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
/**
 * ban a client
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class BanclientCommand extends Command 
		implements 
			ITS3CommandNames,
			ITS3ParameterNames {
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.I_CLIENT_BAN_POWER,
			Permissions.I_CLIENT_NEEDED_BAN_POWER
	};
	
	public BanclientCommand(int clid){
		super(COMMAND_BANCLIENT);
		setParameter(new ParameterIntegerValue(CLID, clid));
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
	
	public BanclientCommand setBanTime(int miliseconds){
		setParameter(new ParameterIntegerValue(TIME, miliseconds));
		return this;
	}
	
	public BanclientCommand setBanReason(String reason){
		setParameter(new ParameterStringValue(BANREASON, reason));
		return this;
	}
	
}