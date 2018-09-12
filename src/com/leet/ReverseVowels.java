package com.leet;

public class ReverseVowels {

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}

	public static String reverseVowels(String s) {

		char[] sc = s.toCharArray();

		int l = sc.length;
		
		int i = 0;
		int j = l - 1;
		char temp;
		
		while(i < j) {
			
			if(!isVowel(sc[i])) {
				i++;
			}
			
			if(!isVowel(sc[j]))
				j--;
			
			if(isVowel(sc[i]) && isVowel(sc[j]) ) {
				temp = sc[i];
				sc[i] = sc[j];
				sc[j] = temp;
				i++;
				j--;
			}
		}
		return new String(sc);
	}
	
	private static boolean isVowel(char c) {
		if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117 || c == 65 || c == 69 || c == 73 || c == 79 || c == 85)
			return true;
		
		return false;
	}
}
