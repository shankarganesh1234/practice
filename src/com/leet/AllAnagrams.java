package com.leet;

import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(findAnagrams(s, p));

	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> l = new ArrayList<>();
		int len = s.length();
		
		for(int i=0; i<len - (p.length() - 1); i++) {
			
			StringBuilder temp = new StringBuilder(p);

			for(int j = i; j< i + p.length(); j++) {
				
				char c = s.charAt(j);
				
				if(temp.toString().contains(Character.toString(c))) {
					temp = decrement(c, temp);
				}
				
				if(isEmpty(temp)) {
					l.add((j - p.length()) + 1);
					temp = new StringBuilder(p);
				}
			}
		}
		return l;
	}
	
	private static StringBuilder decrement(char c, StringBuilder sbr) {
		return sbr.deleteCharAt(sbr.toString().indexOf(c));
	}
	
	private static boolean isEmpty(StringBuilder sbr) {
		return sbr.length() == 0;
	}
}
