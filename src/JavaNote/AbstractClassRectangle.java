package JavaNote;

public class AbstractClassRectangle extends AbstractClassFigure {
	
	String referredLocalVariable1;
	
	AbstractClassRectangle(String s){
		super(s);
		
	};
	
	AbstractClassRectangle(double a, double b){
		super(a,b);
		
	}
	AbstractClassRectangle(){}
	@Override
	double area() {
		return dim1 * dim2;
	}
	
	@Override
	public void printMeout() {
		System.out.println("Rectangle");
	}
	
	

}
