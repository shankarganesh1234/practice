package com.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms2 {

	public static void main(String args[]) {

		Interval[] intervals = new Interval[] { new Interval(0, 30), new Interval(1, 2), new Interval(5, 10),
				new Interval(10, 40), new Interval(20, 30) };
		System.out.println(minMeetingRooms(intervals));
	}

	public static int minMeetingRooms(Interval[] intervals) {

		if (intervals.length == 0)
			return 0;

		if (intervals.length == 1)
			return 1;

		// sort on start
		Arrays.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

		// pq on end
		PriorityQueue<Interval> pq = new PriorityQueue<>(new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.end - o2.end;
			}
		});

		// add the first element
		pq.offer(intervals[0]);
		
		for(int i=1; i<intervals.length; i++) {
			
			Interval interval = intervals[i];
			
			if(interval.start >= pq.peek().end) {
				pq.poll();
			}
			pq.offer(interval);
		}
		
		return pq.size();
	}

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
}
