package DataStructure;

/*
 * StringBuilder is way faster than chat convert to string*/
public class StringBuilderClass {
	char c;
	int n;

	StringBuilderClass(char c, int n){
		this.c = c;
		this.n = n;
	}
	
	public  String repeatWithString(){
		String answer = "";
		for(int i=0; i<n; i++) {
			answer += c;
		}
		
		return answer;
	}
	
	public String repeatWithStringBuilder(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(c);
		}
		return sb.toString();
		
	}
}
