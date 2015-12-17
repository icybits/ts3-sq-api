package de.icybits.ts3.sq.api.commands;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.exception.Assert;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * @author iceac_000
 */
public class LoginCommand extends Command
		implements
			ITS3CommandNames,
			ITS3ParameterNames {

	// private static final String[] PERMISSIONS = new String[] {
	// B_SERVERQUERY_LOGIN }; ? just related permission
	/**
	 * @param name
	 */
	public LoginCommand(String username, String password) {
		super(COMMAND_LOGIN);
		Assert.isNotEmptyString(username,
				"username must not be null or empty String");
		Assert.isNotEmptyString(password,
				"password must not be null or empty String");
		setParameter(new ParameterStringValue(CLIENT_LOGIN_NAME, username));
		setParameter(new ParameterStringValue(CLIENT_LOGIN_PASSWORD, password));
	}
}
