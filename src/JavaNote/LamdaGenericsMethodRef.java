package JavaNote;

public class LamdaGenericsMethodRef {
	
	public static <T> int funOf(CountRepeat cr, T[] list,  T ele) {
		
		return cr.countRepeatition(list, ele);
		
	}
	
	static <T> int countRepeatition(T[] vals, T ele) {
		 int count = 0;
		 
		 for(int i =0; i< vals.length; i++) {
			 if(vals[i] == ele)
				 count++;
		 }		 
		 return count;
		
	}

}
