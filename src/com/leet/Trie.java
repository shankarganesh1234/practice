package com.leet;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	Node root;

	public Trie() {
		root = new Node();
	}

	public static void main(String args[]) {
		
		Trie trie = new Trie();
		trie.insertWord("abcd");
		trie.insertWord("aced");
		trie.insertWord("shankar");
		trie.insertWord("shankaganesh");
		trie.insertWord("ganesh");
		trie.insertWord("shanks");
		
		System.out.println(trie.isPresent("shanks"));
		System.out.println(trie.isPresent("hashirama"));
		System.out.println(trie.isPresent("ace"));
		System.out.println(trie.isPresent("ganesh"));

	}
	
	public void insertWord(String word) {

		Node curr = root;
		char[] charArray = word.toCharArray();

		for (char c : charArray) {

			Node node = curr.map.get(c);

			if (node == null) {
				node = new Node();
				curr.map.put(c, node);
			}

			curr = node;
		}
		curr.isEnd = true;
	}

	public boolean isPresent(String word) {

		Node curr = root;
		char[] charArray = word.toCharArray();

		for (char c : charArray) {

			Node node = curr.map.get(c);

			if (node == null)
				return false;

			curr = node;
		}
		return curr.isEnd;
	}

	static class Node {
		Map<Character, Node> map;
		boolean isEnd;

		public Node() {
			map = new HashMap<>();
		}
	}

}
