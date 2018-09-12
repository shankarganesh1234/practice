package com.leet;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {

		int first = 1;
		int second = 1;
		
		int n = 10;
		java.util.List<Integer> l = new ArrayList<>();
		
		l.add(first);
		l.add(second);
		
		for(int i=2; i<n; i++) {
			
			int third = second + first;
			l.add(third);
			second = l.get(i-1);
			first = l.get(i-2);
		}
		System.out.println(l);
	}

}
