package com.leet;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {

		int[] result = new int[] { 1, 2, 3, 4 };
		productExceptSelf(result);

	}

	public static int[] productExceptSelf(int[] nums) {

	    int len = nums.length;
        int[] result = new int[len];
        
        Arrays.fill(result, 1);
        int pre = 1;
        int post = 1;
        
        for(int i=0; i<len -1; i++) {
            
            pre *= nums[i];
            result[i+1] *= pre;
        }
        
        for(int j=len - 1; j > 0; j--) {
            
            post *= nums[j];
            result[j-1] *= post;
        }
        
        return result;

	}

}
