package com.leet;

public class Intersection {

	public static void main(String[] args) {

		MyList headA = new MyList();
		headA.add(1);
		headA.add(3);
		headA.add(5);
		headA.add(7);
		headA.add(9);
		headA.add(11);
		headA.add(13);

		MyList headB = new MyList();
		headB.add(2);
		headB.add(4);
		headB.add(9);
		headB.add(15);


		System.out.println(getIntersectionNode(headA.head, headB.head).data);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		ListNode a = headA;
		ListNode b = headB;

		// if a & b have different len, then we will stop the loop after second
		// iteration
		while (a != b) {
			// for the end of first iteration, we just reset the pointer to the
			// head of another linkedlist
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;
	}

}
