package com.leet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Generic {

	static TreeNode head;

	public static void main(String[] args) {

//		Tree t = new Tree();
//		head = t.insert(null, 5);
//		t.insert(head, 2);
//		t.insert(head, 13);
//		System.out.println(diameterOfBinaryTree(head));
		int[] nums = new int[] {1,2,3,4};
		productExceptSelf(nums);
		System.out.println("done");
	}

	public static int[] productExceptSelf(int[] nums) {

		int len = nums.length;
		int[] result = new int[len];

		Arrays.fill(result, 1);
		int pre = 1;
		int post = 1;

		for (int i = 0; i < len - 1; i++) {

			pre *= nums[i];
			result[i + 1] *= pre;
		}

		for (int j = len - 1; j > 0; j--) {

			post *= nums[j];
			result[j - 1] *= post;
		}

		return result;

	}

	public static void inOrderStack(TreeNode node) {

		if (node == null)
			return;

		Stack<TreeNode> stack = new Stack<>();

		TreeNode curr = node;

		while (curr != null || !stack.isEmpty()) {

			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			TreeNode temp = stack.pop();
			System.out.println(temp.val);

			curr = curr.right;
		}
	}

	public static void preOrderStack(TreeNode node) {

		if (node == null)
			return;

		Stack<TreeNode> stack = new Stack<>();

		stack.push(node);

		while (!stack.isEmpty()) {

			TreeNode curr = stack.pop();
			System.out.println(curr.val);

			if (curr.right != null)
				stack.push(curr.right);

			if (curr.left != null)
				stack.push(curr.left);
		}

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

//		if (l1 == null && l2 == null)
//			return null;
//
//		ListNode preNode = new ListNode();
//		preNode.data = -1;
//
//		List newList = new List();
//		newList.add(-1);
//
//		ListNode preHead = newList.head;
//		ListNode prev = preHead;
//
//		while (l1 != null && l2 != null) {
//
//			if (l1.data <= l2.data) {
//
//				prev.next = l1;
//				l1 = l1.next;
//
//			} else {
//
//				prev.next = l2;
//				l2 = l2.next;
//			}
//		}
//
//		prev.next = l1 == null ? l2 : l1;
//
//		return preHead.next;

		// if (l1 == null && l2 == null)
		// return null;
		//
		// List preHead = new List();
		// preHead.add(-1);
		//
		// ListNode prev = preHead.head;
		//
		// while (l1 != null && l2 != null) {
		//
		// if (l1.data <= l2.data) {
		//
		// prev.next = l1;
		// l1 = l1.next;
		// } else {
		// prev.next = l2;
		// l2 = l2.next;
		// }
		// prev = prev.next;
		// }
		//
		// prev.next = l1 == null ? l2 : l1;
		//
		// return preHead.head.next;

		return null;
	}

	public static TreeNode greaterTree(TreeNode root) {

		return root;
	}

	public static int diameterOfBinaryTree(TreeNode root) {

		if (root == null)
			return 0;

		int diameter = 0;

		Queue<TreeNode> q = new LinkedList<>();

		q.offer(root);

		while (!q.isEmpty()) {

			TreeNode node = q.poll();

			if (node.left != null || node.right != null)
				diameter++;

			if (node.left != null)
				q.offer(node.left);

			if (node.right != null)
				q.offer(node.right);

		}

		return diameter;
	}

	public static void dfs(TreeNode head) {

		if (head != null) {
			System.out.print("#" + head.val);
			dfs(head.left);
			dfs(head.right);
		}
	}

	public static void dfsStack(TreeNode head) {

		if (head == null)
			return;

		Stack<TreeNode> stack = new Stack<>();

		stack.push(head);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			if (node != null) {
				System.out.print("#" + node.val);
				stack.push(node.right);
				stack.push(node.left);
			}
		}
	}

}
