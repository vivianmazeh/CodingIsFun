package ProblemSolving;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryGap {
	
	Integer[] list;
	public BinaryGap(Integer[] list) {
		
		this.list = list;		
	}
	
	public void maxGap() {
				
		ArrayList<Integer> maxGapList = new ArrayList<>();
		
		for(int i = 0; i< list.length; i++) {
			System.out.print(list[i] + " Binary: " );
			boolean isEven = isEven(list[i]);
			Stack<Integer> stack = new Stack<>();
			stack = converIntegerToBinary(list[i], isEven);
			for(int j =stack.size()-1; j>=0; j--)
				System.out.print(stack.elementAt(j));
			int maxnum = maxgap(stack);
			maxGapList.add(maxnum);

			
			System.out.print(" max gap is: " + maxnum);
			System.out.println();
			
		}

	}
	
	public boolean isEven(int num) {
		
		return num%2 ==0;
		
	}
	
	public Stack<Integer> converIntegerToBinary(int ele, boolean even) {
		Stack<Integer> stack = new Stack<>();
		int it = 0;
		if(ele ==1) {
			stack.add(1);
			
		}else {
			while(ele -2 >=0) {
				it = findMaxPower(ele, even);
				ele = (int) (ele - Math.pow(2, it));
				putBinaryinStack(stack, it);
			}
		}
		
		if(!even)
			stack.set(0, 1);
		return stack;
		
	}
	
	public void putBinaryinStack(Stack<Integer> stack, int it) {
		if(stack.isEmpty()) {
			for(int i =0; i<it; i++) {
				stack.add(0);
			}
			stack.add(1);}
		else {
			stack.set(it, 1);
		}
	}
	public int findMaxPower(int ele, boolean even) {
		int it =0;
		
		if(ele ==2)
			return 1;
		while(ele > (int) Math.pow(2, it)) {
			it++;
		}
		
		return it-1;
	}
	
	public int maxgap(Stack<Integer> stack) {
		int count = 0;
		int max = 0;
		stack.pop();
		while(!stack.empty()) {
			if(stack.peek() == 0) {
				count++;
				stack.pop();
				
			}else {
				if(max < count)
					max = count;
				count =0;
				stack.pop();
			}
		}
		return max;
	}

}
