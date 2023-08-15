package DataStructure;

/*Given the total number of persons N and a number k which indicates that k-1 persons are skipped 
 * and the kth person is killed in a circle. The task is to choose the person in the initial circle 
 * that survives.
 * 
 * Input: N = 5 and k = 2
	Output: 3
	Explanation: Firstly, the person at position 2 is killed, 
	then the person at position 4 is killed, then the person at position 1 is killed. 
	Finally, the person at position 5 is killed. So the person at position 3 survives. 
 * */
public class JosephusSolution<T> {
	
	T[] list;
	int k;
	CircularQueue<T> queue = new CircularQueue<T>();
	
	JosephusSolution(T[] list,int k){
		this.list = list;
		this.k = k;
		buildQueue();
		
	}
	
	public CircularQueue<T> buildQueue(){
		
		for(int i = 0; i < list.length ; i++)
		{
			 queue.enqueue(queue,list[i]);		
			 
		}
		return queue;
}
	
	public T josephusSolution() {
		
		while(queue.size() >1) {
			for(int i =0; i < k-1; i++) 
				queue.rotate();
		        queue.dequeue();
		
		}		
		return  queue.first();

	}

}
