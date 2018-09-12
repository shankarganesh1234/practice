package com.leet;

public class ListPalindrome {

	public static void main(String[] args) {

		MyList l = new MyList();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(1);

		traverse(l.head, l.head);
	}

	public static boolean isPalindrome(ListNode head) {
		return false;
	}

	public static void traverse(ListNode head, ListNode temp) {
		if(head != null) {
			traverse(head.next, temp);
			
			System.out.println("head :" + head.data + " -- temp : " + temp.data );
			if(head.data != temp.data) {
				System.out.println("not a palindrome");
			} else {
				temp = temp.next;
			}
		}
	}
}
