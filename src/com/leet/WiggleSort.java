package com.leet;

import java.util.Arrays;

public class WiggleSort {

	public static void main(String[] args) {

		int[] nums = new int[] {3,5,2,1,6,4,7};
		wiggleSort(nums);
	}

	public static void wiggleSort(int[] nums) {
		
		Arrays.sort(nums);
		
		int i = 1;
		while(i < nums.length - 1) {
			
			swap(i, i+1, nums);
			i+=2;
		}
		System.out.println("done");

	}
	
	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
