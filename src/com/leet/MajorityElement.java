package com.leet;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = new int[] {3,2,3};
		System.out.println(majorityElement(nums));
	}
	
    public static int majorityElement(int[] nums) {
        
    		int l = nums.length;
    		Arrays.sort(nums);
    		return nums[l/2];
    }

}
