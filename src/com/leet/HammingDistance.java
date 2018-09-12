package com.leet;

public class HammingDistance {

	public static void main(String args[]) {
		System.out.println(hammingDistance1(1, 4));
	}

	public static int hammingDistance(int x, int y) {

		int result = 0;
		String xs = Integer.toBinaryString(x);
		String ys = Integer.toBinaryString(y);

		int l = Math.max(xs.length(), ys.length());

		int xa[] = new int[l];
		int ya[] = new int[l];

		int i = xs.length() - 1;
		int j = l - 1;

		while (i >= 0) {

			if (xs.charAt(i) == '1') {
				xa[j] = xs.charAt(i);
			}
			i--;
			j--;
		}

		i = ys.length() - 1;
		j = l - 1;

		while (i >= 0) {

			if (ys.charAt(i) == '1') {
				ya[j] = ys.charAt(i);
			}
			i--;
			j--;
		}

		for (int q = 0; q < l; q++) {

			if (xa[q] != ya[q])
				result++;
		}
		return result;
	}
	
    public static int hammingDistance1(int x, int y) {
        int result = 0;
		String xs = Integer.toBinaryString(x);
		String ys = Integer.toBinaryString(y);

		int l = Math.max(xs.length(), ys.length());

		int xa[] = new int[l];
		int ya[] = new int[l];

    	int i = xs.length() - 1;
		int j = 0;

		while (i >= 0) {

			xa[j] = xs.charAt(i) - 'a';
			
			i--;
			j++;
		}

		i = ys.length() - 1;
		j = 0;

		while (i >= 0) {
			ya[j] = ys.charAt(i) - 'a';
			i--;
			j++;
		}

		for (int q = 0; q < l; q++) {

			if (xa[q] != ya[q])
				result++;
		}
		return result;
    }
}
