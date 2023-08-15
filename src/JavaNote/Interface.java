package JavaNote;


/*interface method is the core concept of abstraction and polymorphism
 * it improves abstract class 
 * it allows multiple inheritances 
 * it looses coupling, by using interface, all the methods and classes are independent */



/*Consider using interface when:
 *you expect unrelated classes to implement the interface
 *you want to take advantages of multiple inheritance
 *you can specify a particular behaviors of a data type but not worry about who will implement it 
 *interface classes can be extended 
 *
 * 
 * Consider using abstract class when:
 * you want to share codes among related classes
 * you expect classes that extends the abstract class have some common method and fieds,
 * 
 *  
 *  From Java 8, the interface can have default and static method that can be implemented*/



public interface Interface {
	
	/*
	 * Those methods can be overridden
	 * */
	public static void showcase() {
		System.out.println("Static method can be implemented here");
	}
	
	default void printout() {
		System.out.println("default method can be implemented here");
	}
	
	public String toStringMethod();

}
