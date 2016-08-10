package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
/**
 * list channel-client specific permissions
 * 
 * @author Iceac
 * @author Saali
 */
public class ChannelclientpermlistCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames,
			IResponseFactory<Response>{
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.B_VIRTUALSERVER_CHANNEL_PERMISSION_LIST
	};
	
	public ChannelclientpermlistCommand(int cid, int cldbid) {
		super(COMMAND_CHANNELCLIENTPERMLIST);
		setParameter(new ParameterIntegerValue(CID, cid));
		setParameter(new ParameterIntegerValue(CLDBID, cldbid));
	}
	
	@Override
	public Response createResponse(String response) 
			throws ParseResponseException {
		return new Response(response);
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}