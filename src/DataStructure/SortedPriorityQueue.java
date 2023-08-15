package DataStructure;

public class SortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V>{
	

	SingleLinkedList<K, V> l = new SingleLinkedList<K,V>();
	

	SortedPriorityQueue(){
		super();
	}
	
	SortedPriorityQueue(DefaultComparator<K> comp){
		super(comp);
	}
	
	@Override
	public int size() {
		
		return l.size();
	}

	@Override
	public boolean isEmpty() {
	
		return size()==0;
	}

	@Override
	public Entry<K, V> min() {
		return l.min();
	}

	@Override
	public Entry<K, V> removeMin() {
		
		return l.removeMin();
	}
	
	public void printout() {
		l.printoutSortedList();
	}

	@Override
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		
		return l.insert(key, value);
	}


}
