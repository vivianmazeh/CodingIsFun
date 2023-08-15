package DataStructure;

public class ScoreBoard {
	
	private GameEntry[] scoreboard;
	private int numofEntries =0; 

	private java.util.LinkedList<GameEntry> list = new java.util.LinkedList<GameEntry>();
	
	ScoreBoard(int capacity){
		this.scoreboard = new GameEntry[capacity];
	
				
	}
	
	ScoreBoard(java.util.LinkedList<GameEntry> list){
		this.list = list;
	
				
	}
	
	public void add(GameEntry e) {
		
		int existingCapacity = scoreboard.length;
	
		if(existingCapacity >0 && scoreboard[0] == null) {
			scoreboard[0] = e;
			numofEntries++;
		}else {
			if(existingCapacity > numofEntries) {				
				for(int i =0; i< numofEntries; i++) {
					if(e.getScore() > scoreboard[i].getScore() ) {
						for(int j = numofEntries-1; j>=i; j--) {
							scoreboard[j+1] = scoreboard[j];	
						}
						 scoreboard[i] = e;
						 numofEntries++;
						 break;
					}else {
						  if(i == numofEntries-1) {
							  scoreboard[numofEntries] =e;
							  numofEntries++;
							  break;
						  } 
					}					
				}			
		
			}else {
				for(int i =0; i< numofEntries; i++) {
					if(e.getScore() > scoreboard[i].getScore() ) {
						for(int j = numofEntries-1; j>i; j--) {
							scoreboard[j] = scoreboard[j-1];						
						}
						 scoreboard[i] = e;
						 break;
					}
					
				}                                                     
			}
		}
	        
	}
	public void remove(GameEntry e) {
		
		for(int i = 0; i< numofEntries; i++) {
			if(e.getScore() == scoreboard[i].getScore()) {
				for(int j = i; j< numofEntries; j++) {
					if(j +1 == numofEntries) {
						scoreboard[j] = null;
					}else
					 scoreboard[j] = scoreboard[j+1];
				}
				numofEntries--;	
				break;
			}
		}
		
	}
	
	public void printoutboard() {
		
		for(int i=0; i< numofEntries; i++) {
			System.out.println("Name: " + scoreboard[i].getName() +" Score: "+scoreboard[i].getScore());
		}
		System.out.println();
	}


	public void linklistAdd(GameEntry e) {
		if(list.isEmpty()) list.add(e);
		else {
			for(int i =0; i<list.size(); i++) {
				if(e.getScore() > list.get(i).getScore()) {
					
				}
			}
		}
	}
	
	public void linklistRemove(GameEntry e) {
		
	}

	public void printoutLinkedlist()
	{
		for(int i =0; i<list.size(); i++) {
			
			System.out.println("Name: " + list.get(i).getName() +" Score: "+list.get(i).getScore());
			
		}
		System.out.println();
	}

}




