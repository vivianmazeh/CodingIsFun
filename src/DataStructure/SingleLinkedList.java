package DataStructure;

public class SingleLinkedList<K,V> extends AbstractPriorityQueue<K,V>{

	
	public SingleLinkedList() {}  

	
	static public class IntNode{
		int data;
		IntNode next;
		
		public IntNode() {}
		
		public IntNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	static public class Node {

		public GameEntry e;
		public Node next;
		
	
		
		public Node(GameEntry e) {
			this.e = e;
			this.next = null;
		}
	
	}
	
	static public class NodeQ<K,V> {

		public PQEntry<K,V> entry;
	
		public NodeQ<K,V> next;
		
	
		
		public NodeQ(K k,V v) {
			entry = new PQEntry<K,V>(k,v);
			this.next = null;
		}
	
	}
	
	public static Node head = null;
	public static Node tail = null;
	public static Node pre = null;
	
	public static IntNode h = null;
	public static IntNode t = null;

	@SuppressWarnings("rawtypes")
	public static NodeQ hd = null;
	@SuppressWarnings("rawtypes")
	public static NodeQ tl = null;
	@SuppressWarnings("rawtypes")
	public static NodeQ p = null;
	
	public static void addWithOrder(GameEntry e) {
		
		Node newNode = new Node(e);
		if(head == null)
		{
			head = newNode; 
			tail = newNode;
		}else {
			Node last = head;
			
			if(tail.e.getScore() > newNode.e.getScore())
				{
					tail.next = newNode;
					tail = newNode;
				}
			else if(head.e.getScore() < newNode.e.getScore()){
				 head = newNode;
				 newNode.next = last;
			}else {
					
				while(last.next != null) {
					if(last.next.e.getScore() < newNode.e.getScore()) {
						Node temp;
						temp = last.next;
						last.next = newNode;
						newNode.next=temp;
						break;
					}
				last = last.next;
				}
			}	
		}
	}
	
	public static void add(GameEntry e) {
		Node newNode = new Node(e);
		if(head == null)
		{
			head = newNode; 
			tail = newNode;
		
		}else {
			tail.next = newNode;
			tail = tail.next;
			tail.next = null;
		}
	}
	
	public void add(int e) {
		IntNode newNode = new IntNode(e);
		if(h == null)
		{
			h = newNode; 
			t = newNode;
		
		}else {
			t.next = newNode;
			t = t.next;
			t.next = null;
		}
	}
	
	/*Constraints:

	0 <= index, val <= 1000
	Please do not use the built-in LinkedList library.
	At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
	 * 
	 * 
	 * */
	// Parameter is the index and return is the data 
	public int get(int index) {
		IntNode node = h;
		int val = -1;
		int count = 0;
		while(node != null) {
			if(count == index)
				val = node.data;
			node = node.next;
			count++;
			break;
		}
		return val;
        
    }
    
    public void addAtHead(int val) {
    	IntNode newNode = new IntNode(val);
    	if(h == null) {
    		h= newNode;
        	t = newNode;
    	}else {
    		IntNode node = h;
    		newNode.next = node;
    		h = newNode;
    	}
    	
    }
    
    public void addAtTail(int val) {
    	IntNode newNode = new IntNode(val);
        t.next = newNode;
        t = t.next;
        t.next = null;
        
    }
    
    public void addAtIndex(int index, int val) {
    	IntNode newNode = new IntNode(val);
    	
    	if(index == 0) {
    		addAtHead(val);
    	}
    	else if(index == length()){
    		t.next = newNode;  
    		
    			
    	}else {
    		
    		
        	IntNode current = h;
        	int count = 0;
    		
    		while(current.next != null) {
    			if(count + 1 == index) {
    				IntNode tep = current.next;
    				       		
            		newNode.next = tep;
            		
            		current.next = newNode;
            		t = current;
            		
            		break;
    			}
    			
    			count++;
    			current = current.next;   			
        		
        	}
            
    	}
    	
    
    }
    
    public void deleteAtIndex(int index) {
    	IntNode node = h;
    
    	int count = 0;
    	
    	if(index ==0 ) {
    		h = h.next;
    		return;
    	}
    	while(node != null) {
    		//System.out.print(h.data);
    		if(count == index - 1) {
    			if(node.next == null) {
    				node = null;
    				return;
    			}else {
    				IntNode next = node.next.next;
    				node.next = next;   				     		
    		//		System.out.print(h.data);
        			return;
    			
    			}
    		
    		}
    		
    		node = node.next;
			count++;
    		
    	}
        
    }
    void deleteNode(int position)
    {
        // If linked list is empty
        if (h == null)
            return;
 
        // Store head node
        IntNode temp = h;
 
        // If head needs to be removed
        if (position == 0) {
            h = temp.next; // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        IntNode next = temp.next.next;
 
        temp.next = next; // Unlink the deleted node from list
    }
	
	public int length() {
		IntNode current = h;
		int count = 0;
		
		while(current != null) {
			current = current.next;
			count ++;
		}
			
		return count;
		
	}
	public static void printoutList() {
		Node ref = head;
//		head = head.next;
		while(ref!=null) {
			System.out.println(ref.e.getScore());
			//output:
			//750
			//1105
			//590
			//720
			//510
			ref = ref.next;
			
		}
		System.out.println();
//		while(head!=null) {
//			System.out.println(head.e.getScore());
//			//output:
//			//1105
//			//590
//			//720
//			//510
//			head = head.next;
//			
//		}
	}

	public  void printoutSortedList() {
		@SuppressWarnings("unchecked")
		NodeQ<K,V> ref = hd;

		System.out.println("Sorted List: ");
		while(ref!=null) {
			System.out.println("Key: " + ref.entry.getKey() + " Value: " + ref.entry.getValue());
			ref = ref.next;
			
		}
		System.out.println();

	}
	
	public  void printoutSinglyLinkedList() {
	
		IntNode ref = h;

	
		while(ref!=null) {
			System.out.print(ref.data + "  ");
			ref = ref.next;
			
		}
		System.out.println();

	}
	@Override
	public int size() {
		@SuppressWarnings("unchecked")
		NodeQ<K,V> temp = hd;
		int count =0;
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		
		
		NodeQ<K,V> newNode = new NodeQ<K,V>(key,value);
		if(hd == null)
		{
			hd = newNode; 
			tl = newNode;
		}else {
			NodeQ<K,V> last = hd;
			
			if(compare((K) tl.entry.getKey(),key) <0)
				{
					tl.next = newNode;
					tl = newNode;
				}
			else if(compare((K) hd.entry.getKey(), key) >0){
				 hd = newNode;
				 newNode.next = last;
			}else {
					
				while(last.next != null) {
					if(compare(last.next.entry.getKey() , key) > 0) {
						NodeQ<K,V> temp;
						temp = last.next;
						last.next = newNode;
						newNode.next=temp;
						break;
					}
				last = last.next;
				}
			}	
		}
		
		return newNode.entry;
	}


	@SuppressWarnings("unchecked")
	@Override
	public Entry<K, V> min() {
		if(hd == null)
			return null;
		return (Entry<K, V>)hd.entry;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Entry<K, V> removeMin() {
		if(hd == null)
			return null;
		hd = hd.next;
		return (Entry<K, V>)hd.entry;
		
	}

	
}
