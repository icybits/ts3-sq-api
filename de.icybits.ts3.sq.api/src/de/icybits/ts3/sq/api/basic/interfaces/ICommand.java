package de.icybits.ts3.sq.api.basic.interfaces;

import java.util.Set;

import de.icybits.ts3.sq.api.enums.Permissions;

/**
 * The ICommand interface defines the getter methods for the Command name the command parameters and the command options. A command parameters is a name, value
 * pair. A command option is a single word.
 *
 * @author Alias: Iceac Sarutobi
 */
public interface ICommand {

	public String getName();

	public Set<String> getOptions();

	public Set<IParameter<?>> getParameters();

	public Permissions[] getPermissions();
}
