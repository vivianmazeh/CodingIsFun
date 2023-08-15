package DataStructure;

public class CircularQueue<T>{

	Node<T> head;
	Node<T> tail;

	
	CircularQueue(){}
	
	static class Node<T>{
		private T element;
		public Node<T> next;
		
		Node(T element, Node<T> n){
			this.setElement(element);
			this.next = n;
		}
		Node(T element){
			this.setElement(element);
			this.next = null;
		}
		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Node<T> getNext() {
			return next;
		}
	}
			
	public void enqueue(CircularQueue<T> queue, T t) {
			Node<T> newnode = new Node<T>(t);
			if(queue.head== null) {
				
				queue.head = newnode;
				queue.tail = newnode;}

			else {
				queue.tail.next = newnode;
				queue.tail = queue.tail.next;
				queue.tail.next = null;
			
			}
		}
	

	public int size() {
			int size = 0;
	    	Node<T> tem = head;
	    	while(tem != null)
	    	{
	    		tem = tem.next;
	    		size ++;
	    	}
	    	return size;
	    
	    }
	    
    public boolean isEmpty() {
	    	return size() == 0;
	    }
	    
    public T first() {
	    	if(isEmpty()) return null;
	    	
	    	return head.getElement();
	    }
	    
    public T last() {
	    	
	    	if(isEmpty()) return null;
	 	
	    	return tail.getElement();
	    }
	    
	    /**
	     ∗ Rotates the front element of the queue to the back of the queue.
	     ∗ This does nothing if the queue is empty.
	    */
    public void rotate() {
	    	Node<T> temp = new Node<T>(head.getElement());
	    	 head = head.next;
	    	 tail.next = temp;
	    	 tail = tail.next;
	    	 tail.next = null;
		 
	    }
	    // remove the front of the queue
    public void dequeue() {
			if(head == null) return;
			
			head = head.next;
			
		}
	

}
