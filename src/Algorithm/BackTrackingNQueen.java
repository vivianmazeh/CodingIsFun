package Algorithm;

import java.util.ArrayList;

/*
 * Place N Q to the board so that no Q can attach each other
 * by attaching each other, it means there is no Q adjacent to another q
 * 
 * 
 * 
 * */
public class BackTrackingNQueen {
	
	int[] arr;
	int[][] board;
	int size;
	int N;
	int[][] gameboard;
	
	public BackTrackingNQueen(int[] arr) {
		this.arr = arr;
	}
	
	public BackTrackingNQueen(int[][] board) {
		this.board = board;
		this.size = board.length;
	}
	public BackTrackingNQueen(int N) {
		this.N = N;
		for(int i =0; i< N; i++) {
			for(int j=0; j<N; j++)
				gameboard[i][j] = 0;
		}
		
	}
	/*
	 * function solveNQueens(board, col, n):
    if col >= n:
        print board
        return true
    for row from 0 to n-1:
        if isSafe(board, row, col, n):
            board[row][col] = 1
            if solveNQueens(board, col+1, n):
                return true
            board[row][col] = 0
    return false

function isSafe(board, row, col, n):
    for i from 0 to col-1:
      if board[row][i] == 1:
          return false
    for i,j from row-1, col-1 to 0, 0 by -1:
        if board[i][j] == 1:
            return false
    for i,j from row+1, col-1 to n-1, 0 by 1, -1:
        if board[i][j] == 1:
            return false
    return true

	board = empty NxN chessboard
	solveNQueens(board, 0, N)
	 * 
	 * */
	public boolean nQueensolutionUntil(int col, int[][] board) {
		//this is a base point. if we checked every col for every row, then return true
		if(col >= size) return true;
		
		for(int i = 0; i< size; i++) {
			System.out.println("row: " + i + " col: " + col);
			//if the board is not safe, then go check next row with the same column
			if(isSafe(i,col,board)) {
				//if the board is safe, set the value of current square to 1, then check the next column but from row 0 - size-1.
				board[i][col] =1;	
				//recursive function. if this function return false, then it will execute the next line board[i][col] = 0;
				if(nQueensolutionUntil(col+1, board)) 
						return true;
				//backtrack if nQueenSolutionUnil function returns false. if the function return true, then the boolean function is over				
				board[i][col] =0;
			
			}
		}
		return false;
	}
	
	 public ArrayList<Integer> subarraySum(int[] arr, int n, int s){
		 ArrayList<Integer> res= new ArrayList<Integer>();
			int sum;
			 
			 for(int i =0; i< n; i++){
				 sum = arr[i];
		            for(int j = i+1; j<n; j++){
		            	System.out.println("starting point: " + i + "  next: " + j);
		            	sum += arr[j];
		            	System.out.println("sum: " + sum);
		            	//if the sum == s, then put from i tp j to res arraylist
		            	   if(sum == s){
			                	for(int k = i; k<= j; k++)
			                		res.add(k+1);
			                	return res;
			                }	            	         
		                    //if the sum > s, then move i to next value means changing the starting point to calculate
		                    if(sum > s) {
		                    	sum =0;
		                    	break;
		                    }
		                    //if the sum < s, continue increment the col with the same starting point   	   
			          }
		       
		            
		        }
			 return res;
		 }
	
	
	public boolean isSafe(int row, int col, int[][] board) {
		
			//check column	
		for(int j= 0; j< size; j++) {
			if(board[row][j] == 1) {
				return false;
			}
		}
		
		for(int i= 0; i< size; i++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		if(row -1 >=0 && col-1>= 0 && board[row-1][col-1] == 1) {
			return false;
		}	
		
		if(row +1 < size && col + 1 < size && board[row+1][col+1] == 1) {
			return false;
		}
		
		if(row +1 < size && col - 1 >= 0 && board[row+1][col-1] == 1) {
			return false;
		}
		
		if(row -1 >= 0 && col + 1 < size && board[row-1][col+1] == 1) {
			return false;
		}
		
		return true;
	}
	
	/* The rule for Knight tour game is
	 * 
	 * every square has to be visited once
	 *  you can  move x direction up or down 2 squares then y direction one square 
	 *  you can  move y direction up or down 2 square then x direction one square 
	 *  you can  move x direction up or down 1 square then y direction two square
	 *  you can move y direction up or down 1 square then x direction one square
	 * 
	 * */
	public void KnightTour() {
		
	}
	public void printout() {
		for(int i =0; i< board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printout(ArrayList<Integer> list) {
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
	}
	

}
