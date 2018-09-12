package com.leet;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedian {

	public static void main(String[] args) {

	}

	PriorityQueue<Integer> max;
	PriorityQueue<Integer> min;
	int size = 0;
	
	/** initialize your data structure here. */
	public FindMedian() {

		max = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		min = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

	}

	public void addNum(int num) {
		
		size++;
		max.offer(num);
		min.offer(max.poll());

		if (max.size() < min.size())
			max.offer(min.poll());
	}

	public double findMedian() {
		double result = 0.0;

		if(size % 2 == 0) {
			result = (max.peek() + min.peek()) * 0.5;
		} else {
			result = max.peek();
		}
		return result;
	}

}
