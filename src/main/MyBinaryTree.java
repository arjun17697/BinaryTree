package main;

import main.MyBinaryNode;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	public int counter = 0;
	private String branch;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	// A utility function to search a given key in BST
	public MyBinaryNode<K> search(MyBinaryNode<K> current, K key) {
		// Base Cases: root is null or key is present at root
		if (current == null || current.key == key)
			return current;
		int compareResult = key.compareTo(current.key);
		// val is greater than root's key
		if (compareResult > 0) {
			counter++;
			branch = "right";
			current.right=search(current.right, key);
			return search(current.right, key);
		} else if(compareResult < 0){
			counter++;
			branch = "left";
			current.left=search(current.left, key);
			return search(current.left, key);
		} if(compareResult==0) {
			System.out.println( key+ "found at" +counter );
		}
		return current;
	}

	public static void main(String[] args) {

	}
}