package com.leet;

public class ReverseBits {

	public static void main(String[] args) {

		reverseBits(1);
	}

	public static int reverseBits(int n) {

		String binStr = Integer.toBinaryString(n);
		int len = binStr.length();
		
		int pre = 32 - len;
		while(pre > 0) {
			binStr = "0" + binStr;
			pre--;
		}

		int count = 0;
		char[] carr = binStr.toCharArray();

		while(count < 16) {
			
			char temp;
			temp = carr[count];
			carr[count] = carr[31 - count];
			carr[31 - count] = temp;
			count++;
		}
		
		String rev = new String(carr);
		System.out.println(binStr);
		
		
		System.out.println(rev);
		int result = -1;
		try {
			result = Integer.parseInt(rev, 2);
		} catch (NumberFormatException e) {
			result = Integer.MAX_VALUE;
		}
		return result;
	}

}
