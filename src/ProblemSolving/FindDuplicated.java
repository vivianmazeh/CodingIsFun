package ProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicated {
	
	public List<Integer> list = new ArrayList<Integer>();
	
	public FindDuplicated(List<Integer> list){
		this.list = list;
	}
	
	public List<Integer> returnDuplicated(){
		
		
		
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i< list.size(); i++ ) {
			if(map.containsKey(list.get(i))){
				map.replace(list.get(i), 1);
			}else {
				map.put(list.get(i), 0);
			}
			
		}
		for(java.util.Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() >0)
				res.add(entry.getKey());
		}
		
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i)+"  ");
		}
		
		
		return res;
		
	}

}
