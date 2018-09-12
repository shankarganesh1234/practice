package com.leet;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(Integer.bitCount(4));
		System.out.println(Integer.bitCount(5));
		System.out.println(isPowerOfTwo(2147483647));
	}

	public static boolean isPowerOfTwo(int n) {

		return n > 0 && 1162261467 % n == 0;
	}
}
