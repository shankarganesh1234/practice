package com.leet.am;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {

		List<List<Integer>> test = new ArrayList<List<Integer>>();

		List<Integer> loc1 = new LinkedList<>();
		loc1.add(1);
		loc1.add(2);

		List<Integer> loc2 = new LinkedList<>();
		loc2.add(3);
		loc2.add(4);

		List<Integer> loc3 = new LinkedList<>();
		loc3.add(1);
		loc3.add(-1);

		test.add(loc1);
		test.add(loc2);
		test.add(loc3);

		nearestXsteakHouses(3, test, 2);

	}

	static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses, List<List<Integer>> allLocations,
			int numSteakhouses) {

		List<List<Integer>> resultList = new ArrayList<List<Integer>>();

		if (allLocations == null)
			return resultList;

		// Ordered by increasing distance from customer
		PriorityQueue<LocationData> pq = new PriorityQueue<>(new Comparator<LocationData>() {

			@Override
			public int compare(LocationData o1, LocationData o2) {
				return o1.distance.compareTo(o2.distance);
			}
		});

		// traverse all locations
		for (int i = 0; i < allLocations.size(); i++) {

			List<Integer> locList = allLocations.get(i);

			// coordinate - x,y
			int x = locList.get(0);
			int y = locList.get(1);

			double dist = Math.sqrt(Math.pow((double) x, 2) + (Math.pow((double) y, 2)));
			LocationData locData = new LocationData(dist, x, y);

			// offer to pq for sorting on nearest distance from customer
			pq.offer(locData);

		}

		int counter = numSteakhouses;

		while (counter > 0) {

			LocationData locData = pq.poll();

			// need insertion order for x,y coordinates
			List<Integer> locs = new LinkedList<>();
			locs.add(locData.x);
			locs.add(locData.y);
			resultList.add(locs);
			counter--;
		}

		return resultList;
	}

	static class LocationData {
		Double distance;
		int x;
		int y;

		public LocationData(double distance, int x, int y) {
			super();
			this.distance = distance;
			this.x = x;
			this.y = y;
		}
	}
}
