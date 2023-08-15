package ProblemSolving;

public class Main {

	public static void main(String[] args) {	

		//pattern();
		//binaryGap();	
//		leapJumpGame();
//		testing();
//		knightTour();
//		ratMaze();
//		NQueen();
//		List<Integer> list = Arrays.asList(10,20,20,10,10,30,50,10,20);
//	
//		MatchingSocks ms = new MatchingSocks(9,list);
//		System.out.print(ms.sockMerchant());

		cutoffRanks();
		findDuplicated();
		
		System.out.print(CountValley.countingValleys(12, "DDUUDDUDUUUD"));

	}
	
	public static void pattern() {
		String mia = " Mia ";
		String eli = " Eli ";
		String ma = " 马云霞 ";
		new PrintPatterns(11, eli).icoslesTriangle();
		new PrintPatterns(11, mia).icoslesTriangle();
		new PrintPatterns(27, ma).icoslesTriangle();
	}
	public static void binaryGap() {

		Integer list[] = {11,25,14,434,747};
		new BinaryGap(list).maxGap();

	}
	//TODO
	public static void leapJumpGame() {
	int[] game = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
		
		if(new LeapJumpGame(6,game).canWin()) {
			System.out.println("Yes");
		}else
			System.out.println("NO");

	
	}

	
	public static void testing() {
		int[] nums= {10, 13, 10,66};
		int[] referenceCopy;
		int[] deepcopy;
		int[] shallowCopy;
		referenceCopy = nums; // did not copy an array
		referenceCopy[0] = 89;

		
		
		
		System.out.println(nums[0]);//89
		System.out.println(referenceCopy[0]);//89
		
		
		deepcopy = nums.clone();// deep copy. two arrays
		deepcopy[1] = 189;

		System.out.println(deepcopy[1]);//189
		System.out.println(nums[1]);//13
		
		shallowCopy = nums.clone();
		shallowCopy[2] = 0;
		
		System.out.println(shallowCopy[2]);//0
		System.out.println(nums[2]);//10
		System.out.println(deepcopy[2]);//10
		
		
	}
	
	public static void knightTour() {
		
		int n = 8;
		new KnightTour(n).solvePuzzle();
//		new KnightTourEx(n).solveKT();
		
//		KnightTour.genNextPrime(14);
	}
	
	public static void ratMaze() {
		
		Object[][] maze = { { 1, 1, 1, 0, 1, 1 },
						 { 1, 0, 1, 1, 0, 1},
		                 { 0, 0, 1, 1, 0, 1 },
		                 { 0, 1, 1, 1, 1, 0 },
		                 { 0, 0, 0, 1, 1, 1},
		                 { 1, 1, 1, 1, 0, 1} };
		
//		for(int i =0; i< maze.length; i++) {
//			for(int j =0; j< maze.length; j++){
//				System.out.print("Maze [ " + i + " ]" + "[ " + j + " ] = " + maze[i][j] +" ");
//			}
//			System.out.println();
//		}
			
		
		new RatMaze(maze).solution();
	}

	public static void cutoffRanks() {

	}

	public static void findDuplicated() {
	}

	public static void fiveStarSeller() {
	}

}
