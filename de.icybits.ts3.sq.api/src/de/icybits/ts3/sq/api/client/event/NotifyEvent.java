package de.icybits.ts3.sq.api.client.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.basic.parameter.ParameterBooleanValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValueList;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.client.event.interfaces.INotifyEvent;
import de.icybits.ts3.sq.api.client.event.interfaces.INotifyTypes;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;

/**
 * @author iceac_000
 */
public class NotifyEvent implements INotifyEvent, ITS3ParameterNames, INotifyTypes {

	private final HashMap<String, IParameter<?>> parameters = new HashMap<String, IParameter<?>>();
	private final int type;

	public NotifyEvent(int type) {
		this.type = type;
	}

	public boolean addParameter(IParameter<?> parameter) {
		return parameters.put(parameter.getName(), parameter) == null ? false : true;
	}

	protected Boolean getBooleanValue(String name) {
		IParameter<?> parameter = getParameter(name);
		if (parameter instanceof ParameterBooleanValue) {
			return ((ParameterBooleanValue) parameter).getValue();
		} else if (parameter == null) {
			return null;
		} else {
			throw new IllegalArgumentException("Is not an ParameterBooleanValue");
		}
	}

	protected Integer getIntegerValue(String name) {
		IParameter<?> parameter = getParameter(name);
		if (parameter instanceof ParameterIntegerValue) {
			return ((ParameterIntegerValue) parameter).getValue();
		} else if (parameter == null) {
			return null;
		} else {
			throw new IllegalArgumentException("Is not an ParameterIntegerValue");
		}
	}

	protected List<Integer> getIntegerValueSet(String name) {
		IParameter<?> parameter = getParameter(name);
		if (parameter instanceof ParameterIntegerValueList) {
			return ((ParameterIntegerValueList) parameter).getValue();
		} else if (parameter == null) {
			return null;
		} else {
			throw new IllegalArgumentException("Is not an ParameterIntegerSetValue");
		}
	}

	public IParameter<?> getParameter(String name) {
		return parameters.get(name);
	}

	public List<IParameter<?>> getParameterList() {
		return new ArrayList<IParameter<?>>(parameters.values());
	}

	protected String getStringValue(String name) {
		IParameter<?> parameter = getParameter(name);
		if (parameter instanceof ParameterStringValue) {
			return ((ParameterStringValue) parameter).getValue();
		} else if (parameter == null) {
			return null;
		} else {
			throw new IllegalArgumentException("Is not an ParameterStringValue");
		}
	}

	@Override
	public int getType() {
		return type;
	}

	public boolean removeParameter(String name) {
		return parameters.remove(name) == null ? false : true;
	}
}
