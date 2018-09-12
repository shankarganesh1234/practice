package com.leet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
		missingNumber(nums);
	}

	public static int missingNumber(int[] nums) {

		int[] a = new int[nums.length + 1];
		
		for(int i=0; i<nums.length; i++) {
			int val = nums[i];
			a[val] += 1;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				return i;
			}
		}
		return 0;
	}

}
