package com.leet;

public class DIfference {

	public static void main(String[] args) {

		String s = "a";
		String t = "aa";
		
		findTheDifference(s,t);
	}

	public static char findTheDifference(String s, String t) {

		char res = ' ';
		
		int[] charArr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			charArr[c - 'a'] += 1;
		}
		
		for(int i=0; i< t.length(); i++) {
			char c = t.charAt(i);
			
			if(charArr[c - 'a'] != 0) {
				charArr[c - 'a'] -= 1;
			} else {
                return c;
            }
		}
		return res;
	}

}
