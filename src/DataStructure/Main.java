package DataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

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


	public static void main(String[] args) {
		
		
		
		/* This is written in array which is not the best data type for this particular problem. 
		 * requirements
		 * be able to remove someone from board
		 * be able to add someone to board:
		 * 1) if the board seats is full, the potentially board members' score must be higher than the lowest score in the existing board
		 * 2) if board seat is not full, the program needs to insert the gamer in order based on his or her score 
		 * 
		 * the capacity of the board can be specified*/
		
		
		//increment();
	//	game();
		
		/*same requirements as game() function, this is written with the best data type */
	//	gameUaingLinkedList();
		//gameUsingSinglylinedlist();
	//	stringbuilder();
	//	algorithem();
	//	recursive();
	//	binarysearch();
	//	reverseArray();
	//	permutation();
	//	stackClass();
	//	circularQueue();
	//	tree();
	//	binaryTree();
	//	tree();
	//	priorityqueue();
	//map();
		//binaryTreeSearch();
		//singlyLinkedList();
//		doubleLinkedList();
		
		
	}
	
	public static void increment() {
		 // initialize i
        int i = 0;
        System.out.println("Post-Increment");
  
        // i values is incremented to 1 after returning
        // current value i.e; 0
        System.out.println(i++);
        
        System.out.println("value: " + i);
  
        // initialized to 0
        int j = 0;
        System.out.println("Pre-Increment");
  
        // j is incremented to 1 and then it's value is
        // returned
        System.out.println(++j);
        
        System.out.println("value: " + j);
		
	}
	
	public static void game() {
			
		
		ScoreBoard board = new ScoreBoard(6);
		board.add(new GameEntry("Rob", 750));
		board.add(new GameEntry("Mike", 1105));
		board.add(new GameEntry("Rose", 590));
		board.add(new GameEntry("Paul", 720));				
		board.add(new GameEntry("Mike", 510));
		board.add(new GameEntry("Anna", 660));	
	
		board.add(new GameEntry("Jill", 740));
		board.printoutboard();
		
		board.add(new GameEntry("vivian", 140) );
		board.printoutboard();
		
		board.remove(new GameEntry("Paul", 720));
		board.printoutboard();		
	}
	
	public static void gameUaingLinkedList() {
		
		java.util.LinkedList<GameEntry> list = new java.util.LinkedList<GameEntry>();
		
		ScoreBoard board = new ScoreBoard(list);
		
		board.linklistAdd(new GameEntry("Rob", 750));
		board.linklistAdd(new GameEntry("Mike", 1105));
		board.linklistAdd(new GameEntry("Rose", 590));
		board.linklistAdd(new GameEntry("Paul", 720));				
		board.linklistAdd(new GameEntry("Mike", 510));
		board.linklistAdd(new GameEntry("Anna", 660));	
	
		board.linklistAdd(new GameEntry("Jill", 740));
		board.printoutLinkedlist();
		
		board.linklistAdd(new GameEntry("vivian", 140) );
		board.printoutLinkedlist();
		
		board.linklistRemove(new GameEntry("Paul", 720));
		board.printoutLinkedlist();		
	
		
	}
	
	public static void gameUsingSinglylinedlist() {
		
	
		
	SingleLinkedList.addWithOrder(new GameEntry("Rob", 750));
	SingleLinkedList.addWithOrder(new GameEntry("Mike", 1105));
	SingleLinkedList.addWithOrder(new GameEntry("Rose", 590));
	SingleLinkedList.addWithOrder(new GameEntry("Paul", 720));
	SingleLinkedList.addWithOrder(new GameEntry("Mike", 510));
	SingleLinkedList.addWithOrder(new GameEntry("Ali", 1000));
	SingleLinkedList.addWithOrder(new GameEntry("Vivian", 100));

	
	SingleLinkedList.printoutList();
		
	}
	
	public static void stringbuilder() {
		
		/*if you can use StringBuilder, do not use string. because it takes way longer
		 * */
		new StringBuilderClass('v',128000000).repeatWithString();// this will take 265496421 ms
		new StringBuilderClass('v',128000000).repeatWithStringBuilder();// this will take 135 ms to complete this function
	}
	
	public static void algorithem() {
		int[] A = {1,3,6,7,8,4,11};
		int[] B = {22,34,43,12,13,3,66};
		int[] C = {10,11,12,13,16,18,99};
		
		Object[] D = {22,34,43,12,13,3,66};
		int[] l = {22,34,43,12,13,3,66};
		Object[] e = {"ali","vivian","zhuang","eli","mia"};
		
//		System.out.println(new Algorithm(A,B,C).disjoint());
		
		new Algorithm().selectionSort(D);
		new Algorithm().selectionSort(e);
		new Algorithm().insertSort(l);
	}
	
	public static void recursive() {
		int n =12;		
		System.out.println("N: " + n + " Recursive value: " + new Algorithm().recursive(n));
	
	}
	
	public static void binarysearch() {

		int[] list = {1,3,6,7,8,14,15,19,21,29,33,46,58,99,112,145,168,169,199,222,333,345,378,399,467};
		int target1 = 0;
		int target2 = 1000;
		int target3 = 15;
		int target4 = 60;
		int target5 = 399;
		int target6 = 17;
		int target7 = 1;		
		int target8 = 467; 
		int target9 = 400;
		System.out.println("Target: " + target1 + " if in the list:  " + new Algorithm().binarysearch(list, target1, 0, 24));
		System.out.println("Target: " + target2 + " if in the list:  " + new Algorithm().binarysearch(list, target2, 0, 24));
		System.out.println("Target: " + target3 + " if in the list:  " + new Algorithm().binarysearch(list, target3, 0, 24));
		System.out.println("Target: " + target4 + " if in the list:  " + new Algorithm().binarysearch(list, target4, 0, 24));
		System.out.println("Target: " + target5 + " if in the list:  " + new Algorithm().binarysearch(list, target5, 0, 24));
		System.out.println("Target: " + target7 + " if in the list:  " + new Algorithm().binarysearch(list, target7, 0, 24));
		System.out.println("Target: " + target8 + " if in the list:  " + new Algorithm().binarysearch(list, target8, 0, 24));
		System.out.println("Target: " + target9 + " if in the list:  " + new Algorithm().binarysearch(list, target9, 0, 24));
		System.out.println("Target: " + target6 + " if in the list:  " + new Algorithm().binarysearch(list, target6, 0, 24));
	}
	
	public static void reverseArray() {
		//int[] list = {1,3,6,7,8,14,15,19,21,29,33,46,58,99,112,145,168,169,199,222,333,345,378,399,467};
		//int[] list = {1,3,467};
		int[] list = {1,3,467,7};
		//int[] list = {1,3};
		for(int i =0 ; i < list.length; i++)
		{
			System.out.print(list[i]+" , ");
		}
		
		new Algorithm().reverseArray(list, 0, list.length-1);
		
		
		System.out.println();
		for(int i =0 ; i < list.length; i++)
		{
			System.out.print(list[i]+" , ");
		}
	}

