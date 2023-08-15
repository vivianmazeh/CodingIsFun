package DataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**/
public class Algorithm {
	int[] A;
	int[] B;
	int[] C;

	
	Algorithm(	int[] A,int[] B,int[] C){
		this.A = A;
		this.B = B;
		this.C = C;
		
	}
	
	Algorithm(){}
	

	
	//It returns true if the two/more specified collections have no elements in common.
	public boolean disjoint() {
		
		ArrayList<Integer> common = new ArrayList<>();
		for(int a: A) {
			for(int b:B) {
				if(a==b)
					common.add(a);
			}
		}
		for(int c:C) {
			for(int d: common) {
				if(c==d)
					return false;
			}
		}
		
		return true;
	}
	
	public int recursive(int n) {
		
		if(n ==0)
			return 1;
		else {
			
			return n*recursive(n-1);
		}
		
	}
	
	public boolean binarysearch(int[] list, int target, int low, int high) {
		
		// list must be sorted
		if(list[low] > target || list[high] < target || low > high) return false;
		int middle = (low + high)/2;
		
		if(list[middle] == target || list[low] == target || list[high] == target) return true;
		if(list[middle] < target) 
			return binarysearch(list,target,middle+1,high);
		else {
			return binarysearch(list, target, low, middle-1);
		}	
	}
	
	public int[] reverseArray(int[] data, int low, int high) {
		
		if(high-low <=0 )
			return data;
		
		 int temp = data[low];
		 data[low] = data[high];
		 data[high] = temp;
		 return reverseArray(data, low+1, high-1);	
		
	}
	
	//TODO
	public void permutation(ArrayList<String> str, ArrayList<String> ans, ArrayList<ArrayList<String>> output) {
		
		/*
		 * Set validate duplicated elements 
		 * but Set doesn't have order
		 * 
		 * Arraylist doesn't validate duplicated elements but has order
		 * 
		 * Both are not thread safe. 
		 * Collection.sychronizedSet();
		 * Collection.sychronizedArraylist();
		 * 
		 * HashSet has no order as stated above 
		 * To take advantage of validation of duplicated elements, LinkedHashSet is inserted-ordered. 
		 * */
		
		if(str.size() ==0)
			output.add(ans);
	
		for(int i=0; i< str.size(); i++) {
			ArrayList<String> temp = null;
			for(int j=0; j<=i; j++) {
				temp.add(str.get(j));
			}
			
			permutation(temp,ans,output );		
		}		
	}
	
	//TODO
	public Set<String> combination(){
		Set<String> output = new HashSet<String>();
		
		return output;
	}
	/* Selection sort is repeatedly finding the minimum elements from a list
	 * The time complicity is N^2
	 * */
	public <T> void selectionSort(T[] list) {
		PriorityQue<T> que = new PriorityQue<T>(list);
		for(int i =0; i< list.length; i++) {
			list[i] = que.removeMin();
		}
		printout(list);
	}

	public void margeSort(int[] list) {
		
	}
	
	/*	
	/*
	 * Iterate from arr[1] to arr[N] over the array. 
		Compare the current element (key) to its predecessor. 
		If the key element is smaller than its predecessor, compare it to the elements before. 
		Move the greater elements one position up to make space for the swapped element.
		
		++i : 
	 * */

	public void insertSort(int[] list) {
			int size = list.length;

	        for (int i = 1; i < size; ++i) {
	            int key = list[i];
	            int j = i - 1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && list[j] > key) {
	            	list[j + 1] = list[j];
	                j = j - 1;
	            }
	            list[j + 1] = key;
	        }
//			for(int i =0 ; i< size; ++i) {
//				int key = list[i];
//				int j = i+1;
//					while(j >= 0 && j < size && key > list[j]) {					
//						swap(list, i, j);
//						key = list[j--];
//				}
//			  }
//			
//			
			for(int i = 0; i< list.length; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println();
		}
	
	public void swap(int[] list, int x, int y) {		
		int temp = list[x];		
		list[x] = list[y];
		list[y] = temp;
	}
	/*
	 * */
	public void bubbleSort(int[] list) {
		
	}
	/*
	 * */
	public void heapSort(int[] list) {
		
	}
	/*
	 * */
	public void quickSort(int[] list) {
		
	}
	public void bucketSort(int[] list) {
	/*
	 * */	
	}
	
	public <T>void printout(Object[] list) {
		
		for(int i = 0; i< list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
