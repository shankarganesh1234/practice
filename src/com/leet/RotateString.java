package com.leet;

public class RotateString {

	public static void main(String[] args) {

		RotateString r = new RotateString();
		System.out.println(r.rotateString("abcde", "cdeab"));
		System.out.println(r.rotateString("abcde", "abced"));

	}

	public boolean rotateString(String A, String B) {

		if(A == null || B == null)
			return false;
		
		if(A.equals(B))
			return true;
		
		int len = A.length();
		int i = 0;

		String temp = A;
		while (i < len) {

			temp = rotate(temp.toCharArray(), new StringBuilder());

			if (temp.equals(B))
				return true;

			i++;
		}

		return false;

	}

	private String rotate(char[] ca, StringBuilder sbr) {

		for (int i = 1; i < ca.length; i++) {
			sbr.append(ca[i]);
		}

		sbr.append(ca[0]);
		return sbr.toString();
	}

}
