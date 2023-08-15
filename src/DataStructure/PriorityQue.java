package DataStructure;

import java.util.LinkedList;
import java.util.List;

public class PriorityQue<T> extends AbstractPriorityQue<T>{

	private List<T> que =  new LinkedList<T>();
	public T[] list;
	
	PriorityQue(T[] list){
		this.list = list;
		for(int i =0; i< list.length ; i++) {
			que.add(list[i]);
		}
	}
	
	PriorityQue(){}
	
	@Override
	public int size() {	
		return que.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	@Override
	public int min() {
		T min = que.get(0);
		int minIndex = 0;
		for(int i =1; i< que.size(); i++) {
			if(compare(min,que.get(i)) > 0) {
				min = que.get(i);	
			    minIndex = i;
			}				
		}
		return minIndex;
	}

	@Override
	public T removeMin() {	
		int minIndex = min();
		T min = que.get(minIndex);
		que.remove(minIndex);
		return min;
	}


	

	

}
