package de.icybits.ts3.sq.api.basic.parameter;

import de.icybits.ts3.sq.api.basic.Parameter;

/**
 * @author Alias: Iceac Sarutobi
 */
public class ParameterBooleanValue extends Parameter<Boolean> {

	public ParameterBooleanValue(String name, Boolean value) {
		super(name, value);
	}

	public ParameterBooleanValue(String name, String value) {
		super(name, (Integer.parseInt(value) > 0 ? true : false));
	}

}
