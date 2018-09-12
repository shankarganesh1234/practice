package com.leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		levelOrder(root);

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {

		if (root == null)
			return null;

		int level = 0;
		Queue<TreeNode> q = new LinkedList<>();

		q.offer(root);

		while (!q.isEmpty()) {

			TreeNode node = q.poll();

			System.out.println(node.val);

			if (node.left != null)
				q.offer(node.left);

			if (node.right != null)
				q.offer(node.right);

			if (node.left != null || node.right != null)
				level++;

		}

		return null;
	}

}
