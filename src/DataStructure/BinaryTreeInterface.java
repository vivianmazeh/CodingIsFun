package DataStructure;

import DataStructure.BinaryTree.Node;;

public interface BinaryTreeInterface<T> extends Iterable<T>{
	
	void insert(Node<T> root, T data);
	Node<T> remove(Node<T> node, T data);
	boolean isIdentical(Node<T> a, Node<T>b);
	boolean internal(Node<T> a);
	boolean external(Node<T> a);
	boolean isRoot(Node<T> node, T data);
	void travelInOrder(Node<T> node);
	void travelPreOrder(Node<T> node);
	void travelPostOrder(Node<T> node);
	int height(Node<T> node);
	int size(Node<T> node );
	Node<T> left(Node<T> node);
	Node<T> parent(Node<T> node, T data);
	Node<T> right(Node<T> node);
	Node<T> sibling(Node<T> node, T data);
	
	T binarySearch(Node<T> node, T data);
	
}
