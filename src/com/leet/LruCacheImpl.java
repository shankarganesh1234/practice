package com.leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LruCacheImpl {

	Map<Integer, Integer> map = null;
	Queue<Integer> q = null;
	int capacity;

	public static void main(String[] args) {

	}

	public LruCacheImpl(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
		this.q = new LinkedList<>();
	}

	public int get(int key) {

		q.remove(key);
		q.add(key);
		return map.get(key);
	}

	public void put(int key, int value) {

		if (isEvictionRequired(key)) {
			this.map.remove(q.poll());
		}

		this.map.put(key, value);
		this.q.offer(key);
	}

	private boolean isLimitReached() {
		return this.map.size() == this.capacity;
	}

	private boolean isEvictionRequired(int key) {

		if (this.map.containsKey(key))
			return false;

		return isLimitReached();
	}
}
