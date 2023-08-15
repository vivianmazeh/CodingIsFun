package JavaNote;

public class TypeOfInferenceAndInheritance {
	
	public static AbstractClassFigure getObj (int which) {
		switch(which){
		 
			case 1: return new AbstractClassRectangle("useless string here because the super class Figure is abstract and cannot be undefined");
			default: return new AbstractClassTriangle("useless string here because the super class Rectangle is abstract and cannot be undefined");
		}
	}

}
