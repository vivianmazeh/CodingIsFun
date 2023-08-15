package JavaNote;

public class DataType {
	
	

	
	
	static int total_days[];   // Physically, this array does not exist
	/*
	 * Key word: static 
	 * 
	 * when a member is declared static, it can be accessed before any objects of its class are created without reference to any objects
	 * static variables are global variables 
	 * 
	 * static variables and methods cannot refer to this or super in anyway
	 * */
	

	final double pi = 3.1415; // final is constant variable that cannot be modified. it has three purposes:
	                          // 1: constant variables 2: prevent methods from overriding 3: prevent methods from inheritance 
	
	
	/*
	 * You cannot assign values here, for example it will occur errors if you assign total_days = new int [4];
	 * 
	 * 
	 * */
	
	
	/*The following declaration works */
	int[] days = new int[8];
	
	 double width;
	 double height;
	 double depth;
	
	
	/*
	 * This is the constructor that can initialize the variables. 
	 * Constructors are executed in the order of derivation from super class to sub class regardless if super() is used 
	 * */
	DataType(DataType obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}
	DataType(){
		this.width = -1;
		this.height = -1;
		this.depth = -1;
	};
	
	DataType(double width, double height, double depth){
		this.width = width;
		this.depth = depth;
		this.height = height;
		
	}
	
	DataType(double cubeSize){
		this.depth = cubeSize;
		this.height = cubeSize;
		this.width = cubeSize;
	}
	
	public double volumn() {
		return this.depth * this.height * this.width;
	}
	
	public void overridingMethodInHeritance() {
		System.out.println("It prints class DataType");
	}
	
	public static void varargMethod(int ... v) {
		System.out.println("the varargMethod(int ... v): number of arg is " + v.length + " the context is : ");
		for(int x : v) {
			System.out.println(x);
		}
		
		System.out.println();
	}

	

}
