package de.icybits.ts3.sq.api.basic.parameter;

import java.util.List;

import de.icybits.ts3.sq.api.basic.Parameter;
import de.icybits.ts3.sq.api.util.Util;

/**
 * @author Alias: Iceac Sarutobi
 */
public class ParameterIntegerValueList extends Parameter<List<Integer>> {

	public ParameterIntegerValueList(String name, List<Integer> value) {
		super(name, value);
	}

	public ParameterIntegerValueList(String name, String value, String separator) {
		super(name, Util.stringToIntegerList(value, separator));
	}
}
