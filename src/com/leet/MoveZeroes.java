package com.leet;

public class MoveZeroes {

	public static void main(String[] args) {

		//int[] nums = new int[] { 0, 1, 0, 3, 12 };
		int[] nums = new int[] {0,0};
		moveZeroes(nums);
	}

	// public static void moveZeroes(int[] nums) {
	//
	// int len = 0;
	// for (int i = 0; i < nums.length; i++) {
	// if (nums[i] != 0)
	// len++;
	// }
	//
	// int i = 0;
	// int j = 0;
	//
	// while (i < nums.length && j < len) {
	//
	// if (nums[i] == 0) {
	// i++;
	// continue;
	// } else {
	//
	// int val = nums[i];
	// nums[j] = val;
	// if(i != j)
	// nums[i] = 0;
	//
	// j++;
	// i++;
	// }
	// }
	//
	// System.out.println(nums);
	// }

	public static void moveZeroes(int[] nums) {

		if (nums.length == 1)
			return;

		int count = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				count++;
				continue;

			} else {

				temp = nums[i];
				nums[i - count] = temp;
				nums[i] = 0;
			}
		}
		System.out.println("done");
	}
}