//TODO
	public static void permutation() {
	
	ArrayList<String> str = new ArrayList<String>(Arrays.asList("a","b","c"));
	ArrayList<String> ans = new ArrayList<String>();
	
	ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();	

	 new Algorithm().permutation(str , ans, output);
	
	for(ArrayList<String> set : output) {
		
		System.out.print(set +" ");
	}
}

	public static void stackClass() {
	
	Object[] nums=  {1,2,3,4,5,6,7,8,9};
	
	Object[] strs = {"Ali", "Vivian","Zhuang","Eli","Mia"};
	StackClass.reverseAnArrayUsingStack(nums);
	StackClass.reverseAnArrayUsingStack(strs);
}

	public static void circularQueue() {
	String[] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
	String[] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
	String[] a3 = {"Mike", "Roberto"};
	System.out.println("First winner is " + new JosephusSolution<String>(a1, 3).josephusSolution());
	System.out.println("Second winner is " + new JosephusSolution<String>(a2, 10).josephusSolution());
    System.out.println("Third winner is " + new JosephusSolution<String>(a3, 7).josephusSolution());
    System.out.println("Third winner is " + new JosephusSolution<String>(a2, 2).josephusSolution());
}
	
	public static void tree() {
		
		Tree<Integer> root = new Tree<Integer>(1);
		root.addChild(2, 1);
		root.addChild(3, 1);
		root.addChild(4, 1);
		root.addChild(5, 2);
		root.addChild(6, 2);
		root.addChild(7, 3);
		root.addChild(8, 3);
		root.addChild(9, 3);
		root.addChild(10, 3);
		root.addChild(11, 4);
		root.addChild(12, 4);
		root.addChild(13, 5);
		root.addChild(14, 5);
		root.addChild(15, 5);
		root.addChild(16, 8);
		root.addChild(17, 8);
		root.addChild(18, 8);
		
		root.breathFirstTravel();
		System.out.println();
		System.out.println("The size is: " + root.size());
			
	}

	public static void binaryTree() {
		
		BinaryTree<Integer> simpletree = new BinaryTree<Integer>();
//		
//		DataStructures.BinaryTree.Node<Integer> root1 = new DataStructures.BinaryTree.Node<Integer>(79);
//		
//		simpletree.root = root1;
//		
//		simpletree.root.left = new DataStructures.BinaryTree.Node<Integer>(15);
//		simpletree.root.right = new DataStructures.BinaryTree.Node<Integer>(100);
//		
//		simpletree.root.left.left = new DataStructures.BinaryTree.Node<Integer>(7);
//		simpletree.root.left.right = new DataStructures.BinaryTree.Node<Integer>(23);
//		
//		simpletree.root.left.left.left = new DataStructures.BinaryTree.Node<Integer>(1);
//		simpletree.root.left.left.right = new DataStructures.BinaryTree.Node<Integer>(11);
//		
//		simpletree.root.left.right.left = new DataStructures.BinaryTree.Node<Integer>(16);
//		simpletree.root.left.right.right = new DataStructures.BinaryTree.Node<Integer>(25);
//		
//		
//		
//		System.out.println(simpletree.height(root1));
//
//		simpletree.travelInOrder(root1);
//		System.out.println();
//		simpletree.travelPreOrder(root1);
//		System.out.println();
//		simpletree.travelPostOrder(root1);
	
		

		String sep = System.lineSeparator();
		
		DataStructure.BinaryTree.Node<Integer> root2 = new DataStructure.BinaryTree.Node<Integer>(25);
		System.out.println("The root is " + 25 + sep);
		simpletree.insert(root2, 111);
	    simpletree.insert(root2, 11);
		simpletree.insert(root2, 16);
		simpletree.insert(root2, 15);
		simpletree.insert(root2, 23);
		simpletree.insert(root2, 79);
		simpletree.insert(root2, 7);
		simpletree.insert(root2, 100);
		simpletree.insert(root2, 1);
		
		System.out.println("Travel the tree in order: ");
		simpletree.travelInOrder(root2);
		System.out.println();
//		simpletree.travelPreOrder(root2);
//		System.out.println();
//		simpletree.travelPostOrder(root2);
//		System.out.println();
		
		
		root2 = simpletree.remove(root2, 25);
		System.out.println(sep + "removed 25 ");
		simpletree.travelInOrder(root2);
		
//		root2 = simpletree.remove(root2, 111);
//		System.out.println(sep + "removed 111 ");
//		simpletree.travelInOrder(root2);
//		
//		root2 = simpletree.remove(root2, 16);
//		System.out.println(sep + "removed 16 ");
//		simpletree.travelInOrder(root2);

//		System.out.print("Is 7 the root? ");
//		System.out.println(simpletree.isRoot(root2, 7) ==true ? "Yes" :" No");
	
		
//		System.out.println(simpletree.isIdentical(root1, root2) ? "Yes" : "No") ;
		
//		System.out.println("The size of the tree is: " + simpletree.size(root2) + sep);
//		
//		System.out.println("The parent of " + 7 + " is " + simpletree.parent(root2, 7).data + sep);
//		System.out.println("The parent of " + 111 + " is " + simpletree.parent(root2, 111).data + sep);
//		System.out.println("The parent of " + 25 + " is " + simpletree.parent(root2, 25).data + sep);
//		System.out.println(simpletree.isIdentical(root1, root3) ? "Yes" : "No") ;
		
	}
	public static <K, V> void priorityqueue() {
		
		SortedPriorityQueue<K,V> sq = new SortedPriorityQueue<K,V>();
		UnsortedPriorityQueue<K,V> q = new UnsortedPriorityQueue<K,V>();
		
	
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e1 =  (PQEntry<K, V>) new PQEntry<Integer, String>(10000,"Lisa");
		q.insert(e1.getKey(),e1.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e2 =  (PQEntry<K, V>) new PQEntry<Integer, String>(110000,"Ali");
		q.insert(e2.getKey(),e2.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e3 =  (PQEntry<K, V>) new PQEntry<Integer, String>(80000,"Vivian");
		q.insert(e3.getKey(),e3.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e4 =  (PQEntry<K, V>) new PQEntry<Integer, String>(90000,"Elias");
		q.insert(e4.getKey(),e4.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e5 =  (PQEntry<K, V>) new PQEntry<Integer, String>(50000,"Mia");
		q.insert(e5.getKey(),e5.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> e6 =  (PQEntry<K, V>) new PQEntry<Integer, String>(120000,"Ma");
		q.insert(e6.getKey(),e6.getValue());
		
	
	
		q.printout();
//	
//		System.out.println("removed "+ q.removeMin().getValue());
//		q.printout();
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s1 =  (PQEntry<K, V>) new PQEntry<Integer, String>(10,"Lisa");
		sq.insert(s1.getKey(),s1.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s2 =  (PQEntry<K, V>) new PQEntry<Integer, String>(110,"Ali");
		sq.insert(s2.getKey(),s2.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s3 =  (PQEntry<K, V>) new PQEntry<Integer, String>(80,"Vivian");
		sq.insert(s3.getKey(),s3.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s4 =  (PQEntry<K, V>) new PQEntry<Integer, String>(90,"Elias");
		sq.insert(s4.getKey(),s4.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s5 =  (PQEntry<K, V>) new PQEntry<Integer, String>(50,"Mia");
		sq.insert(s5.getKey(),s5.getValue());
		
		@SuppressWarnings("unchecked")
		PQEntry<K, V> s6 =  (PQEntry<K, V>) new PQEntry<Integer, String>(120,"Ma");
		sq.insert(s6.getKey(),s6.getValue());
		
		sq.printout();
		System.out.println("Min: " + sq.min().getKey());
		System.out.println("The size is : " + sq.size());
		sq.removeMin();
		System.out.println("Min is removed");
		sq.printout();
		System.out.println("The size is : " + sq.size());
	}

	public static void map() {
		
		Map<Integer, String> table = new HashMap<Integer, String>();
		
		table.put(10, "vivia");
		table.put(80, "eli");
		table.put(50, "mia");
		table.put(110, "zhuang");
		table.put(56, "wang");
		table.put(190, "Ali");
		table.put(25, "ma");
		
		Map<Integer, String> sortedtable = new TreeMap<Integer, String>(table);
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(table);
		t.floorEntry(7);
		Iterator<Integer> it = sortedtable.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(key + " " + sortedtable.get(key));
		}
		System.out.println();
		java.util.Map.Entry<Integer, String> e = new MapClass(sortedtable).fristEntry();
		System.out.println("First entry " + e.getKey() + " " + e.getValue());
		
		java.util.Map.Entry<Integer, String> en = new MapClass(sortedtable).lastEntry();
		System.out.println("Last entry " + en.getKey() + " " + en.getValue());
		
		System.out.println();
		java.util.Map.Entry<Integer, String> ceil = new MapClass(sortedtable).ceilingEntry(10);
		System.out.println("Ceiling entry of key 10 " + ceil.getKey() + " " + ceil.getValue());		
		java.util.Map.Entry<Integer, String> ceil1 = new MapClass(sortedtable).ceilingEntry(53);
		System.out.println("Ceiling entry of key 53 " + ceil1.getKey() + " " + ceil1.getValue());
		java.util.Map.Entry<Integer, String> ceil2 = new MapClass(sortedtable).ceilingEntry(190);
		System.out.println("Ceiling entry of key 190 " + ceil2.getKey() + " " + ceil2.getValue());
		
		System.out.println();
		java.util.Map.Entry<Integer, String> floor = new MapClass(sortedtable).floorEntry(10);
		System.out.println("Floor entry of key 10 " + floor.getKey() + " " + floor.getValue());		
		java.util.Map.Entry<Integer, String> floor1 = new MapClass(sortedtable).floorEntry(190);
		System.out.println("Floor entry of key 190 " + floor1.getKey() + " " + floor1.getValue());
		java.util.Map.Entry<Integer, String> floor2 = new MapClass(sortedtable).floorEntry(53);
		System.out.println("Floor entry of key 53 " + floor2.getKey() + " " + floor2.getValue());
		java.util.Map.Entry<Integer, String> floor3 = new MapClass(sortedtable).floorEntry(75);
		System.out.println("Floor entry of key 75 " + floor3.getKey() + " " + floor3.getValue());
		
		System.out.println();
		
		java.util.Map.Entry<Integer, String> low = new MapClass(sortedtable).lowerEntry(56);
		if(low == null)
			System.out.println("No entry of 56" );
		else
			System.out.println("lower entry of key 56 " + low.getKey() + " " + low.getValue());
		
		
		java.util.Map.Entry<Integer, String> low1 = new MapClass(sortedtable).lowerEntry(90);
		if(low1 == null)
			System.out.println("No entry" );
		else
			System.out.println("lower entry of key 90 " + low1.getKey() + " " + low1.getValue());
		
		System.out.println();
		java.util.Map.Entry<Integer, String> high = new MapClass(sortedtable).higherEntry(56);
		
		if(high == null)
			System.out.println("No entry" );
		else
			System.out.println("higher entry of key 56 " + high.getKey() + " " + high.getValue());
		
		java.util.Map.Entry<Integer, String> high1 = new MapClass(sortedtable).higherEntry(90);
		
		if(high1 == null)
			System.out.println("No entry" );
		else
			System.out.println("higher entry of key 90 " + high1.getKey() + " " + high1.getValue());
		
		
	}

	public static  <T extends Comparable<T>> void binaryTreeSearch() {
		
		Integer[] list = new Integer[] {0,1000,15,60,399,17,1,467,400};		
	
		BinaryTree<Integer> tree = new BinaryTree<Integer>(new Integer[]{1,3,6,7,8,14,15,19,21,29,33,46,58,99,112,145,168,169,199,222,333,345,378,399,467});

		for(int i=0; i< list.length; i++) {
			Integer value = tree.binarySearch(tree.root, list[i]);
		    if(value == null)
				System.out.println(list[i] + " NOT FOUND");
		    else if(value.compareTo(list[i]) == 0)
		    	System.out.println(list[i] + " WAS FOUND");
		    else
		    	System.out.println("NOT FOUND");
		    	
		}
		
	    
	    
			
	}


	@SuppressWarnings("rawtypes")
	public static void singlyLinkedList() {
		
		SingleLinkedList list = new SingleLinkedList();
	
		list.addAtHead(arr[0]);
		for(int i =1; i< arr.length; i++) {
			list.addAtTail(arr[i]);
		}	
		/*
		 * System.out.println(list.get(0)); System.out.println(list.get(9));
		 * System.out.println(list.get(8)); System.out.println(list.get(5));
		 * 
		 * 
		 * 
		 * list.addAtIndex(0, 0); System.out.println(list.length()); //
		 * list.printoutSinglyLinkedList();
		 * 
		 * // // list.addAtIndex(10, 0); // System.out.println(list.length()); //
		 * list.printoutSinglyLinkedList();
		 * 
		 * list.addAtIndex(5, 0); System.out.println(list.length());
		 * 
		 * list.printoutSinglyLinkedList();
		 */
		  

		  
		  list.deleteAtIndex(8);
		 // list.deleteNode(5);
		  list.printoutSinglyLinkedList();
		 
		
	}


	public static void doubleLinkedList() {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addAtHead(arr[0]);
		for(int i =0; i< arr.length; i++) {
			list.add(arr[i]);
		}	
		
		//list.printout();
		
		//list.addAtIndex(0, 0);
		list.addAtIndex(3,0);
		list.printout();
		list.deleteAtIndex(2);
		list.printout();
	}
	
	public static void doublelinkedlistexample() {
		// just testing
	}

}

