package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2= new int[] {2,2};
		intersect(nums1, nums2);

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] result = null;
		java.util.List<Integer> list = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums1.length; i++) {
			
			if(map.get(nums1[i]) == null) {
				map.put(nums1[i], 1);
			} else {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			}
		}
		
		
		for(int i=0; i<nums2.length; i++) {
			
			if(map.get(nums2[i]) != null && map.get(nums2[i]) > 0) {
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		
		result = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
