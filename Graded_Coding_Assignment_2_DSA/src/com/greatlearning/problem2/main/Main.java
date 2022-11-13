package com.greatlearning.problem2.main;

import com.greatlearning.problem2.rightskewedtree.Bst;

public class Main {
	public static void main(String[] args) {
		Bst bst = new Bst();
		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(10);
		bst.insert(55);

		bst.printRightSkewedTree();

	}

}