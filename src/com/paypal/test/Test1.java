package com.paypal.test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		ListNode head = new ListNode('a');
		head.next = new ListNode('b');
		head.next.next = new ListNode('c');
		ListNode result = clone(head);
		System.out.println(result);
	}

	/**
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode clone(ListNode head) {

		if (head == null)
			return null;

		// map for storing copy
		Map<ListNode, ListNode> nodeMap = new HashMap<>();
		ListNode curr = head;

		// perform copy
		while (curr != null) {

			ListNode node = new ListNode(curr.data);
			nodeMap.put(curr, node);
			curr = curr.next;
		}

		curr = head;
		
		// perform next and random assignment
		while (curr != null) {

			ListNode clonedNode = nodeMap.get(curr);
			clonedNode.next = nodeMap.get(curr.next);
			clonedNode.random = nodeMap.get(curr.random);
			curr = curr.next;
		}
		return nodeMap.get(head);
	}

	static class ListNode {
		Character data;
		ListNode next;
		ListNode random;

		public ListNode(Character c) {
			this.data = c;
		}
	}

}
