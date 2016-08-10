package de.icybits.ts3.sq.api.basic.parameter;

import de.icybits.ts3.sq.api.basic.Parameter;

/**
 * @author Alias: Iceac Sarutobi
 */
public class ParameterIntegerValue extends Parameter<Integer> {

	public ParameterIntegerValue(String name, Integer value) {
		super(name, value);
	}

	public ParameterIntegerValue(String name, String value) {
		super(name, new Integer(value));
	}

	public ParameterIntegerValue(String name) {
		super(name, null);
	}
}
