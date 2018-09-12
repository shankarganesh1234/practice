package com.leet;

public class AddTwoNumbers {

	public static void main(String[] args) {

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode temp = new ListNode(0);

		ListNode curr = temp;
		int x = 0;
		int y = 0;
		int carry = 0;
		int sum = 0;

		while (l1 != null || l2 != null) {

			x = (l1 != null) ? l1.data : 0;
			y = (l2 != null) ? l2.data : 0;
			sum = x + y + carry;
			
			carry = sum/10;
			
			ListNode node = new ListNode(sum % 10);
			curr.next = node;
			curr = node;
			
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if (carry != 0) {
			ListNode node = new ListNode(carry);
			curr.next = node;
			curr = node;
		}

		return temp.next;

	}
}
