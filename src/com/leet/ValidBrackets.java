package com.leet;

public class ValidBrackets {

	public static void main(String[] args) {
		System.out.println(isValid("([]{}())"));
	}

	public static boolean isValid(String s) {

		

		return check(s);

	}

	public static boolean check(String s) {
		int mid = (s.length() - 1) / 2;

		int i = mid;
		int j = mid + 1;

		while (i >= 0 && j < s.length()) {

			if ((s.charAt(i) == 40 && s.charAt(j) == 41) || (s.charAt(i) == 91 && s.charAt(j) == 93)
					|| (s.charAt(i) == 123 && s.charAt(j) == 125)) {
				i--;
				j++;
				continue;
			} else {
				return false;
			}
		}

		return true;
	}

}
