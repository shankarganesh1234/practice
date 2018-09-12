package com.leet;

public class HouseRobber {

	public static void main(String[] args) {

		int[] nums = new int[] {1,2,3,1};
		System.out.println(rob(nums));
	}
	
    public static int rob(int[] nums) {
        
    		int odd = 0;
    		int even = 0;
    		
    		for(int i=0; i<nums.length; i++) {
    			
    			if(i % 2 == 0) {
    				
    				odd += nums[i];
    				
    			} else {
    				
    				even += nums[i];
    			}
    		}
    		return Math.max(odd, even);
    }

}
