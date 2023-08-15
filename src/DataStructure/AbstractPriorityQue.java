package DataStructure;

public abstract class AbstractPriorityQue<T> implements PriorityQueInterface<T> {

	
private DefaultComparator<T> comp;
	
	AbstractPriorityQue (DefaultComparator<T> c){
		comp = c;
	}

	AbstractPriorityQue (){
		this(new DefaultComparator<T>());
	}
	
	public int compare(T a, T b) {
		return comp.compare(a, b);
	}
	
}
