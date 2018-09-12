package com.leet;

import java.util.ArrayList;

public class SummaryRanges {

	public static void main(String[] args) {

		
		
		
	}

	public static java.util.List<String> summaryRanges(int[] nums) {
		
		java.util.List<String> list = new ArrayList<>();
		
		if(nums.length == 0)
			return list;
		
		if(nums.length == 1) {
			list.add(String.valueOf(nums[0]));
			return list;
		}
		
		
			
		
		return list;
	}

}
