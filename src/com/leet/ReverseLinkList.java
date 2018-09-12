package com.leet;

public class ReverseLinkList {

	static MyList l = new MyList();

	public static void main(String[] args) {

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		// reverseList(l.head);
		ListNode node = l.head.next.next;
		delete(node);
	}

	public static ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void delete(ListNode node) {

		while (node != null) {
			node = node.next;
		}
		System.out.println(l.head);
		System.out.println("done");
	}
}
