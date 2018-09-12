package com.leet;

public class MyList {

	ListNode head;
	ListNode current;
	ListNode prev;

	void traverse(ListNode head) {

		if (head == null)
			System.out.println("empty");

		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	void add(int data) {

//		if (head == null) {
//
//			ListNode node = new ListNode();
//			node.data = data;
//			node.next = null;
//			head = node;
//			current = head;
//
//		} else {
//
//			ListNode node = new ListNode();
//			node.data = data;
//			node.next = null;
//			current.next = node;
//			current = node;
//		}

	}

	void remove(int data) {

		ListNode temp = head;
		ListNode prev = head;

		while (temp != null) {

			if (temp.data == data) {
				System.out.println("found");
				prev.next = temp.next;
				break;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
	}
	
    public ListNode reverseList(ListNode head) {

    		if(head != null)
    			return reverseList(head.next);
    		else
    			return null;
    }
	
	public static void main(String args[]) {
		MyList l = new MyList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		l.traverse(l.head);
		l.remove(3);
		l.traverse(l.head);
		
	}

}
