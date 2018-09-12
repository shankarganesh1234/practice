package com.leet;

public class Duplicates {

	public static void main(String[] args) {

		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {

		int count = 0;
		if(nums.length == 0)
			return 0;
		
		for(int i=0; i<nums.length - 1; i++) {
			
			if(nums[i] != nums[i+1])
				count++;
		}
		
		return count + 1;
	}
}
