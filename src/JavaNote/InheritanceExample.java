package JavaNote;

public class InheritanceExample extends DataType {
	
	int array[];
	
	double weight;
	
	InheritanceExample(String msg){
	
	array = new int[4];
	int length = array.length;
	 int ele = length;
		for(int i=0; i < length; i++) {
		   ele--;
			array[i]= ele;
			System.out.println(msg +  "  ");
			System.out.print( array[i]);
		}				
	};
	
	InheritanceExample(){
		super();// when a class calls super(), it immediately call the super class constructor
		weight = -1;
	};
	InheritanceExample(InheritanceExample obj){
		super(obj);
		this.weight = obj.weight;
	};
	InheritanceExample(double width, double height, double depth, double weight){
		super(width, height, depth);
		this.weight = weight;
	};
	InheritanceExample(double cubeSize, double weight){
		super(cubeSize);
		this.weight = weight;
	};
	
	@Override
	public void overridingMethodInHeritance() {
		System.out.println("It prints class InheritanceExample");
	}

}
