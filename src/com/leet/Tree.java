package com.leet;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	static TreeNode head;

	public static void main(String[] args) {

		Tree t = new Tree();

		head = t.insert(null, 10);
		t.insert(head, 9);
		t.insert(head, 8);
		t.insert(head, 5);
		t.insert(head, 11);
		t.insert(head, 13);

		// System.out.println(t.find(head, 15));
		// traverseInOrder(head);
		// traversePreOrder(head);
		// traversePostOrder(head);

		//t.bfs(head);
		traverseDescending(head);
		System.out.println("done");
	}

	void bfs(TreeNode head) {

		int leftLevel = 0;
		int rightLevel = 0;

		if (head == null)
			return;

		Queue<TreeNode> q = new LinkedList<>();

		q.offer(head);

		while (!q.isEmpty()) {

			TreeNode node = q.poll();

			System.out.println(node.val);

			if (node.left != null) {
				q.offer(node.left);
				leftLevel++;
			}

			if (node.right != null) {
				q.offer(node.right);
				rightLevel++;
			}

		}
		System.out.println(Math.max(leftLevel, rightLevel));

	}

	static void traverseDescending(TreeNode head) {

		if (head != null) {
			traverseDescending(head.right);
			System.out.println("Descending : " + head.val);
			traverseDescending(head.left);
		}

	}

	static void traverseInOrder(TreeNode head) {

		if (head != null) {
			traverseInOrder(head.left);
			System.out.println("Inorder : " + head.val);
			traverseInOrder(head.right);
		}

	}

	static void traversePreOrder(TreeNode head) {

		if (head != null) {
			System.out.println("Preorder : " + head.val);

			traversePreOrder(head.left);
			traversePreOrder(head.right);
		}
	}

	static void traversePostOrder(TreeNode head) {

		if (head != null) {

			traversePostOrder(head.left);
			traversePostOrder(head.right);
			System.out.println("Postorder : " + head.val);

		}
	}

	boolean find(TreeNode head, int data) {

		if (head == null)
			return false;

		TreeNode current = head;

		while (current != null) {

			if (current.val == data)
				return true;

			if (data < current.val)
				current = current.left;
			else
				current = current.right;
		}

		return false;
	}

	TreeNode insert(TreeNode current, int data) {

		if (current == null) {
			current = new TreeNode(data);
			return current;
		}

		if (data <= current.val)
			current.left = insert(current.left, data);
		else if (data > current.val)
			current.right = insert(current.right, data);

		return current;
	}

	void remove(int data) {

	}

}
