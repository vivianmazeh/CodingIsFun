package JavaNote;
/*
 * a genetics class improves type safety and eliminates the type cast. 
 * 
 * 
 * */
public class Generics<T extends Number> {
	
	T[] obj;
	Generics(T[] num){
		obj = num;
	}
	
	<T extends Number> Generics(T tag){
		
		System.out.println(tag);
		
	}
	
	public double avg() {
		
		double sum = 0;
		
		for(int i =0; i< obj.length; i++) {
			sum += obj[i].doubleValue();
		}
		return sum/obj.length;
	}
	
	public boolean sameAvg(Generics<?> list)  {
	
		if(list.avg() == avg())	
			return true;
		else 
			return false;
	}
/*
 * Comparable is an interface in java.lang that makes sure that x is comparable with elements in list y
 * The parameter type before boolean in the method specifies the type of object that it compares
 * 
 * */
	public static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		
		for(int i =0; i<y.length; i++) {
			if(x == y[i])
				return true;
		}
		
		return false;
	}
}