package ProblemSolving;

/*Requirements: please refer to the description on this website
 * 
 * https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
 * 
 * 
 * 
 * */

public class CountValley {
	
	 public static int countingValleys(int steps, String path) {
		    // Write your code here
		    
		        int valley = 0;
		        int total = 0;
		        int stepswalked = 0;
		        int [] intpath = new int[steps];
		        char[] charpath = path.toCharArray();
		        for(int i=0; i< charpath.length; i++){
		            if(charpath[i] == 'U')
		                intpath[i] = 1;
		            else 
		                intpath[i] = -1;
		        }
		        
		        for(int j =0; j< intpath.length; j++){
		            total += intpath[j];
                   
		            if(total ==0){
                        
                       if(intpath[j-stepswalked] == -1){   
                            valley ++;
                        } 
                        
                        stepswalked = -1;
                    }  
                     stepswalked ++;
		        }
		        
		        
		        return valley;

		    }

		


}
