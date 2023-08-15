package JavaNote;

/*Abstract class is a super class that generalized the forms that can be shared with all its derivatives without implementations, le
 * leaving the subclasses to fill all the details 
 * 
 * abstract class has no new operator
 * 
 * abstract class cannot declare abstract constructors 
 * 
 * abstract class has no static method
 * */
public abstract class AbstractClassFigure {
	
	double dim1;
	double dim2;
	
	AbstractClassFigure(String s){
		System.out.println(" ");
	}
	AbstractClassFigure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	AbstractClassFigure(){}
	abstract double area();
	
	/*
	 * Key word final prevents overridden this method from any its derivative 
	 * 
	 * When a class declare final, no classes can extends/inheritance from this calss
	 * */
	final public void printout() {
		System.out.println("This method cannot be overridden because the key word final");
	}
	
	public void printMeout() {
		System.out.println("Figure");
	}

}

