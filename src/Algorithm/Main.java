package Algorithm;


import java.util.*;

import DataStructure.AbstractPriorityQueue.PQEntry;



/*
 * object-oriented design gold
 * reusability: some codes can be shared with different system
 * adaptability: run minimal changes on different hardware and operating system
 * robustness: correct output, be able handle unexpected input, if there is error, the application should recover gracefully
 * 
 *  
 *  
 *  
 *  Object-oriented design principles:
 *  
 *  abstraction
 *  Encapsulation
 *  modularity
 *  
 *  
 *  */




public class Main {
	
	 static final int[] arr = {30,40,5,30,40,40, 1,6,9,5,1};
	 static final int[] arr1 = {1,2,3,7,5};
	 static int board[][] = { { 0, 0, 0, 0 },
                              { 0, 0, 0, 0 },
                              { 0, 0, 0, 0 },
                              { 0, 0, 0, 0 } };

	public static void main(String[] args) {
		
		BackTrackingNQueen bt = new BackTrackingNQueen(board);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
//		if(bt.nQueensolutionUntil(0, board)) {
//			bt.printout();
//		}
//		
		list = bt.subarraySum(arr1, 5, 12);
		bt.printout(list);
		


}
}

