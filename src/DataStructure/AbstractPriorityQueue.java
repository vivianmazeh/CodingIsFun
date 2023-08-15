package DataStructure;

public abstract class AbstractPriorityQueue<K,V> implements PriorityQueueInterface<K,V> {
	
	public static class PQEntry<K,V> implements Entry<K,V>{
		private K key;
		private V value;
		
		PQEntry(K key, V value){
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			
			return key;
		}

		@Override
		public V getValue() {

			return value;
		}
		public void setKey(K k) {
			this.key = k;
		}
		public void setValue(V v) {
			this.value = v;
		}

	}
		
	private DefaultComparator<K> comp;
	
	AbstractPriorityQueue (DefaultComparator<K> c){
		comp = c;
	}

	AbstractPriorityQueue (){
		this(new DefaultComparator<K>());
	}
	
	public int compare(K a, K b) {
		return comp.compare(a, b);
	}
	
	public boolean checkKey(K key) {
		try {
			return comp.compare(key, key) ==0;
		}catch(ClassCastException e ) {
			throw new IllegalArgumentException("Incompatible key");
		}
	}
	public boolean isEmpty() {
		return size() == 0;
	}

}
