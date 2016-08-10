package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * Creates a new server group using the name specified with name and displays
 * its ID. The optional type parameter can be used to create ServerQuery groups
 * and template groups. For detailed information, see {@link ITS3Definitions}.
 *
 * @author Alias: Iceac Sarutobi
 */
public class ServergroupaddCommand extends Command
		implements
			ITS3CommandNames,
			ITS3Definitions,
			ITS3ParameterNames,
			IResponseFactory<Response> {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_SERVERGROUP_CREATE};

	/**
	 * Creates a new server group using the name specified with name and
	 * displays its ID. The optional type parameter can be used to create
	 * ServerQuery groups and template groups. For detailed information, see
	 * {@link ITS3Definitions}.
	 * 
	 * @param groupName
	 *            the server group name
	 */
	public ServergroupaddCommand(String groupName) {
		super(COMMAND_SERVERGROUPADD);
		setParameter(new ParameterStringValue(NAME, groupName));
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
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeTemplate</td>
	 * <td>0</td>
	 * <td>template group (used for new virtual servers)</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeRegular</td>
	 * <td>1</td>
	 * <td>regular group (used for regular clients)</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeQuery</td>
	 * <td>2</td>
	 * <td>global query group (used for ServerQuery clients)</td>
	 * </tr>
	 * </table>
	 * 
	 * @param types
	 *            the permission group database types
	 * @return This command.
	 */
	public ServergroupaddCommand setGroupDBType(
			PermissionGroupDatabaseTypes types) {
		if (types != null) {
			setParameter(new ParameterIntegerValue(TYPE, types.getNumber()));
		} else {
			setParameter(new ParameterIntegerValue(TYPE));
		}
		return this;
	}
}
