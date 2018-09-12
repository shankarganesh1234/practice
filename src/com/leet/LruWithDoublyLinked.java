package com.leet;

import java.util.HashMap;
import java.util.Map;

public class LruWithDoublyLinked {

	int capacity;
	Map<Integer, Node> map;
	DoublyList list;

	public static void main(String[] args) {

		LruWithDoublyLinked lru = new LruWithDoublyLinked(2);
		lru.put(2, 1);
		lru.put(1, 1);
		lru.put(2, 3);
		lru.put(4, 1);
		lru.get(1);
		lru.get(2);
	}

	public LruWithDoublyLinked(int capacity) {
		this.map = new HashMap<>();
		this.list = new DoublyList();
		this.capacity = capacity;
	}

	public int get(int key) {

		Node node = map.get(key);
		if (node == null)
			return -1;

		list.delete();
		list.insert(node);

		return node.data;
	}

	public void put(int key, int value) {

		if (!map.containsKey(key)) {

			if (map.size() >= capacity) {
				int deleteKey = list.delete();
				map.remove(deleteKey);
			}

			Node node = new Node(key, value);
			map.put(key, node);
			list.insert(node);

		} else {
			Node node = map.get(key);
			node.data = value;
			list.delete();
			list.insert(node);
		}

	}

	static class Node {
		Integer key;
		Integer data;
		Node prev;
		Node next;

		public Node(Integer key, Integer data) {
			this.key = key;
			this.data = data;
		}
	}

	static class DoublyList {

		private Node head;
		private Node curr;

		public void insert(Node node) {

			curr = head;
			if (head == null) {
				node.next = null;
				node.prev = null;
				head = node;
				curr = head;
			} else {
				curr.next = node;
				node.prev = curr;
				node.next = null;
				curr = node;
			}
		}

		public Integer delete() {
			int key = head.key;
			head = head.next;
			return key;
		}
	}

}
