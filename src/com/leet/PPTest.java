package com.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PPTest {

	public static void main(String[] args) {

		// int[] a = new int[] {1};
		// maxDifference(a);

		int[] nums = new int[] { 3, 2, 1, 3 };
		int[] maxes = new int[] { 2, 4 };
		counts(nums, maxes);

		// int[] a = new int[] {7,6,12,3,9,3,5,1};
		// numberOfPairs(a, 12);
	}

	/**
	 * 
	 * @param a
	 * @param k
	 * @return
	 */
	static int numberOfPairs(int[] a, long k) {

		int result = 0;
		int diff = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Map<String, Integer> trackMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}

		for (int i = 0; i < a.length; i++) {
			diff = (int) k - a[i];

			if (map.containsKey(diff) && map.get(diff) != i) {
				String key1 = a[i] + "," + diff;
				String key2 = diff + "," + a[i];
				if (!trackMap.containsKey(key1) || !trackMap.containsKey(key2)) {
					trackMap.put(key1, -1);
					trackMap.put(key2, -1);
					result++;
				}
			}
		}
		return result;

	}

	/**
	 * 
	 * @param nums
	 * @param maxes
	 * @return
	 */
	static int[] counts(int[] nums, int[] maxes) {

		int[] result = new int[maxes.length];
		int count = 0;
		Arrays.sort(nums);

		for (int i = 0; i < maxes.length; i++) {

			int max = maxes[i];

			if (max >= nums[nums.length - 1]) {
				count = nums.length;
				result[i] = count;
				continue;
			}

			for (int j = nums.length - 1; j >= 0; j--) {

				if (nums[j] > max)
					continue;
				else {
					count = j + 1;
					break;
				}
			}
			result[i] = count;
			count = 0;
		}
		return result;
	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	static int maxDifference(int[] a) {

		if (a.length == 1)
			return a[0];

		int high = Integer.MIN_VALUE;
		int highIndex = 0;
		int maxDiff = -1;

		for (int i = 0; i < a.length; i++) {

			if (high <= a[i]) {
				high = a[i];
				highIndex = i;
			}
		}

		for (int i = 0; i < highIndex; i++) {

			maxDiff = Math.max(maxDiff, Math.abs(high - a[i]));
		}

		return maxDiff;
	}

}
