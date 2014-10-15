package set_matrix_zeroes;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *  
 *  click to show follow up.
 *  
 *  Follow up:
 *  Did you use extra space?
 *  A straight forward solution using O(mn) space is probably a bad idea.
 *  A simple improvement uses O(m + n) space, but still not the best solution.
 *  Could you devise a constant space solution?
 *
 */

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	
    	boolean isFirstRowWithZero = false;
    	boolean isFirstColWithZero = false;
    	for (int c = 0; c < numCols; c++)
    		if (matrix[0][c] == 0) { isFirstRowWithZero = true;	break; }
    	for (int r = 0; r < numRows; r++)
    		if (matrix[r][0] == 0) { isFirstColWithZero = true;	break; }
    	
    	for (int r = 0; r < numRows; r++) {
    		for (int c = 0; c < numCols; c++) {
    			if (matrix[r][c] == 0) {
    				matrix[0][c] = 0;
    				matrix[r][0] = 0;
    			}
    		}
    	}
    	
    	for (int r = 1; r < numRows; r++) {
    		for (int c = 1; c < numCols; c++) {
    			if (matrix[0][c] == 0 || matrix[r][0] == 0) {
    				matrix[r][c] = 0;
     			}
    		}
    	}
    	if (isFirstRowWithZero) {
    		for (int c = 0; c < numCols; c++)
    			matrix[0][c] = 0;
    	}
    	if (isFirstColWithZero) {
    		for (int r = 0; r < numRows; r++)
    			matrix[r][0] = 0;
    	}
    }
}