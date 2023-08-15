package ProblemSolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MatchingSocks {
	int n;
	static List<Integer> ar;
	
	MatchingSocks(int n, List<Integer> ar ){
		this.n =n;
		this.ar = ar;
	};
	
	
	 public int sockMerchant() {
		    // Write your code here
		    
		    List<Integer> output = new ArrayList<>();
		    Stack<Integer> stack = new Stack<Integer>();
		  
			stack.addAll(ar);
		
		    
		    Queue<Integer> q = new LinkedList<Integer>();
		    
		    while(!stack.isEmpty()){
		    	int pop = stack.pop();
		    	boolean match = false;
		       for(Integer ele: q){
		            if(ele.equals(pop)){
		             
		                q.remove(ele);
		                output.add(ele);
		                match = true;
		                break;
		            }  
		            
		            
		        };
		      if(!match)
		    	  q.add(pop);  
		    }	
		    
		    return output.size();

		    }

}
