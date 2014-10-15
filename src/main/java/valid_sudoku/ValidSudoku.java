package valid_sudoku;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Determine if a Sudoku is valid.
 * 
 * The Sudoku board could be partially filled, where empty cells are
 * filled with the character '.'.
 * 
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 *
 */

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    	final int NUM = 9;
        boolean[] flags = new boolean[NUM + 1];
        
        // Check rows
        for (int r = 0; r < NUM; r++) {
        	reset(flags);
        	for (int c = 0; c < NUM; c++) {
        		if (!check(board[r][c], flags))
        			return false;
        	}
        }
        
        // Check columns
        for (int c = 0; c < NUM; c++) {
        	reset(flags);
        	for (int r = 0; r < NUM; r++) {
        		if (!check(board[r][c], flags))
        			return false;
        	}
        }
        
        // Check square
        for (int i = 0; i < NUM; i = i + 3) {
        	for (int j = 0; j < NUM; j = j + 3) {
        		reset(flags);
        		for (int r = i; r < i + 3; r++) {
        			for (int c = j; c < j + 3; c++) {
                		if (!check(board[r][c], flags))
                			return false;
        			}
        		}
        	}
        }
        
        return true;
    } 
    
    void reset(boolean[] flags) {
    	for (int i = 0; i < flags.length; i++)
    		flags[i] = false;
    }
    
    boolean check(char ch, boolean[] flags) {
    	if (ch != '.') {
    		int value = Character.getNumericValue(ch);
    		if (flags[value] == true)
    			return false;
    		flags[value] = true;
    	}
    	return true;
    }
}
