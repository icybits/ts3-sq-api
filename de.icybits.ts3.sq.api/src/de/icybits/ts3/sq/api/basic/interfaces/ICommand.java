package de.icybits.ts3.sq.api.basic.interfaces;

import java.util.List;

import de.icybits.ts3.sq.api.enums.Permissions;

/**
 * The ICommand interface defines the getter methods for the Command name the
 * command parameters and the command options. A command parameters is a name,
 * value pair. A command option is a single word.
 *
 * @author iceac_000
 */
public interface ICommand {

	public String getName();

	public List<String> getOptionList();

	public List<IParameter<?>> getParameterList();
	
	public Permissions[] getPermissions();
}
