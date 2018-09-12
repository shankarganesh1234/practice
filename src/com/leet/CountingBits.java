package com.leet;

public class CountingBits {

	public static void main(String[] args) {

		System.out.println(countBits(5));
	}

	public static int[] countBits(int num) {

		int[] n = new int[num + 1];
		String binaryStr = null;
		for (int i = 0; i <= num; i++) {

			n[i] = Integer.bitCount(i);
		}
		return n;
	}

}
