package de.icybits.ts3.sq.api.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import de.icybits.ts3.sq.api.exception.Assert;

public class Util {

	public static String fromTS3String(String ts3String) {
		String string = ts3String;
		string = string.replace("\\\\", "\\");
		string = string.replace("\\/", "/");
		string = string.replace("\\s", " ");
		string = string.replace("\\p", "|");
		string = string.replace("\\a", "\007");
		string = string.replace("\\b", "\b");
		string = string.replace("\\f", "\f");
		string = string.replace("\\n", "\n");
		string = string.replace("\\r", "\r");
		string = string.replace("\\t", "\t");
		string = string.replace("\\v", "\011");
		return string;
	}

	public static List<BigInteger> stringToBigIntegerList(String value, String separator) {
		Assert.isNotNull(value);
		Assert.isNotNull(separator);
		String[] stringSplit = value.split(separator);
		List<BigInteger> list = new ArrayList<BigInteger>(stringSplit.length);
		for (int i = 0; i < stringSplit.length; i++) {
			list.add(new BigInteger(stringSplit[i]));
		}
		return list;
	}

	public static List<Integer> stringToIntegerList(String value, String separator) {
		Assert.isNotNull(value);
		Assert.isNotNull(separator);
		String[] stringSplit = value.split(separator);
		List<Integer> list = new ArrayList<Integer>(stringSplit.length);
		for (int i = 0; i < stringSplit.length; i++) {
			list.add(new Integer(stringSplit[i]));
		}
		return list;
	}

	public static List<Long> stringToLongList(String value, String separator) {
		Assert.isNotNull(value);
		Assert.isNotNull(separator);
		String[] stringSplit = value.split(separator);
		List<Long> list = new ArrayList<Long>(stringSplit.length);
		for (int i = 0; i < stringSplit.length; i++) {
			list.add(new Long(stringSplit[i]));
		}
		return list;
	}

	public static String toTS3String(String string) {
		String ts3String = string;
		ts3String = ts3String.replace("\\", "\\\\");
		ts3String = ts3String.replace("/", "\\/");
		ts3String = ts3String.replace(" ", "\\s");
		ts3String = ts3String.replace("|", "\\p");
		ts3String = ts3String.replace("\007", "\\a");
		ts3String = ts3String.replace("\b", "\\b");
		ts3String = ts3String.replace("\f", "\\f");
		ts3String = ts3String.replace("\n", "\\n");
		ts3String = ts3String.replace("\r", "\\r");
		ts3String = ts3String.replace("\t", "\\t");
		ts3String = ts3String.replace("\011", "\\v");
		return ts3String;
	}
}
