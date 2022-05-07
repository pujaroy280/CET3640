//NAME: Puja Roy
//DATE: 5/6/22
public class NQueenProblem {
	final static int N = 8;
	  
	// This is the function that prints the solution on the output screen
	void printSolution(int chessBoard[][]) {
	for (int i = 0; i < N; i++) {
	for (int j = 0; j < N; j++)
	System.out.print(" " + chessBoard[i][j]
	+ " ");
	System.out.println();
	}
}

	/* This function checks whether a queen can be placed on chessBoard[row][col].
	This function is called recursively when "col" queens are placed
	already in columns from 0 to column -1. The left side might show if the queens are attacking.
	*/
	boolean isSecured(int chessBoard[][], int row, int col) {
	int i, j;
	  
	/* A for loop that checks the left side of attacks */
	for (i = 0; i < col; i++)
	if (chessBoard[row][i] == 1)
	return false;
	  
	/* A for loop that checks the upper diagonal on left side of the board*/
	for (j = col, i = row; i >= 0 && j >= 0; i--, j--)
	if (chessBoard[i][j] == 1)
	return false;
	  
	/* A for loop that checks the lower diagonal on left side of the board*/
	for (j = col, i = row; j >= 0 && i < N; i++, j--) {
	if (chessBoard[i][j] == 1)
	return false;
	   }
	return true;
	}
	  
	/* A recursive function that solves the N Queen problem */
	boolean NQueenProblemSolve(int chessBoard[][], int col) {
	/* If all queens are placed on the board then return the output is true */
	if (col >= N)
	return true;
	  
	/* Places the queen in all rows in the designated column */
	for (int i = 0; i < N; i++) {
	//] Checks if the queen can be placed on chessBoard[i][col] */
	if (isSecured(chessBoard, i, col)) {
	/* Places the queen in chessBoard[i][col] */
	chessBoard[i][col] = 1;
	  
	/* recurse to place rest of the queens */
	if (NQueenProblemSolve(chessBoard, col + 1) == true)
	return true;
	  
	/* If placing queen in chessBoard[i][col]
	doesn't lead to a solution then
	remove queen from chessBoard[i][col] */
	chessBoard[i][col] = 0; // If there is no solution just BACKTRACK
	}
	}
	  
	/* Returns false if the queen cannot be placed in any of the row in the designated column */
	return false;
	}
	  
	/* 8 queen problem is solved using Backtracking recursively.
	The NQueenProblemSolve function returns false if queens
	cannot be placed, else,it returns true and prints placement of queens
	and empty in the form of 1s and 0s. */
	boolean solveNQ()
	{
	int chessBoard[][] = new int[N][N];
	  
	if (NQueenProblemSolve(chessBoard, 0) == false) {
	System.out.print("Solution does not exist");
	return false;
	}
	  
	printSolution(chessBoard);
	return true;
	}
	  
	// Driver program to test above function
	public static void main(String args[])
	{
	NQueenProblem Queen = new NQueenProblem();
	Queen.solveNQ();
	}
	}