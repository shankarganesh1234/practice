package com.leet;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

	public static void main(String args[]) {
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> l = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++) {
			
			int val = Math.abs(nums[i]) - 1;
			
			if(val >= 0 && nums[val] > 0)
				nums[val] = -nums[val];
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				l.add(i+1);
			}
		}
		return l;
	}

}
