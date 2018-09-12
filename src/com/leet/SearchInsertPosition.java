package com.leet;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = new int[] {1};
		System.out.println(searchInsert(nums, 1));
	}

	public static int searchInsert(int[] nums, int target) {
		
		if(nums.length == 0) 
			return 0;
		
		if(target < nums[0])
			return 0;
		
		if(target > nums[nums.length - 1])
			return nums.length;
		
		int l = nums.length;
		
		int prev = nums[0];
		
		if(prev == target)
			return 0;
		
		int curr = 0;
		for(int i=1; i<l; i++) {
			
			curr = nums[i];
			
			if(target == prev)
				return i - 1;
			
			if(target == curr)
				return i;
			
			if(target > prev && target < curr) 
				return i;
			
			prev = nums[i];
			
		}
		return l;
	}

}
