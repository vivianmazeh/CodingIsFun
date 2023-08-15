package JavaNote;

public class AbstractClassTriangle extends AbstractClassRectangle {

	String referredLocalVariable2;
	
	
	AbstractClassTriangle(String s){
		super(s);
	};
	AbstractClassTriangle(double a, double b) {
		super(a, b);
	}
	
	AbstractClassTriangle(){}
	

	@Override
	double area() {
		
		return dim1 *dim2 /2;
	}
	
	@Override
	public void printMeout() {
		System.out.println("Triangle");
	}
}
