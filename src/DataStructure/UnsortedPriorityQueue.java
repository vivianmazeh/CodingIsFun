package DataStructure;


import java.util.LinkedList;
import java.util.List;

public class UnsortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {

	private List<Entry<K,V>> list =  new LinkedList<Entry<K,V>>();
	
	UnsortedPriorityQueue(){
		super();
	}
	UnsortedPriorityQueue(DefaultComparator<K> comp){
		super(comp);
	}
	
	@Override
	public int size() {	
		return list.size();
	}

	@Override
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		Entry<K,V> newest = new PQEntry<K,V>(key, value);
		list.add(newest);
		return newest;
	}

	@Override
	public Entry<K, V> min() {
		PQEntry<K,V> min = (PQEntry<K, V>) list.get(0);
		
		for(int i = 1; i< list.size(); i++) {
			int t = compare(min.getKey(), list.get(i).getKey() );
			if(t > 0)			
				min = (PQEntry<K, V>) list.get(i);
		}
		return min;
	}

	@Override
	public Entry<K, V> removeMin() {
		PQEntry<K,V> minum = (PQEntry<K, V>) min();
		list.remove(list.indexOf(minum));
		return minum;
	}
	
	public void printout() {
		for(int i = 0; i< list.size(); i++) {
			System.out.println("Key: " + list.get(i).getKey() + " Value: "+ list.get(i).getValue());
		}
	}

}
