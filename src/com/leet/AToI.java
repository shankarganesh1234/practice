package com.leet;

public class AToI {

	public static void main(String[] args) {

		System.out.println(myAtoi("   -45"));
	}

	public static int myAtoi(String str) {

		if (str == null || str.isEmpty() || str.trim().isEmpty())
			return 0;

		String trimmed = trimmed(str);

		if (!isValid(trimmed))
			return 0;

		boolean isNegative = isNegative(trimmed);

		String numStr = extractNumber(trimmed);

		int i = numStr.length() - 1;
		int num = 0;
		int j = 0;

		while (i >= 0) {

			char c = numStr.charAt(i);
			int n = (int) c;
			if (n >= 48 && n <= 57) {
				num = num + (int) ((n - 48) * Math.pow(10, j));
			}
			i--;
			j++;
		}

		if (isNegative)
			num = -num;

		return num;
	}

	private static String trimmed(String str) {
		return str.trim();
	}

	private static boolean isValid(String str) {

		int firstCharInt = str.charAt(0);

		if (firstCharInt == 43 || firstCharInt == 45 || (firstCharInt >= 48 && firstCharInt <= 57)) {
			return true;
		}
		return false;
	}

	private static boolean isNegative(String str) {
		int firstCharInt = str.charAt(0);
		return firstCharInt == 45;
	}

	private static String extractNumber(String str) {

		StringBuilder s = new StringBuilder();
		int index = 0;
		if (str.charAt(0) == 43 || str.charAt(0) == 45)
			index = 1;

		for (; index < str.length(); index++) {
			char character = str.charAt(index);
			int c = character;

			if (c >= 48 && c <= 57)
				s.append(character);
			else
				break;
		}
		return s.toString();
	}

}
