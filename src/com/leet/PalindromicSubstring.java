package com.leet;

public class PalindromicSubstring {

	public static void main(String[] args) {

		System.out.println(countSubstrings("aba"));
	}

	public static int countSubstrings(String s) {

		int result = 0;

		int nums[] = new int[52];

		int len = s.length();

		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			nums[c - 'a']++;
		}

		for (int i = 0; i < 52; i++) {
			if(nums[i] == 0)
				continue;
			
			nums[i] = fac(nums[i]);
		}

		for (int i = 0; i < 52; i++) {
			result += nums[i];
		}

		return result;
	}

	public static int fac(int n) {

		int count = n - 1;

		while (count > 0) {

			n *= count;
			count--;
		}
		return n;
	}

}
