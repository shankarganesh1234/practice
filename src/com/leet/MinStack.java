package com.leet;

public class MinStack {

	StackNode head;

	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {

		if (head == null) {
			head = new StackNode(x, x, null);
		} else {
			StackNode temp = new StackNode(x, Math.min(x, head.min), head);
			head = temp;
		}
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}
}
