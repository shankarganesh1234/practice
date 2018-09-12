package com.leet;

public class ReverseLinkedList {

	public static void main(String[] args) {

	}
	
    public static ListNode reverseList(ListNode head) {

    		if(head == null)
    			return null;
    		
    		ListNode prev = null;;
    		ListNode curr = head;
    		
    		while(curr != null) {
    			
    			ListNode next = curr.next;
    			curr.next = prev;
    			prev = curr;
    			curr = next;
    		}
    		
    		return prev;
    }

}
