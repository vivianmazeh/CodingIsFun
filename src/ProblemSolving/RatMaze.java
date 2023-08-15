package ProblemSolving;
/*
 * requirements:
 * 
 * A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., 
 * maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination.
 *  The rat can move only in two directions: forward and down. 

	In the maze matrix, 0 means the block is a dead end and 1 means the block can be used in the path from source to destination. 
	Note that this is a simple version of the typical Maze problem. For example, 
	a more complex version can be that the rat can move in 4 directions and a more complex version can be with a limited number of moves.
 * 
 * 
 * 
 * 
 * 
 * Algorithm:  

	Create a solution matrix, initially filled with 0’s.

	Create a recursive function, which takes initial matrix, output matrix and position of rat (i, j).

	if the position is out of the matrix or the position is not valid then return.

	Mark the position output[i][j] as 1 and check if the current position is destination or not. 
	If destination is reached print the output matrix and return.
	
	Recursively call for position (i+1, j) and (i, j+1).

	Unmark position (i, j), i.e output[i][j] = 0.
	
	*/
public class RatMaze {
	Object maze[][];
	int size;
	
	RatMaze(Object maze[][]){
		this.maze = maze;
		this.size = maze.length;
	}
	public RatMaze(){}
	public void solution() {
		Object matrix[][] =  new Object[size][size];
		
		//Create a solution matrix, initially filled with 0’s.
		for(int i=0; i< size; i++)
			for(int j = 0; j< size ; j++){
			matrix[i][j] = 0;
		}
		
		if(solutionUntil(maze, matrix, 0,0))
			printoutSolution(matrix);		
		
	}
	
	//Create a recursive function, which takes initial matrix, output matrix and position of rat (i, j).
	public boolean solutionUntil(Object maze[][], Object matrix[][], int x, int y) {
		
		if(reachSolution(x, y, matrix))
			return true;
			
		//	if the position is out of the matrix or the position is not valid then return.
		if(!isValid(maze, x, y)) 
			return false;
		// if the next move is dead end, then mark it to 0 
		if(isDeadEnd(maze, x, y)) {
			matrix[x][y] =0;
			return false;
		}
		//Mark the position output[i][j] as 1 and check if the current position is destination or not. 	
		
		matrix[x][y] = 1;
		//If destination is reached print the output matrix and return.\
		if(reachSolution(x,y, matrix)) return true;
				//Recursively call for position (i+1, j) and (i, j+1).
		if(solutionUntil(maze,matrix, x+1, y)  )
				return true;		
			
		if(solutionUntil(maze,matrix, x, y+1))
			return true;				
		
		return false;
		
	}
	
	public boolean isDeadEnd(Object maze[][], int x, int y) {
		
		if(x == size-1 && y+1 < size && maze[x][y+1].equals(0) || y == size-1 && x +1 < size && maze[x+1][y].equals(0))
			return true;	
		
		return x+1 < size && y+1 < size && maze[x+1][y].equals(0) && maze[x][y+1].equals(0) ;
		
	}
	public boolean reachSolution(int x, int y, Object matrix[][]) {
		return x == size -1 && y == size -1 && matrix[x][y].equals(1);
		
	}
	
	  public boolean isValid(Object maze[][], int x, int y) {

		 return x >=0 && x< size && y>=0 && y < size && maze[x][y].equals(1);
		  
	  }
	public  void printoutSolution(Object matrix[][] ) {
		for(int i =0; i< matrix.length; i++) {
			for(int j =0; j< matrix.length; j++) 
			System.out.print(matrix[i][j]+ " ");
		System.out.println();
		}
		System.out.println();
	}

}
