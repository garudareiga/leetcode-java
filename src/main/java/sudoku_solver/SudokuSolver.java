package sudoku_solver;

import valid_sudoku.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 */

public class SudokuSolver {
	//ValidSudoku validator = new ValidSudoku();
	
    public void solveSudoku(char[][] board) {
        boolean[][] fixed = new boolean[9][9];
        for (int r = 0; r < 9; r++)
        	for (int c = 0; c < 9; c++)
        		if (board[r][c] != '.')
        			fixed[r][c] = true;
        solve(0, board, fixed);
    }
    
    private boolean solve(int n, char[][] board, boolean[][] fixed) {
    	if (n == 9*9)
    		return true;
    	int r = n/9, c = n%9;
    	if (fixed[r][c] == false) {
    		for (char k = '1'; k <= '9'; k++) {
    			board[r][c] = k;
    			//if (validator.isValidSudoku(board) && solve(n + 1, board, fixed))
    			if (isValid(board, r, c) && solve(n + 1, board, fixed))
    				return true;
    			board[r][c] = '.';
    		}
    		return false;
    	} else {
    		return solve(n + 1, board, fixed);
    	}
    }
    
    private boolean isValid(char[][] board, int r, int c) {
    	int i, j;
    	// Check column
    	for (i = 0; i < 9; i++) 
    		if (i != r && board[i][c] == board[r][c])
    			return false;
    	// Check row
    	for (j = 0; j < 9; j++)
    		if (j != c && board[r][j] == board[r][c])
    			return false;
    	// Check square
    	for (i = 3*(r/3); i < 3*(r/3 + 1); i++)
    		for (j = 3*(c/3); j < 3*(c/3 + 1); j++) 
    			if ((i != r || j != c) && board[i][j] == board[r][c])
    				return false;
    	return true;
    }
}
