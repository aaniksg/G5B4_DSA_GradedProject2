package org.greatlearning.binarytree.main;

import org.greatlearning.binarytree.Node;
import org.greatlearning.binarytree.BinaryTree;

public class Main {
	public static void main(String[] args) {

		BinaryTree.node = new Node(50);
		BinaryTree.node.left = new Node(30);
		BinaryTree.node.right = new Node(60);
		BinaryTree.node.left.left = new Node(10);
		BinaryTree.node.right.left = new Node(55);

		BinaryTree.convert(BinaryTree.node);
		System.out.println("Modified Binary Search Tree - ");
		BinaryTree.display(BinaryTree.headNode);
	}
}