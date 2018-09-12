package com.leet;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeSortedLists {

	public static void main(String[] args) {

		MyList l1 = new MyList();
		l1.add(1);
		l1.add(2);
		l1.add(4);

		MyList l2 = new MyList();
		l2.add(1);
		l2.add(3);
		l2.add(4);

		//mergeTwoLists(l1.head, l2.head);
		merge(l1.head, l2.head);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

		// insert l1
		while (l1 != null) {
			pq.offer(new Integer(l1.data));
			l1 = l1.next;
		}

		// insert l2
		while (l2 != null) {
			pq.offer(new Integer(l2.data));
			l2 = l2.next;
		}

		MyList l = new MyList();

		for (int i = 0; i < pq.size(); i++) {

			l.add(pq.poll());
		}
		return l.head;
	}

	public static ListNode merge(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null)
			return null;

		if (l1 == null)
			return l2;

		if (l2 == null)
			return l1;

		ListNode head = l1.data <= l2.data ? l1 : l2;

		while (l1 != null && l2 != null) {

			int l2_data = l2.data;
			
			if(l2_data < l1.data) {
				ListNode l = new ListNode(l2.data);
				
				l.next = l1;
				l1 = l1.next;
				l2 = l2.next;
				
			} else if(l2_data >= l1.data && l2_data < l1.next.data) {
				ListNode l = new ListNode(l2_data);
				
				ListNode temp = l1.next;
				l1.next = l;
				l.next = temp;
				
				l1 = l1.next;
				l2 = l2.next;
				
			} else if(l2_data > l1.data) {
			
				ListNode l = new ListNode(l2_data);
				l1.next = l2;
			}
		}
		return head;
	}

}
