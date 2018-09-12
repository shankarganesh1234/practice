package com.leet;

public class GuessGame {

	public static int num = 6;

	public static void main(String[] args) {
		guessNumber(6);
	}

	public static int guessNumber(int n) {

		int high = 10;
		int low = 1;
		int guess = -10;
		int mid = 0;

		while (true) {

			mid = (high + low) / 2;
			guess = guess(mid);

			if (guess == 0) {
				System.out.println(guess);
				break;

			} else if (guess < 1) {

				low = guess;

			} else {

				high = guess;
			}
		}
		return 0;
	}

	public static int guess(int n) {

		if (n == num)
			return 0;

		if (n < num)
			return -1;
		else
			return 1;
	}

}
