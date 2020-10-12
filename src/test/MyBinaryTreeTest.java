package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.MyBinaryTree;

public class MyBinaryTreeTest {

	@Test
	public void treeShouldReturnSize3when3numbersAreAdded() {
		MyBinaryTree<Integer> myBinaryTree= new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(70);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size= myBinaryTree.getSize();
		assertEquals(3, size);
		
	}

}
