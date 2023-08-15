package DataStructure;

import java.util.Stack;

public class StackClass {
		
	StackClass(){}

	
	public static void reverseAnArrayUsingStack(Object list[]) {
		
		Object reversedList[] = new Object[list.length];
		int  j =0;
		Stack<Object> s = new Stack<>();
		for(int i = 0; i < list.length; i++) {
			s.push(list[i]);
		}
		
		while(!s.empty()) {
			reversedList[j] = s.pop();
			j++;
		}
		
		printout(reversedList);
		
	}
	
	public static void printout(Object list[]) {
		for(int i =0; i< list.length ; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

}
