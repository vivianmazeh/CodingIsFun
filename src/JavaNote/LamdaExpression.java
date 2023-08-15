package JavaNote;

/*
 * Runnable is a functional interface that only has one purpose and is a single abstract method.
 * 
 * Lamda Expression has two part: the left part is the parameters and left part is the lamda body that has two expressions- single line of code or a block code
 * 
 * 
 * 
 * 
 * 
 * */
public class LamdaExpression {
	
	
	
	public static String stringOf(LamdaString str, String s) {		
		return str.generalString(s);
	}

	
	public static String methodReferenceReverse(String str) {
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			reverse += str.charAt(i);
			
		}

		return reverse;
		
		
	}
	
	public String objReverse(String str) {
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			reverse += str.charAt(i);
			
		}

		return reverse;
		
		
	}
}
