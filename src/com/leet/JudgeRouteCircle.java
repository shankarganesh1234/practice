package com.leet;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		System.out.println(judgeCircle("UD"));
		System.out.println(judgeCircle("LL"));
		System.out.println(judgeCircle("ULRD"));
	}

	public static boolean judgeCircle(String moves) {

		boolean isCircle = false;
		
		int u = 0;
		int d = 0;
		int r = 0;
		int l = 0;
		for(char c : moves.toCharArray()) {
			
			if(c == 'U')
				u++;
			else if(c == 'D')
				d--;
			else if(c == 'R')
				r++;
			else if(c == 'L')
				l--;
		}
		
		if(u+d+r+l == 0)
			isCircle = true;
			
		return isCircle;
	}
}
