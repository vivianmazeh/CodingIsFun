package DataStructure;

import java.util.*;
import java.util.Map.Entry;


public class MapClass {
	
	Map<Integer, String> table;
	Iterator<Entry<Integer, String>> it;

	MapClass(){
		
	}
	
	MapClass(Map<Integer, String> table){
		this.table = table;
		it = table.entrySet().iterator();	
	}


	public Entry<Integer, String> fristEntry(){
		return it.next();
	}


	public Entry<Integer, String> lastEntry(){
		Entry<Integer, String> last = null;
		while(it.hasNext()) {
			last = it.next();
		}
		return last;
		
	}
	
	//ceilingEntry(k): Returns the entry with the least key value greater than or
	//equal to k (or null, if no such entry exists).
	public Entry<Integer, String> ceilingEntry(int key){
		Entry<Integer, String> temp = null;
		while(it.hasNext()) {
			temp = it.next();
			if(key <= temp.getKey())
				return temp;
		}
		return temp;
	}
	
	//floorEntry(k): Returns the entry with the greatest key value less than or
	//equal to k (or null, if no such entry exists).
	public Map.Entry<Integer, String> floorEntry(int key){

		Stack<Map.Entry<Integer, String>> stack = new Stack<Map.Entry<Integer, String>>();
		
		while(it.hasNext()) {
			stack.add(it.next());
		}
		
		while(!stack.isEmpty()) {
			Map.Entry<Integer, String> pop = stack.pop();
			if(pop.getKey() == key) return pop;
			else if(pop.getKey() > key && stack.peek().getKey() < key)
				return stack.peek();
		}
		return null;		
		
	}
	
	
	
	//lowerEntry(k): Returns the entry with the greatest key value strictly less
	//than k (or null, if no such entry exists).
	public Entry<Integer, String> lowerEntry(int key){
		
		Stack<Map.Entry<Integer, String>> stack = new Stack<Map.Entry<Integer, String>>();
		
		while(it.hasNext()) {
			stack.add(it.next());
		}
		
		while(!stack.isEmpty()) {
			Map.Entry<Integer, String> pop = stack.pop();
			if(pop.getKey() == key) return stack.peek();
			 if(pop.getKey() > key && stack.peek().getKey() < key)
				return stack.peek();
		}
		return null;	
	}
	
	//higherEntry(k): Returns the entry with the least key value strictly greater
	//than k (or null if no such entry exists).
	public Entry<Integer, String> higherEntry(int key){
		Entry<Integer, String> temp = null;
		while(it.hasNext()) {
			temp = it.next();
			if(key < temp.getKey())
				return temp;
		}
		return temp;
	}
	//subMap(k1, k2): Returns an iteration of all entries with key greater than or
	//	equal to k1, but strictly less than k2.
	@SuppressWarnings("null")
	public Map<Integer, String> subMap(int key1, int key2){
		Map<Integer, String> submap = null;
		Entry<Integer, String> temp = null;
		while(it.hasNext()) {
			temp = it.next();
			if(temp.getKey() >= key1 && temp.getKey() <= key2) {
				submap.put(temp.getKey(), temp.getValue());
			}
		}
		return submap;
	}
	
}
