package ProblemSolving;

/*
 * Many functions in this class use recursive functions
 * 
 * you can only visit one square once, the move rule is one vertical move followed by two horizontal moves, or 
 * one horizontal move with two vertical moves. 
 * 
 * 
 * */
public class KnightTour {
	
	
	int N;
	KnightTour(int N){
		this.N = N;		
	}
	KnightTour(){}
	public boolean solvePuzzle() {
		int[][] board = new int[N][N];
		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        
       
         //fill the board with -1 
        for(int i =0; i< N; i++)
        	for(int j=0; j<N; j++)
        		board[i][j] = -1;
        // set the first square to 0 to start the game
        board[0][0] = 0;
	
        if(!solveUntilByme(0,0,1,board,xMove,yMove)) {
        	System.out.println("Solution does not exist");
            return false;
        } else
        	printBoard(board);
       
    return true;    	
	}
	
	public boolean solveUntilByme(int x, int y, int move, int[][] board, int xMove[], int yMove[]) {
		
		int nextx;
		int nexty;
		if(move == N*N) return true;
		for(int i =0; i< xMove.length; i++) {
			nextx = x + xMove[i];
			nexty = y + yMove[i];
			if(isSafe(board, nextx, nexty)) {
				board[nextx][nexty] = move;
				boolean is = solveUntilByme(nextx, nexty,move +1, board,xMove, yMove);
				if(is)	{
					return true;
				}else {
					board[nextx][nexty] = -1;
					
				}
					
			}
			
		}
		
		return false;
		
	}
		
	public boolean solveUntil(int x, int y, int move, int[][] board,int xMove[], int yMove[]) {
		if(move == N * N) return true;
		int nextxMove;
		int nextyMove;
		for(int i = 0; i< N; i++) {
			nextxMove= x+ xMove[i];
			nextyMove= y+ yMove[i];
			 if(isSafe(board, nextxMove, nextyMove)) {
				 board[nextxMove][nextyMove] = move;
				 
				if( solveUntil(nextxMove,nextyMove, move + 1, board, xMove, yMove ))
					return true;
				else
				{
					board[nextxMove][nextyMove] = -1;
				}
			 }			 		
		}
		return false;
	}
	public boolean isSafe(int[][] board, int hor, int ver) {
		
		return (hor >=0 && ver>=0 && hor < N && ver < N && board[hor][ver] ==-1);
	}	
	
	public void printBoard(int[][] board) {
		for(int i =0; i< N; i++) {
			for(int j =0; j< N ; j++) {
				if(board[i][j]< 10)
					System.out.print(board[i][j] + "   ");
				else
					System.out.print(board[i][j] + "  ");
					
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	public static int genNextPrime(int num) {
	    if (num % 2 == 0) {
	        num = genNextPrime(++num);
	    } else {
	        for (int i = 3; i < (num + 1) / 2; i += 2) {
	            if (num % i == 0) {
	                num += 2;
	                num = genNextPrime(num);
	            }
	        }
	    }
	    return num;
	}
}


