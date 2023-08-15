package ProblemSolving;
/*requirements:
 * 
 * in the array range, you can move i+1, i-i, or i+leap as long as the game[i+leap] = 0, game[i+/-1] =0
 * or the destination index is greater than size-1
 * 
 * input example
 * 5 3             game[] size n = 5, leap = 3 
 * 
   0 0 0 0 0       game = [0, 0, 0, 0, 0]
   
 /////// 0 <=leap<100
   
   OUTPUT: YES*/
public class LeapJumpGame {
	
	int leap;
	int[] game;
	int[] moves;
	int size;
	
	LeapJumpGame(int leap, int[] game){
		this.leap  = leap;
		this.game = game;
		moves = new int[]{1,leap, -1,leap};
		size = game.length;
	}
	
	
	public boolean canWin() {
		
		if(travelUntil1(0,game))
			return true;
		
		return false;
	}
	
	public boolean travelUntil(int move, int[]game) {
		
		//base
		if(move >= size-1 || move + leap >= size-1 )
			return true;
		if(move == 0  && game[move+leap] ==1 && game[move+leap+1] == 1)
			return false;
		if(move > 1 && game[move-1] ==1 && move+ leap < size-1 && game[move+1] ==0 && game[move+leap] ==0)
			return false;
		for(int i = 0; i< moves.length; i++) {
			int newmove = moves[i] + move;
			if(newmove >=0 && newmove <= size-1 && game[newmove]==0)
				if(travelUntil(newmove, game))
					return true;
				else 
					return false;
		}
		return false;
	}
	
	public boolean travelUntil1(int move, int[]game) {
		
	
		//base
		if(game[move] == 1) return false;
		if(move >= size-1 && game[move-leap] ==0 || move -1 >0 && game[move-1] ==0) return true;
		if(move > 0 && game[move] == 1 || move < size-1 && game[move] == 1)
			return false;
		if(move < 0 )
			return false;
	
		for(int i = 0; i< moves.length; i++) {
			 move = moves[i] + move;
			 
			if(travelUntil(move, game))
				return true;
		}
		return false;
	}
	public boolean canWinBad() {
        boolean canwin = false;
        int size = game.length;        
        int i =0;
        boolean backforwarded = false;
        boolean moved = false;
        boolean leaped = false;
        while( i < size-1) {
        	 if(i + leap >= size && game[i]==0)  return true;
        	 else {
            	 if( game[i+1] ==0 && !backforwarded) {
            		 if(i+1 >= size-1) return true;
            		 i++;
            		 moved = true;
        
            	 }else if(game[i+ leap] ==0) {
            		 if(i + leap >= size-1) return true;
                	 else i = i+leap;            	
            		 backforwarded = false;
            		 leaped = true;
   
            	 }else {
            		 if(i - 1 >=0 && game[i-1] ==0 ) {
            			 i--;
            			 backforwarded = true;
            		 }
            	 }
            	 if(i + leap < size && game[i+leap] !=0  && game[i+1] !=0 && !moved)
            	 {
            		 if(game[i-1] ==0 )
            		 {
            			 i--;
            			 backforwarded = true;
            		 }
            		 else return false;
           
            	 }
            	 if(!moved && !leaped && !backforwarded)
            		 return false;
        	 }
          }
	       
       
        // Return true if you can win the game; otherwise, return false.
        
        return canwin;
}   
	
}













