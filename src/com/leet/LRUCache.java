package com.leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

	Map<Integer, Integer> map = null;
	Queue<Integer> q = null;
	int capacity = -1;

	public LRUCache(int capacity) {
		this.map = new HashMap<>(capacity);
		this.q = new LinkedList<Integer>();
		this.capacity = capacity;
	}

	public int get(int key) {

		int result = -1;

		if (map.containsKey(key)) {
			result = map.get(key);
			q.remove(key);
			q.add(key);
		}
		return result;
	}

	public void put(int key, int value) {

		if (!q.isEmpty() && q.size() == capacity && !map.containsKey(key)) {
			Integer i = q.poll();
			map.remove(i);
		}

		map.put(key, value);
		q.add(key);
	}

	public static void main(String[] args) {

		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
		cache.put(4, 4);
	}

}
