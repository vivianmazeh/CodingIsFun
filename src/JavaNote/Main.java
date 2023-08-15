package JavaNote;

import java.net.MalformedURLException;

public class Main {
	
	


	public static void main(String[] args) {
		
	   //inheritanceExample();
	   abstractClass();
	  // inference();	
	//	thread();
	//	generics();
		//genericsInterface();
	//	LamdaExpression();
	//	genericMethodRef();
	//	try {
	//		networking();
	//	} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
		
	}
	
	public static void inheritanceExample() {
		@SuppressWarnings("unused")
		double vol;


		InheritanceExample inheritance = new InheritanceExample("var arg method");
		InheritanceExample.varargMethod(inheritance.array);// inheitance method from class DataType 
		System.out.println();
		
		InheritanceExample box1 = new InheritanceExample();
		InheritanceExample box2 = new InheritanceExample(10,20,15,34.3);
		InheritanceExample cube = new InheritanceExample(3,2);
		InheritanceExample clone = new InheritanceExample(box2);
		
		vol = box1.volumn();
		System.out.println("Box1 weight: " + box1.weight + " height : " + box1.height + " depth: " +  box1.depth + " width: " + box1.width) ;		
		System.out.println("Box1 volumn: " + box1.volumn());
		System.out.println();
		
		
		vol = box2.volumn();
		System.out.println("Box2 weight: " + box2.weight + " height : " + box2.height + " depth: " +  box2.depth  + " width: " +box2.width) ;
		System.out.println("Box2 volumn: " + box2.volumn());
		System.out.println();
		
		vol = cube.volumn();
		System.out.println("cube weight: " + cube.weight + " size " + cube.depth ) ;
		System.out.println("cube volumn: " + cube.volumn());
		System.out.println();
		
		vol = clone.volumn();
		System.out.println("clone weight: " + clone.weight + " height : " + clone.height + " depth: " +  clone.depth + " width: "+ clone.width) ;	
		System.out.println("clone volumn: " + clone.volumn());
		
		/*
		 * output of the following call: It prints class InheritanceExample
		 * 
		 *method in subclass InheritanceExample will override the method in super class
		 *
		 *why overridden method?
		 *it allows a general class to specify methods that are common to all its derivatives 
		 * */
		box2.overridingMethodInHeritance(); 
		
	}
	
	public static void abstractClass() {
		/*
		 * output of the following call: It prints class DataType
		 * 
		 *it will call the method in superclass 
		 * */
		DataType superclass = new DataType();
		superclass.overridingMethodInHeritance();
		
		/*
		 * abstract class 
		 * */
		AbstractClassRectangle r  = new AbstractClassRectangle(9,5);
		AbstractClassTriangle t = new AbstractClassTriangle(10,8);
		
		AbstractClassFigure figuref;
		
		figuref = r;
		
		System.out.println("Area is " + figuref.area());
		
		figuref = t;
		
		System.out.println("Area is " + figuref.area());
		
		/* super class to subclass
		 * output : rectangle*/
		AbstractClassFigure f = new AbstractClassRectangle();
		f.printMeout();

		/* output : Triangle*/
		AbstractClassRectangle rgc = new AbstractClassTriangle();
		rgc.printMeout();
		
		/* output : Rectangle*/
		((AbstractClassRectangle) f).printMeout();
		
		f=rgc;
		/* output : Triangle*/
		f.printMeout();
		/* output : Triangle*/
		rgc.printMeout();
		
		/*subclass to super class */
		
		
	}
	
	public static void inference() {
		
		/*Inference and Inheritance */
		
		var mc1 = TypeOfInferenceAndInheritance.getObj(1);
		//String meg =  mc1.referredLocalVariable1; This statement gives error because the return type of getObj is Figure in which there is no 
		// string variable referredLocalVariable1, even case 1 returns Rectangle class. in this case, the return type in the method matters. 
		
	}
	

	public static void thread() {
		
		Threads nt = new Threads();
		nt.t.start();
		
		
		 for(int n = 15; n>=0; n--) {
			Synchronization.performAction();
	//		System.out.println("main thread: " + n);
			
		}
	  //    System.out.println("Existing main thread");
	      
	  //    new Threads().testCallMethodWithoutStatic();
		
	}

	
	public static void generics() {
		
		Double[] dnum = {2.5,7.9,6.5,4.0,9.0,8.7};
		Integer[] inum = {3,7,6,2,9,7,7,5};
		Integer[] isnum = {3,7,6,2,9,7,7,5};
		Integer[] num = {1,2,3,4,5,6,7};
		String[] stars = {"one","two","three","four","five","six","seven"};
		
		String newLine = System.lineSeparator();
		
		Generics<Double> gen = new Generics<Double>(dnum);
		Generics<Integer> igen = new Generics<Integer>(inum);
		Generics<Integer> isgen = new Generics<Integer>(isnum);
		
		/*
		 * 
		 * generics on constructor
		 * */
		@SuppressWarnings("rawtypes")
		Generics con = new Generics(100);
		
		@SuppressWarnings("rawtypes")
		Generics conf = new Generics(100.98);
		
		System.out.print(Math.round(gen.avg()*100.0)/100.0 + newLine);
		if(gen.sameAvg(igen)) {
			System.out.println("Same Avage");
		}else
			System.out.println("Different Avage");
		
		if(isgen.sameAvg(igen)) {
			System.out.println("Same Avage");
		}else
			System.out.println("Different Avage");
		
		
		if(Generics.isIn(2, num))
			System.out.println("2 is in the num list" + newLine);
		else
			System.out.println("2 is not in the num list" + newLine);
		
		
		if(Generics.isIn("two", stars))
			System.out.println("two is in the stars list" + newLine);
		else
			System.out.println("two is not in the stars list" + newLine);
		
		if(Generics.isIn(112, num))
			System.out.println("112 is in the num list" + newLine);
		else
			System.out.println("112 is not in the num list" + newLine);
		
		
		if(Generics.isIn("vivian", stars))
			System.out.println("vivian is in the stars list" + newLine);
		else
			System.out.println("vivian is not in the stars list" + newLine);
			
			
	}
	
