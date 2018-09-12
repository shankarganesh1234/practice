package com.leet;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("anagram", "nagaraa"));
	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] arr = new int[26];
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a'] += 1;
		}

		for (int i = 0; i < t.length(); i++) {
			index = t.charAt(i) - 'a';
			arr[index] -= 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0)
				return false;
		}

		return true;
	}

}
