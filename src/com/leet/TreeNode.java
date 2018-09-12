package com.leet;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.val = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(int data) {
		super();
		this.val = data;
		this.left = null;
		this.right = null;
	}
}
