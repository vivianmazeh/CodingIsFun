package JavaNote;

public class GenericsMinMax<T extends Comparable<T>> implements GenericsInterfaceMinMax<T>{

	T[] obj;
	
	GenericsMinMax(T[] list){
		obj = list;
		
	}
	
	@Override
	public T min() {
		T val = obj[0];
		for(int i =1; i<obj.length; i++) {
			if(val.compareTo(obj[i]) >0) {
				val = obj[i];
				
			}
		}
		return val;
	}

	@Override
	public T max() {
		T val = obj[0];
		for(int i =1; i<obj.length; i++) {
			if(val.compareTo(obj[i]) <0) {
				val = obj[i];
				
			}
		}
		return val;
	}

}
