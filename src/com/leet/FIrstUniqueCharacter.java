package com.leet;

import java.util.HashMap;
import java.util.Map;

public class FIrstUniqueCharacter {

	public static void main(String[] args) {

		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));

	}

	public static int firstUniqChar(String s) {

		int index = -1;
		Map<Character, Integer> m = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			
			if(m.get(c) == null) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}
		}
		
		for(int i=0; i<s.length(); i++) {

			if(m.get(s.charAt(i)) == 1) {
				index = i;
				break;
			}
		}
		return index;
	}

}
