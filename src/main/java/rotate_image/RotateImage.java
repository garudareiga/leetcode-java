package rotate_image;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a non-negative number represented as an array of digits, plus one 
 * to the number. The digits are stored such that the most significant digit
 * is at the head of the list.
 * 
 * 1 2    1 3    2 4
 *     ->     -> 
 * 3 4    2 4    1 3
 */

public class RotateImage {
	/*
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 */
    public void rotate(int[][] matrix) {
        int numRows = matrix.length, numCols = matrix[0].length;
        // diagonal swap
        for (int i = 0; i < numRows; i++) {
        	for (int j = i + 1; j < numCols; j++) {
        		swap(matrix, i, j, j, i);
        	}
        }
        // vertical swap
        for (int i = 0; i < numRows; i++) {
        	for (int j = 0; j <= numCols/2 - 1; j++) {
        		swap(matrix, i, j, i, numCols - 1 - j);
        	}
        }
    }
    
    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
    	int temp = matrix[r1][c1];
    	matrix[r1][c1] = matrix[r2][c2];
    	matrix[r2][c2] = temp;
    }
}
