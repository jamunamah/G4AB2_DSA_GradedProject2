package com.greatlearning.problem2.rightskewedtree;

public class RightSkewedTree {

	public int[] arr = { 50, 30, 60, 10, 55 };
	public int[] array = new int[arr.length]; // will hold the inorder traversal of the BST
	int i = 0;

	// Node of BST
	public class Node {

		public int key;
		Node left, right;
	}

	// creation of new node
	public Node newNode(int data) {

		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	// Inserting into BST
	public Node insert(Node root, int key) {

		Node newnode = newNode(key);
		Node x = root;
		Node current_pointer = null; // current_pointer maintains pointer to x

		while (x != null) {

			current_pointer = x;
			if (key < x.key)
				x = x.left; // copy to left
			else if (key > x.key)
				x = x.right; // copy to right
			else {
				System.out.println("Value already exists!!!");
				return newnode;
			}
		}

		// If the root is null, the tree is empty.
		if (current_pointer == null)
			current_pointer = newnode; // insert as a new node
		// assign new node node to the left child
		else if (key < current_pointer.key)
			current_pointer.left = newnode;
		// assign the new node to the right child
		else
			current_pointer.right = newnode;
		// return pointer to new node
		return current_pointer;
	}

	// Inorder Traversal
	public void inOrder(Node root) {
		if (root == null)
			return;
		else {
			inOrder(root.left);
			System.out.print(root.key + " ");
			array[i++] = root.key;
			inOrder(root.right);
		}
	}

	// Inserting into Right Skewed Tree
	public Node insertRight(Node root, int key) {

		if (root == null)
			return newNode(key);

		else
			root.right = insertRight(root.right, key);

		return root;
	}

	// Traversing the Right Skewed Tree
	public void rightNodes(Node root) {

		if (root == null)
			return;

		else {

			System.out.print(root.key + " ");
			rightNodes(root.right);
		}
	}

}
