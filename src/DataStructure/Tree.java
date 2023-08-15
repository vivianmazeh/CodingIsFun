package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree<T> implements TreeInterface<T>{
	
	Node<T> root;
	static class Node<T> {
		
		   T data;
	      Node<T> parent;
	      List<Node<T>> children;
	      
	      Node (T data, Node<T> parent){
	    	  this.data = data;
	    	  this.parent = parent;
	    	  this.children = new ArrayList<Node<T>>();
	      }
	      Node(T data){
	    	  this.data = data;
	    	  this.parent = null;
	    	  this.children = new ArrayList<Node<T>>();;
	      }
	}
	
	Tree(T data){
		this.root = new Node<T>(data);
	}


	@Override
	public Node<T> root() {
		
		return root;
	}

	@Override
	public Node<T> parent(Node<T> p) throws IllegalArgumentException {
	
		if (p.parent == null) return null;
		return p.parent;
	}

	@Override
	public Iterable<Node<T>> children(Node<T> p) throws IllegalArgumentException {
		
		if(p.children.size() ==0) return null;
		return p.children;
	}

	@Override
	public int numChildren(Node<T> p) throws IllegalArgumentException {
	
		return p.children.size();
	}

	@Override
	public boolean isInternal(Node<T> p) throws IllegalArgumentException {
	
		if(p.children.size() !=0 ) return false;
		return true;
	}

	@Override
	public boolean isExternal(Node<T> p) throws IllegalArgumentException {
		if(p.children.size() ==0 ) return true;
		return false;
	}

	@Override
	public boolean isRoot(Node<T> p) throws IllegalArgumentException {
		if(root.equals(p)) return true;
		return false;
	}

	@Override
	public int size() {
		int count = 0;
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node<T> q = queue.poll();
			count++;
			if(q.children.size() > 0) {
				for(int i=0; i< q.children.size(); i++) {
					queue.add(q.children.get(i));
				}
					
			}
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(root.equals(null)) return true;
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Node<T>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Node<T> P) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addChild(T children, T parent) {
		if(root.data.equals(parent)) {
			root.children.add(new Node<T>(children, root));
			return;
		}
		
		Node<T> pa = search(root, parent);
		pa.children.add(new Node<T>(children, pa));
	}
	
	public Node<T> search(Node<T> node, T data) {
		if(node.data == data)
			return node;
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node<T> P = queue.poll();
			if(P.data == data)
				return P;
			
			for(int i=0; i< P.children.size(); i++) {
				// search(P.children.get(i), data);
				if(P.children.get(i).data == data)
					return P.children.get(i);
				else {
				if(P.children.get(i).children.size() >0)
						queue.addAll(P.children.get(i).children);
				}
			}
			
		}
		return node;
	}


	@Override
	public void breathFirstTravel() {
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node<T> q = queue.poll();
			System.out.print(q.data + " ");
			if(q.children.size() > 0) {
				for(int i=0; i< q.children.size(); i++) {
					queue.add(q.children.get(i));
				}
					
			}
		}		
		
	}

}
