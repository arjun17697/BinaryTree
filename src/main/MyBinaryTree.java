package main;

import main.MyBinaryNode;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

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
		return current == null ? 0 :1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}
	
	// A utility function to search a given key in BST 
	public MyBinaryNode<K> search(MyBinaryNode<K> current,K key) 
	{ int compareResult = key.compareTo(current.key);
		// Base Cases: root is null or key is present at root 
		if (current==null || current.key==key) 
			return current; 

		// val is greater than root's key 
		if (compareResult > 0) 
			return search(current.left, key); 
		else
		return search(current.right, key); 
	} 
	public static void main(String[] args) {
		
	}
}