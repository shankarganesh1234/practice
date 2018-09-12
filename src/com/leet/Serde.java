package com.leet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Serde {

	public static void main(String[] args) {

	}

	public static String serialize(TreeNode root) {
		return ser(root);
	}

	public TreeNode deserialize(String data) {

		if (data == null || data.equals(""))
			return null;

		java.util.List<String> nodes = Arrays.asList(data.split(" "));

		TreeNode head = new TreeNode(Integer.valueOf(nodes.get(0)));
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(head);
		
		int index = 0;
		
		while(!q.isEmpty()) {
			
			TreeNode node = q.poll();
			index += 1;
			
			if(nodes.get(index) == null) {
				node.left = null;
			} else {
				node.left = new TreeNode(Integer.valueOf(nodes.get(index)));
				q.offer(node.left);
			}
			
			index += 1;
			
			if(nodes.get(index) == null) {
				node.right = null;
			} else {
				node.right = new TreeNode(Integer.valueOf(nodes.get(index)));
				q.offer(node.right);
			}
		}
		return head;
	}

	private static String ser(TreeNode root) {

		if (root == null)
			return null;

		StringBuilder sbr = new StringBuilder();

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {

			TreeNode node = q.poll();

			if (node == null)
				sbr.append("null");
			else
				sbr.append(node.val);

			sbr.append(" ");

			if (node != null) {
				q.offer(node.left);
				q.offer(node.right);
			}
		}

		return sbr.toString();
	}

}
