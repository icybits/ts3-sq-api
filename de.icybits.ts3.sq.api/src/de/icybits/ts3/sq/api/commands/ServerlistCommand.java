package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Displays a list of virtual servers including their ID, status, number of
 * clients online, etc. If you're using the -all option, the server will list
 * all virtual servers stored in the database. This can be useful when multiple
 * server instances with different machine IDs are using the same database. The
 * machine ID is used to identify the server instance a virtual server is
 * associated with.
 * <p>
 * The status of a virtual server can be either online, offline, deploy running,
 * booting up, shutting down and virtual online. While most of them are
 * self-explanatory, virtual online is a bit more complicated.
 * <p>
 * Please note that whenever you select a virtual server which is currently
 * stopped, it will be started in virtual mode which means you are able to
 * change its configuration, create channels or change permissions, but no
 * regular TeamSpeak 3 Client can connect. As soon as the last ServerQuery
 * client deselects the virtual server, its status will be changed back to
 * offline.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServerlistCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_VIRTUALSERVER_LIST};

	/**
	 * Displays a list of virtual servers including their ID, status, number of
	 * clients online, etc. If you're using the -all option, the server will
	 * list all virtual servers stored in the database. This can be useful when
	 * multiple server instances with different machine IDs are using the same
	 * database. The machine ID is used to identify the server instance a
	 * virtual server is associated with.
	 * <p>
	 * The status of a virtual server can be either online, offline, deploy
	 * running, booting up, shutting down and virtual online. While most of them
	 * are self-explanatory, virtual online is a bit more complicated.
	 * <p>
	 * Please note that whenever you select a virtual server which is currently
	 * stopped, it will be started in virtual mode which means you are able to
	 * change its configuration, create channels or change permissions, but no
	 * regular TeamSpeak 3 Client can connect. As soon as the last ServerQuery
	 * client deselects the virtual server, its status will be changed back to
	 * offline.
	 */
	public ServerlistCommand() {
		super(COMMAND_SERVERLIST);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory#createResponse(
	 * java .lang.String)
	 */
	@Override
	public Response createResponse(String response)
			throws ParseResponseException {
		return new Response(response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.icybits.ts3.sq.api.interfaces.ITS3Permission#getPermissions()
	 */
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}

	/**
	 * Toggle the option "all" on or off.
	 * 
	 * @return This command.
	 */
	public ServerlistCommand toggleAll() {
		toggleOption(ALL);
		return this;
	}

	/**
	 * Toggle the option "onlyoffline" on or off.
	 * 
	 * @return This command.
	 */
	public ServerlistCommand toggleOnlyOffline() {
		toggleOption(ONLYOFFLINE);
		return this;
	}

	/**
	 * Toggle the option "short" on or off.
	 * 
	 * @return This command.
	 */
	public ServerlistCommand toggleShort() {
		toggleOption(SHORT);
		return this;
	}

	/**
	 * Toggle the option "uid" on or off.
	 * 
	 * @return This command.
	 */
	public ServerlistCommand toggleUID() {
		toggleOption(UID);
		return this;
	}
}
