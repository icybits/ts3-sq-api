package de.icybits.ts3.sq.api.basic.parameter;

import de.icybits.ts3.sq.api.basic.Parameter;

/**
 * @author Alias: Iceac Sarutobi
 */
public class ParameterLongValue extends Parameter<Long> {

	public ParameterLongValue(String name, Long value) {
		super(name, value);
	}

	public ParameterLongValue(String name, String value) {
		super(name, new Long(value));
	}
}
