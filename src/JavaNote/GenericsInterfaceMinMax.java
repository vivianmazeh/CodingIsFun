package JavaNote;

public interface GenericsInterfaceMinMax<T extends Comparable<T>>{
	
	T min();
	T max();

}
