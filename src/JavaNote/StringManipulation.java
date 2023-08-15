package JavaNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class StringManipulation {
	
	public static int[] intList = { 48, 10, 11, 22, 77, 34, 18 };
	public static String example = "I love algothem, let us do some fun sorting like quick sort and merge sort. it is fun !!";
	public static String breakLine = System.getProperty("line.separator");
	public static List<String> arrayString = new ArrayList<>();
	public static List<Integer> arrayInt = Arrays.asList(48, 10, 11, 22, 27, 34, 18);
	public static List<Integer> arrayInt2 = Arrays.asList(56, 45, 7, 45, 5, 77, 41, 17, 18);
	public static List<Integer> mergedList;


	public void queue() {
	
		int count = 0;
			
		Queue<Character> queue = new LinkedList<Character>();
		for (Character r : example.toCharArray())
		{
			queue.add(r);
		}
			
		while(!queue.isEmpty())
		{
			Character ele = queue.poll();
			if (ele.equals(queue.peek())) {
				count++;
			}
		}
			
		System.out.print(count);System.out.print("Just testing");
			int[] arr = {1,2,3,7,5};
			ArrayList<Integer> list = new ArrayList<Integer>();

		}

		public static void containStr() {
			String str = "ODC-P Polk Auto > New Vehicle Shoppers (In Market) > Make > Small/midsize SUV > 1160";
			str = str.toLowerCase();
			String nameString = "POLK Autos";
			nameString = nameString.toLowerCase();

			if (str.contains(nameString))
				System.out.println("Inclused");
			else {
				System.out.println("Exclused");
			}
		}

//		public static void testRunJobs() {
//			 
//			for(;;) {
//
//				if(window.isEmpty()) {
//					 
//					 for(int i = 0 ; i <3; i++) {
//						 if(!que.isEmpty()) {
//							 JobObj obj = que.poll();
//							 window.add(obj);
//							 System.out.println(obj.job_id + " is running ");
//					
//						 }
//					 }
//											 
//						if(!window.isEmpty()) {
//							 window.get(0).status = "Released";
//						
//							 System.out.println(window.get(0).job_id + " is Released");
//							 window.get(1).status = "Released";
//							 
//							 System.out.println(window.get(1).job_id + " is Released");
//							 
//							 window.get(2).status = "Released";
//							 
//							 System.out.println(window.get(1).job_id + " is Released");
//						}
//					
//				}
//				else if(window.size() == 3) {
//					 int j = 0;
//					while(j <3 && j< window.size()) {
//							// TODO check the Job status  
//						 if(window.get(j).status.equals("Released")) {
//							 window.remove(j);
//							 if(!que.isEmpty()) {
//								 JobObj object = que.poll();
//								 window.add(object);
//								 System.out.println(object.job_id + " is running "); 
//							 }
//							 j--;
//							 
//						 }	
//						 j++;
//						
//					 }
//					
//					if(!window.isEmpty()) {
//						 window.get(0).status = "Released";
//						 System.out.println(window.get(0).job_id + " is Released");
//					}
//					
//					
//				}
//
//				else if(window.size() < 3) {
//						 // checking the status again 
//				int size = window.size();
//				int k = 0;
//				while(k < size) {
//					if(window.get(k).status.equals("Released")) {
//						 window.remove(k);
//					}
//					size = window.size();
//					k++;
//				}
//					 
//						if(!window.isEmpty()) {
//							 window.get(0).status = "Released";
//							 System.out.println(window.get(0).job_id + " is Released");
//						} 
//				}
//
//
//				if(que.isEmpty() && window.isEmpty()) {
//					break;
//				}	
//	}
//	}

	public static int fab(int n) {
		if (n <= 1)
			return 1;
		else
			return fab(n - 1) + fab(n - 2);

	}

	// Square root function
	public static int sqrt(int num) {
		int count = 0;
		int begin = 1;
		while (num - begin >= 0) {
			num -= begin;
			begin += 2;
			count++;
		}
		return count;
	}
}
