package de.icybits.ts3.sq.api.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import de.icybits.ts3.sq.api.basic.interfaces.ICommand;
import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.enums.Permissions;

/**
 * @author iceac_000
 */
public class Command implements ICommand {

	private static final Permissions[] EMPTY_PERMISSIONS = new Permissions[0];

	protected String name;
	protected Set<String> optionList = new HashSet<String>();
	protected HashMap<String, IParameter<?>> parameterMap = new HashMap<String, IParameter<?>>();

	public Command(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof Command)) {
			return false;
		}
		Command otherCommand = (Command) object;
		if (!name.equals(otherCommand.name)) {
			return false;
		}
		return parameterMap.equals(otherCommand.parameterMap) && optionList.equals(otherCommand.optionList);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Set<String> getOptions() {
		return new HashSet<String>(optionList);
	}

	@Override
	public Set<IParameter<?>> getParameters() {
		return new HashSet<IParameter<?>>(parameterMap.values());
	}

	@Override
	public Permissions[] getPermissions() {
		return EMPTY_PERMISSIONS;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + parameterMap.hashCode() + optionList.hashCode();
	}

	protected void setParameter(IParameter<?> parameter) {
		if (parameter != null) {
			if (parameter.getValue() != null) {
				parameterMap.put(parameter.getName(), parameter);
			} else {
				parameterMap.remove(parameter.getName());
			}
		}
	}

	protected void toggleOption(String option) {
		if (optionList.contains(option)) {
			optionList.remove(option);
		} else {
			optionList.add(option);
		}
	}
}
