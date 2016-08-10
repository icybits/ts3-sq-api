package de.icybits.ts3.sq.api.basic;

import de.icybits.ts3.sq.api.basic.interfaces.IParameter;

/**
 * @author Alias: Iceac Sarutobi
 */
public class Parameter<VALUE> implements IParameter<VALUE> {

	protected String name;
	protected VALUE value;

	public Parameter(String name, VALUE value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public VALUE getValue() {
		return value;
	}
}