	public static void genericsInterface() {
		
		Integer inum[] = {1,6,5,9,34,22};
		Character chars[] = {'g','v','m','a','e'};
		
		GenericsMinMax<Integer> imm = new GenericsMinMax<Integer>(inum);
		GenericsMinMax<Character> cmm = new GenericsMinMax<Character>(chars);
		
		System.out.println("The max value in num is " + imm.max());
		System.out.println("The min value in num is " + imm.min());
		System.out.println("The max value in char is " + cmm.max());
		System.out.println("The min value in char is " + cmm.min());
		
		
		
	}
	
	public static void LamdaExpression() {
		
	 int num = 23;
		 
		 String lamda = "Lamda";
		 String expression = "Expression";
		 String lamdaexp = "Lamda adds power to Java";
		 String output = " ";
		/*
		 * You do not need to specify the data type of n
		 * 
		 *  when the left side only has one parameter, it can use n in example test1*/
		LamdaNum test = ( n) -> (n%2 ==0);
		
		LamdaNum test1 = n -> (n%2 ==0);
		
		LamdaString reverseStr = (str) -> {
			
			String reverse = "";
			
			for(int i = str.length()-1; i>=0; i--) {
				
				reverse += str.charAt(i);
				
			}
	
			return reverse;
			
		};
		
		LamdaString upperStr = (inputStr) -> {
			
			String returnVal = "";
			
			for(int i = 0; i< inputStr.length(); i++) {
				returnVal += inputStr.toUpperCase().charAt(i);
			}
			
			return returnVal;
			
		};
		
		 output = LamdaExpression.stringOf(upperStr,lamdaexp);
		 System.out.println( output);
		 output = LamdaExpression.stringOf(reverseStr, lamdaexp);
		 System.out.println();
		 System.out.println( output);
		 
		
		if(test.isEven(num)) {
			System.out.println(num+ " is an even number ");
		}else
			System.out.println(num+ " is an odd number ");
		
		System.out.println();
		
		if(test1.isEven(num)) {
			System.out.println(num+ " is an even number ");
		}else
			System.out.println(num+ " is an odd number ");
		
		
		System.out.println( lamda + " reverse is " + reverseStr.generalString(lamda));
		System.out.println();
		System.out.println( expression + " reverse is " + reverseStr.generalString(expression));
		
		String input  = "Lamda adds power to Java in method reference";
		
		LamdaExpression lmd = new LamdaExpression();
		/*
		 * :: is an static method reference 
		 * :: also can be used with instance object, see the String outputWithObjMethod
		 * Please note that method objReverse is not static 
		 * */
		String reverseInput = LamdaExpression.stringOf(LamdaExpression::methodReferenceReverse, input);
		String outputWithObjMethod = LamdaExpression.stringOf(lmd::objReverse, input);
		
		 System.out.println();
		 System.out.println( reverseInput);
		 
		 System.out.println();
		 System.out.println(outputWithObjMethod);
		
	}
	
	public static void genericMethodRef() {
		Integer vals[] = {1,2,3,4,2,3,4,4,6,5,9,34,22};
		String[] strs = {"one","two","three","four","five","one","two"};
		
		int countVar=0;
		int countstr=0;
		
		int repeatVal =4;
		String repeatStr = "two";
		
		
		countVar = LamdaGenericsMethodRef.funOf(LamdaGenericsMethodRef::countRepeatition, vals, repeatVal);
		System.out.println();
		 System.out.println(repeatVal + " repeats " + countVar +" times");
		 
		countstr = LamdaGenericsMethodRef.funOf(LamdaGenericsMethodRef::countRepeatition, strs, repeatStr);
		System.out.println();
		 System.out.println(repeatStr + " repeats " + countstr +" times");
		
				
		
	}
	
	public static void networking() throws MalformedURLException {
		Networking.showcase();
	}
	
	public static void Synchronization() {
		
		Synchronization.performAction();
	}
}
