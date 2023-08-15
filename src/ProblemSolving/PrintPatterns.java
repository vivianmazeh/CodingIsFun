package ProblemSolving;

public class PrintPatterns {
	
	static int size;
	static String name;
	
	PrintPatterns(int num, String name){
		this.size = num;
		this.name = name;
	}
	
	
	public void icoslesTriangle() {
		        
	int space =0;
	int i;
	
		for(i = size; i>=0; i--) {
			
			if(i == 0) {
				
				for(int n =0; n<space-1; n++) {
			    	System.out.print("     "); 
			    }
				System.out.println(name);
			}else {
		
				for(int n =0; n<space; n++) {
			    	System.out.print("     ");
			    }
			for(int j = 0; j< i; j++) {
			   
				System.out.print(name);
				
			}
			}
			space++;
			i--;
			System.out.println();
		}
		
		
	
	}

}
