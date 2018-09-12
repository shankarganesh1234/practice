package com.leet;

public class MergeBT {

	public static void main(String[] args) {

		Tree tree = new Tree();
		TreeNode head = tree.insert(null, 1);
		tree.insert(head , 2);
		tree.insert(head , 3);
		
		Tree tree1 = new Tree();
		TreeNode head1 = tree1.insert(null, 1);
		tree1.insert(head1 , 2);
		
		TreeNode node = mergeTrees(head, head1);
		System.out.println(node);
		
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if (t1 == null)
			return t2;

		if (t2 == null)
			return t1;

		t1.val += t2.val;
		mergeTrees(t1.left, t2.left);
		mergeTrees(t1.right, t2.right);
		return t1;
	}
}
