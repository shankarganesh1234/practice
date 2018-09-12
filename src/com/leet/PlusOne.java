package com.leet;

import java.util.Stack;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = new int[] { 9,8,7,6,5,4,3,2,1,0 };
		plusOne(digits);

	}

	public static int[] plusOne(int[] digits) {

		int resultSize = 0;
		Stack<Integer> s = new Stack<Integer>();

		int l = digits.length;
		int num = 0;
		int pow = 0;
		int i = l - 1;

		while (i >= 0) {

			num += (int) Math.pow(10, pow) * digits[i];
			pow++;
			i--;

		}

		num += 1;

		while (num > 0) {
			s.push(num % 10);
			num = num / 10;
			resultSize++;
		}

		int count = 0;

		int[] result = new int[resultSize];
		while (s.elements().hasMoreElements()) {
			result[count] = s.pop();
			count++;
		}

		return result;
	}

}
