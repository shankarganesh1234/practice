package com.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

	public static void main(String[] args) {

		java.util.List<Interval> intervals = new ArrayList<>();

		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));

		merge(intervals);
	}

	public static java.util.List<Interval> merge(java.util.List<Interval> intervals) {

		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}

		});

		java.util.List<Interval> list = new ArrayList<>();

		int i = 0;
		int j = 1;

		while (j < intervals.size()) {

			Interval curr = intervals.get(i);
			Interval next = intervals.get(j);

			// merge condition
			if (next.start < curr.end) {

				next.start = Math.min(curr.start, next.start);
				next.end = Math.max(curr.end, next.end);

			} else {
				list.add(curr);

				if (j == intervals.size() - 1)
					list.add(next);
			}
			i++;
			j++;
		}

		return list;
	}

	static class Interval {
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
