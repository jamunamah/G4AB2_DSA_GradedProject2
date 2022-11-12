package com.greatlearning.problem2.main;

import java.util.Scanner;

import com.greatlearning.problem2.rightskewedtree.RightSkewedTree;
import com.greatlearning.problem2.rightskewedtree.RightSkewedTree.Node;

//Driver code

public class Main {

	public static void main(String args[]) {

		RightSkewedTree rightSkewedTree = new RightSkewedTree();

		Scanner sc = new Scanner(System.in);
		int value;

		Node root = null;

		// Insert values into BST
		for (int i = 0; i < rightSkewedTree.arr.length; i++) {
			value = rightSkewedTree.arr[i];
			if (root == null) {
				root = rightSkewedTree.insert(root, value);
			} else {
				rightSkewedTree.insert(root, value);
			}
		}

		System.out.println("\nInorder of Binary Tree. Root is: " + root.key + "\n");
		rightSkewedTree.inOrder(root);

		// Inorder traversal of a BST provides us the increasing sequence of the node
		// values.
		// These values are stored in the array declared as "array". These values are in
		// sorted order.
		// Now we insert to create a sorted right skewed BT which will be in ascending
		// order.

		root = null; // re-initializing
		for (int i = 0; i < rightSkewedTree.array.length; i++) {
			value = rightSkewedTree.array[i];
			if (root == null) {
				root = rightSkewedTree.insertRight(root, value);
			} else {
				rightSkewedTree.insertRight(root, value);
			}
		}
		System.out.println("\n\nRoot of right skewed tree is: " + root.key);

		System.out.println("\nRight skewed tree values are: \n");
		rightSkewedTree.rightNodes(root);

		System.out.println("\n\nProgram completed successfully!");
		sc.close();
	}

}
