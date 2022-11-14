package org.greatlearning.binarytree;

public class BinaryTree {
	public static Node node;
	static Node prevNode = null;
	public static Node headNode = null;

	public static void convert(Node root) {

		if (root == null) {
			return;
		}

		convert(root.left);

		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		convert(rightNode);

	}

	public static void display(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		display(root.right);
	}
}
