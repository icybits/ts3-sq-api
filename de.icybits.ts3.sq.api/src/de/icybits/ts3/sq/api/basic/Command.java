package de.icybits.ts3.sq.api.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.icybits.ts3.sq.api.basic.interfaces.ICommand;
import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.enums.Permissions;

/**
 * @author iceac_000
 */
public class Command implements ICommand {

	private static final Permissions[] EMPTY_PERMISSIONS = new Permissions[0];
	
	protected String name;
	protected List<String> optionList = new ArrayList<String>();
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
	public List<String> getOptionList() {
		return new ArrayList<String>(optionList);
	}

	@Override
	public List<IParameter<?>> getParameterList() {
		return new ArrayList<IParameter<?>>(parameterMap.values());
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
			parameterMap.put(parameter.getName(), parameter);
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
