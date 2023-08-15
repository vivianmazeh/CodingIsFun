package DataStructure;

import java.util.Iterator;
import java.util.Stack;

/*
 * A binary tree is a recursive tree data structure where each node can have 2 children at most. 
 * 
 * Property 1: The number of total nodes on each “level” doubles as you move down the tree.
   Property 2: The number of nodes on the last level is equal to the sum of the number of nodes on all other levels, plus 1
   
   
   if the new node’s value is lower than the current node’s, go to the left child
   if the new node’s value is greater than the current node’s, go to the right child
   when the current node is null, we’ve reached a leaf node, we insert the new node in that position
   
   
   The Maximum number of nodes in a binary tree of height ‘h’ is 2h – 1. 
   1) The maximum number of nodes at level ‘l’ of a binary tree is 2l. 
   
	3) In a Binary Tree with N nodes, minimum possible height or the minimum number of levels is Log2(N+1).
 * 
 * */
public class BinaryTree<T extends Comparable<T>> implements BinaryTreeInterface<T>{

	static class Node<T> {
		
		   T data;
	      Node<T> left;
	      Node<T> right;
	      
	      Node (T data2){
	    	  this.data = data2;
	    	  left = null;
	    	  right = null;
	    	
	      }
	      
	      Node(){
	    	  this.data = null;
	    	  this.left = null;
	    	  this.right = null;
	      }
	}
	
	Node<T> root;
	Integer[] integers;
	BinaryTree(T data){
		root = new Node<T>(data);
	
	}
	
	BinaryTree(){
		root = null;
	}
	
	BinaryTree(Integer[] integers){
		root = null;
		this.integers = integers;
		buildTree();
	
	}
	
	@SuppressWarnings("unchecked")
	public Node<T> buildTree() {
		
		for(int i = 0; i< integers.length ; i++) {			
			root = binaryInsert(root, (T)integers[i]);
			
		}		
		travelInOrder(root);
		System.out.println();
		return root;
		
		
	}

	/*
	 * The in-order traversal consists of first visiting the left sub-tree, then the root node, 
	 * and finally the right sub-tree. There are more ways to traverse a tree. Let’s check them out.
	 * */
	public  void travelInOrder(Node<T> node) {
		
		if(node == null) return;
		
		travelInOrder(node.left);
		System.out.print(node.data + " ");
		travelInOrder(node.right);	
	}

	/*
	 * In Pre-order traversal you visit the root node first, then the left subtree, 
	 * and finally the right subtree. Here’s the code.
	 * */
	public  void travelPreOrder(Node<T> node) {
		if(node == null) return;
		
		System.out.print(node.data + " ");
		travelPreOrder(node.left);		
		travelPreOrder(node.right);	
		
		
	}
	/*
	 * 
	 * In Post-order traversal you visit left subtree first, then the right subtree, 
	 * and the root node at the end. Here’s the code.
	 * */
	public  void travelPostOrder(Node<T> node) {
		if(node == null) return;
		
		travelPostOrder(node.left);		
		travelPostOrder(node.right);
		System.out.print(node.data + " ");
		
	}
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isIdentical(Node<T> a, Node<T> b) {
		 if(a!= null && b == null || a== null && b != null) {
			return false;
		}
		 else if( a.data != b.data) return false;

		else
			if(a.left != null && b.left != null) {
			if( !isIdentical(a.left, b.left) || !isIdentical(a.right, b.right))
				return false;
		}
		return true;		
	}
	@Override
	public T binarySearch(Node<T> node, T data) {
		if(node == null) return null;
		if(node.data.equals(data))
			return data;
		if(node.data.compareTo(data) >0 )
			return binarySearch(node.left, data);
		else if(node.data.compareTo(data) < 0 )
			return binarySearch(node.right, data);
		return data;
	}
	@Override
	public int height(Node<T> node) {
		if(node == null) return 0;
		
		return( 1 + Math.max(height(node.left), height(node.right)));
		
	}
	@Override
	public Node<T> parent(Node<T> node, T data) {
		
		if(node.left != null && node.left.data == data || node.right != null && node.right.data == data)
			return node;
		if(node.left != null)
			return parent(node.left, data);
		else if(node.right != null)
			return parent(node.right, data);
	
		return node;
		
		
	}
	@Override
	public Node<T> left(Node<T> node) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Node<T> right(Node<T> node) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Node<T> sibling(Node<T> node, T data) {
		Node<T> parent = parent(node, data);
		if(parent.left.data == data)
			return parent.right;
		return parent.left;
	}
	@Override
	// only remove one node, does not remove its children
	public Node<T> remove(Node<T> node, T data) {
		// found the node
	    if(node.data == data) {
	    	if(external(node)) {
	    		node = null;
	    		return node;
	    	}else {
	    		Node<T> temp = node;
	    		node = parent(node, data);
	    		node = insertNode(node, temp);	    		
	    	}
	    }
		if(node.left != null)
			node.left = remove(node.left, data);
		if(node.right != null)
			node.right=	remove(node.right, data);
				return node;
		
	}

	public Node<T> insertNode(Node<T> node,Node<T> temp ){
		if(temp == null) return node;
	
		while(temp.left != null || temp.right != null) {
			if(temp.left != null)
				return insertNode(node, temp.left);
			if(temp.right != null)
				return insertNode(node, temp.right);
		}
		return node;
	}
	@Override	
	// the total node of the tree
	public int size(Node<T> node) {
		if(node == null) return 0;
		else return 1 + size(node.left) + size(node.right);	
	}

//node must not equal to null
	
	@Override
public void insert( Node<T> node, T value )
{
		if(node == null) 
			{
				node = new Node<T>(value);
				return;
			}
		if( value.compareTo(node.data) <0) {
			if( node.left != null ) {
				insert( node.left, value );
			} else {
				System.out.println( "  Inserted " + value + " to left of node " + node.data );
				node.left = new  Node<T>(value);
			}
		} else if( value.compareTo(node.data) > 0) {
			if( node.right != null ) {
			insert( node.right, value );
		} else {
			System.out.println( "  Inserted " + value + " to right of node " + node.data);
			node.right = new  Node<T>( value );
		}
	}
}
	
	public Node<T> binaryInsert( Node<T> node, T value )
	{
		    if(node == null) return new Node<T>(value);

			if( value.compareTo(node.data) <0) {
				if( node.left != null ) {
					binaryInsert( node.left, value );
				} else {
					System.out.println( "  Inserted " + value + " to left of node " + node.data );
					node.left = new  Node<T>(value);
				}
			} else if( value.compareTo(node.data) > 0) {
				if( node.right != null ) {
					binaryInsert( node.right, value );
			} else {
				System.out.println( "  Inserted " + value + " to right of node " + node.data);
				node.right = new  Node<T>( value );
			}
		}
			return node;
	}

	@Override
	// leave node
	public boolean external(Node<T> node) {
		if(node.left == null && node.right == null)
			return true;
		return false;
	}

	@Override
	public boolean internal(Node<T> node) {
		if(node.left != null || node.right != node)
			return true;
		return false;
	}

	@Override
	public boolean isRoot(Node<T> node, T data) {
		Stack<T> stack = new Stack<T>();
		if(node == null) return false;
		stack = findRoot(node, stack);
		if(stack.pop() == data)
			return true;
		return false;
	}

	public  Stack<T> findRoot(Node<T> node, Stack<T> stack) {
		if(node == null) return stack;
		
		findRoot(node.left, stack);		
		findRoot(node.right, stack);
		stack.add(node.data);
		return stack;
	}

}