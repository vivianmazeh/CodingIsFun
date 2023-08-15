package Algorithm;

import ProblemSolving.RatMaze;

/*The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other
 * by not attacking each other, it means one queen only can be placed in one column and one row, and one diagonal
 * 

 * 
 * boolean findSolutions(n, other params) :
    if (found a solution) :
        displaySolution();
        return true;

    for (val = first to last) :
        if (isValid(val, n)) :
            applyValue(val, n);
            if (findSolutions(n+1, other params))
                return true;
            removeValue(val, n);
        return false;
 * 
 * */
public class NQueen {
	
	int N;
	Object matrix[][];
	
	
	NQueen(int N){
		this.N = N;	
	
		matrix = new Object[N][N];
		for(int i = 0; i< N; i++)
			for(int j =0; j<N; j++)
				matrix[i][j] = 'E';
	}

	boolean solution() {
		
		if(!solutionUntil(0, matrix))
			System.out.println("No solution");
		else
			new RatMaze().printoutSolution(matrix);
		return true;
	}
	
	boolean solutionUntil(int col, Object matrix[][]) {
		
		if(col >= N) return true;
		// check first to last row for every column
		for(int i =0; i< N; i++) {
			if(isSafe(i, col, matrix)) {
				matrix[i][col] ='Q';
				if(solutionUntil(col +1, matrix))
					return true;
				matrix[i][col] = 'E';
			}
		}
		return false;
	}
	
	boolean isSafe(int row, int col, Object matrix[][]) {
		
		int i , j;
		// check the left side 
		for(i =0 ; i< col; i++) 
			if(matrix[row][i].equals('Q'))
				return false;
		// check left diagonal 
		for(i = row, j = col; i >=0 && j>=0; i--, j-- )
			if(matrix[i][j].equals('Q'))
				return false;
		// check the right side of diagonal
		for(i = row, j = col; i < N && j>=0; i++, j-- )
			if(matrix[i][j].equals('Q'))
				return false;
		
		return true;
	}
}
