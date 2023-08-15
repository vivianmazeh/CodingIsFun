package ProblemSolving;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;


/*
 * Input: arr[] = {100, 50, 50, 25}, R = 3
Output: 3
Explanation:
The players are ranked as: {1, 2, 2, 4}. The players having ranked at most R(= 3) is {1, 2, 2}. Therefore, the total count is 3.

Input: arr[] = {2, 2, 3, 4, 5}, R = 4
Output: 5
 * */
public class CutoffRanks {

	 public static int cutOffRank(int cutOffRank, List<Integer> scores) {
		 
		 int res = 0;
		 int [] cache = new int [101];
		 if(cutOffRank ==0) return 0;
		 if(cutOffRank == scores.size()) return cutOffRank;
		 for(int i=0; i< scores.size(); i++) {
			 cache[i]++;
		 }		 
		 for(int j=100; j>0; j--) {
			 if(cutOffRank<=0) break;
			 cutOffRank -= cache[j];
			 res += cache[j];
			 
		 }
			
		return res;	
	 }	
	 
	 public static int cutOffRankMapMethod(int cutoffranks, List<Integer> scores) {
		 int res =0;
		 //HashMap<Integer, Integer> scoreMap = new HashMap<Integer,Integer>();
		 if(cutoffranks ==0 )return 0;
		 if(cutoffranks == scores.size()) return cutoffranks;
		 TreeMap<Integer, Integer> scoreTreeMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		 for(int ele: scores) {
			 scoreTreeMap.put(ele, scoreTreeMap.getOrDefault(ele, 0)+1);			 
		 }
		for(Entry<Integer, Integer> map: scoreTreeMap.entrySet()) {
			if(cutoffranks>0) {
				cutoffranks -= map.getValue();
				res += map.getValue();
			}
		}
		 return res;
	 }
}
