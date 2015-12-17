package de.icybits.ts3.sq.api.exception;

public class Assert {

	public static void isNotEmptyArray(boolean[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(boolean[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(byte[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(byte[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(char[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(char[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(double[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(double[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(float[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(float[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(int[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(int[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(long[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(long[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(Object[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(Object[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyArray(short[] objects) {
		isNotEmptyArray(objects, "Array must not be null!");
	}

	public static void isNotEmptyArray(short[] objects, String message) {
		if (objects.length < 1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotEmptyString(String string) {
		isNotEmptyString(string, "String must not be null or empty String!");
	}

	public static void isNotEmptyString(String string, String message) {
		if (string == null || string.isEmpty()) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotNegative(int i) {
		isNotNegative(i, "Integer must be not negative!");
	}

	public static void isNotNegative(int i, String message) {
		if (i < 0) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void isNotNull(Object object) {
		isNotNull(object, "Argument must not be null!");
	}

	public static void isNotNull(Object object, String message) {
		if (object == null) {
			throw new NullPointerException(message);
		}
	}
}
