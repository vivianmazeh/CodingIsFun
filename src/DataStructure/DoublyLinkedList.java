package DataStructure;

import DataStructure.SingleLinkedList.IntNode;

public class DoublyLinkedList {
	
	Node node = new Node();
	Node head = null;
	Node tail = null;
	
	public DoublyLinkedList(){
		
	}
	
	static public class Node {
		int data;
		Node next;
		Node previous;
		
		public Node() {}
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
			
		}
	}
	
	public void add(int e) {
		Node newNode = new Node(e);
		if(head == null)
		{
			newNode.previous = null;
			head = newNode; 
			tail = newNode;
		
		}else {
			newNode.previous = tail;			
			tail.next = newNode;
			tail = tail.next;
			tail.next = null;
		}
	}
	// Parameter is the index and return is the data 
	public int get(int index) {
		
		return 0;
        
    }
    
    public void addAtHead(int val) {
        
    }
    
    public void addAtTail(int val) {
        
    }
    
    public void addAtIndex(int index, int val) {
    	Node newnode = new Node(val);
    	
    	
        if(index == 0) {       	
        	newnode.next = head;
        	head = newnode;
    
        }else {
        	int count = 0;
        	Node cur = head;
        	
        	
        	while(cur!= null) {
        		if(index == count +1) {
        			if(cur.next != null) {
        				Node tem = cur.next;
        				newnode.next = tem;
        				tem.previous = newnode;
        				cur.next = newnode;
        				newnode.previous = cur;
        				break;
        			}
        			
        			if (cur.next == null){
        				cur.next = newnode;
        				newnode.previous = cur;
        			}
        			
        		}
        		
        		count++;
        		cur = cur.next;
        		
        	}
        }
    }
    
    public void deleteAtIndex(int index) {
        Node cur = head;
        int count = 0;
        
        if(index == 0) {
        	head = head.next;
        	head.previous = null;
        	return;
        }
        while(cur != null) {
        	if(count ==  index -1) {
        		Node next = cur.next.next;
        		cur.next = next;
        		next.previous = cur;
        	}
        	
        	count ++;
        	cur = cur.next;
        	
        }
    }
	
	public void delete(Node node) {
		
	}
	
	
	public int length() {
		
		return 0;
	}
	
	public void printout() {
		
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data + "  ");
			cur = cur.next;
		}
		
		System.out.println();
	}

}
