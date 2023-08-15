package DataStructure;

public class DefaultComparator<K> implements Comparable<K> {

	@Override
	public int compareTo(K o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public int compare(K a, K b) throws ClassCastException {
		int t = ((Comparable<K>) a).compareTo(b);
		return t;
	}
}
