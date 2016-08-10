package de.icybits.ts3.sq.api.basic.parameter;

import java.math.BigInteger;

import de.icybits.ts3.sq.api.basic.Parameter;

/**
 * @author Alias: Iceac Sarutobi
 */
public class ParameterBigIntegerValue extends Parameter<BigInteger> {

	public ParameterBigIntegerValue(String name, BigInteger value) {
		super(name, value);
	}

	public ParameterBigIntegerValue(String name, String value) {
		super(name, new BigInteger(value));
	}
}
