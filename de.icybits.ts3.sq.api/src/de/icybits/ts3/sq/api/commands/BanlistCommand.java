package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list ban rules on a virtual server
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class BanlistCommand extends Command 
		implements 
			ITS3CommandNames, 
			IResponseFactory<Response> {
	
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.B_CLIENT_BAN_LIST
	};
	
	public BanlistCommand() {
		super(COMMAND_BANLIST);
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}

	@Override
	public Response createResponse(String response) 
			throws ParseResponseException {
		return new Response(response);
	}
}