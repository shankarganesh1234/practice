package com.leet;

public class ListCycle {

	public static void main(String[] args) {

		MyList l = new MyList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.current.next = l.head;
		System.out.println(hasCycle(l.head));
	}

	public static boolean hasCycle(ListNode head) {

		if(head == null || head.next == null)
			return false;
		
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		
		while(slow != null && fast.next != null && fast.next.next != null) {
			
			if(slow.data == fast.data) {
				return true;
			} 
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
}
