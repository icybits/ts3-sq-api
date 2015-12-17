package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponseFactory;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.exception.ParseResponseException;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;

/**
 * Provides information about ServerQuery commands. Used without parameters,
 * help lists and briefly describes every command.
 *
 * @author iceac_000
 */
public class HelpCommand extends Command
		implements
			IResponseFactory<Response>,
			ITS3CommandNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_HELP_VIEW};

	/**
	 * Provides information about ServerQuery commands. Used without parameters,
	 * help lists and briefly describes every command.
	 */
	public HelpCommand() {
		super(COMMAND_HELP);
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
	 * @param commandName
	 *            the command you need information from
	 * @return <code>this</code> HelpCommand
	 */
	public HelpCommand setCommandName(String commandName) {
		setParameter(new ParameterStringValue(commandName, null));
		return this;
	}
}
