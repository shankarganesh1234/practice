package com.leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = new int[] {3,3};
		int target = 6;
		System.out.println(twoSum(nums, target));
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    		int[] res = new int[2];
    		
    		Map<Integer, Integer> m = new HashMap<>();
    		
    		for(int i=0; i< nums.length; i++) {
    			m.put(nums[i], i);
    		}
    		
    		for(int i = 0; i<nums.length; i++) {
    			
    			int val = nums[i];
    			if(m.get(target - val) != null && i != m.get(target - val)) {
    				res[0] = i;
    				res[1] = m.get(target - val);
    				break;
    			}
    		}
    		return res;
    }

}
