package com.greatlearning.problem2.rightskewedtree;

public class Bst {
	Node root = null;
	Node headNode=null;
	public Node getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	Node curr=null;
	
	public void insert(int data) {
		root = insert(data, root);
	}
	

	
public Node insert(int key, Node root) {
	if(root==null) {
		root = new Node(key);
	}
	else if(key<root.data) {
		root.left =insert(key, root.left);
	}else if(key>root.data) {
		root.right = insert(key, root.right);
	}
	
	return root;
}


public void inorder(Node root) {
	if(root==null)return;
	
	inorder(root.left);
	if(headNode==null) {
		headNode = root;
		curr=root;
	}else {
		curr.right =root;
		curr=curr.right;
	}
	inorder(root.right);
}

public void traverse(Node n) {
	if(n==null) {
		return;
	}
	System.out.println(n.data);
	traverse(n.right);
}
public void printRightSkewedTree() {
	inorder(root);
	traverse(headNode);
}

}
class Node{
	int data;
	public Node(int value) {
		super();
		this.data = value;
		left=null;
		right=null;
	}
	Node left;
	Node right;
}