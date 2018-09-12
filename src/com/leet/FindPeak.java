package com.leet;

public class FindPeak {

	public static void main(String[] args) {

		int[] nums = new int[] {1,2};
		findPeakElement(nums);
	}

	public static int findPeakElement(int[] nums) {

		if (nums.length == 1)
			return 0;

		int result = 0;
		int current = 0;
		int prev = 0;
		int next = 0;

		for (int i = 0; i < nums.length; i++) {

			current = nums[i];

			if ((i + 1) > nums.length - 1)
				next = Integer.MIN_VALUE;
			else
				next = nums[i + 1];

			if ((i - 1) < 0)
				prev = Integer.MIN_VALUE;
			else
				prev = nums[i - 1];

			if (current > prev && current > next) {
				result = i;
				break;
			}
		}

		return result;
	}

}
