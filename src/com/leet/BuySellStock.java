package com.leet;

public class BuySellStock {

	public static void main(String[] args) {

		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		if(prices.length == 0)
			return 0;
		
		int b;
		int profit = 0;

		b = prices[0];

		for (int i = 1; i < prices.length; i++) {

			if (b < prices[i]) {

				int temp = prices[i] - b;

				if (temp > profit) {
					profit = temp;
				}
			}

			b = Math.min(b, prices[i]);
		}
		return profit;
	}
}
