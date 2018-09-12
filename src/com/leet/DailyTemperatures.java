package com.leet;

public class DailyTemperatures {

	public static void main(String[] args) {

		int[] temperatures = new int[] {77,77,77,77,77,41,77,41,41,77};
		dailyTemperatures(temperatures);
	}

	public static int[] dailyTemperatures(int[] temperatures) {

		int[] result = new int[temperatures.length];

		if(temperatures.length == 1)
			return result;

		int i= 0;
		int j= i+1;
		
		while(i < temperatures.length - 1 && j<temperatures.length) {
			

			
			if(temperatures[i] < temperatures[j]) {
				result[i] = j - i;
				i++;
				j = i+1;
			} else {
				j++;
				if(j == temperatures.length) {
					i++;
					j = i+1;
				}
			}
		}
		return result;
	}

}
