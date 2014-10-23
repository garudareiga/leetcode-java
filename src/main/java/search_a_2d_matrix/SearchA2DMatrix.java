package search_a_2d_matrix;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example, 
 * Consider the following matrix:

	[
	  [1,   3,  5,  7],
	  [10, 11, 16, 20],
	  [23, 30, 34, 50]
	]
   Given target = 3, return true
 *
 */

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return false;
    	int rnum = matrix.length, cnum = matrix[0].length;
    	int l = 0, r = rnum*cnum - 1;
    	while (l <= r) {
    		int m = (l + r)/2;
    		int row = m/cnum, col = m%cnum;
    		if (target == matrix[row][col]) return true;
    		else if (target < matrix[row][col]) r = m - 1;
    		else l = m + 1;
    	}
    	return false;
    }
    
    public boolean searchMatrixRecursive(int[][] matrix, int target) {
    	return searchMatrixVert(matrix, 0, matrix.length - 1, target);        
    }
    
    public boolean searchMatrixVert(int[][] matrix, int l, int r, int target) {
    	if (l > r) return false;
    	int m = (l + r)/2;
    	if (target < matrix[m][0]) return searchMatrixVert(matrix, l, m - 1, target);
    	else if (target > matrix[m][matrix[m].length - 1]) return searchMatrixVert(matrix, m + 1, r, target);
    	else return searchMatrixHori(matrix[m], 0, matrix[m].length - 1, target);
    }
    
    public boolean searchMatrixHori(int[] row, int l, int r, int target) {
    	if (l > r) return false;
    	int m = (l + r)/2;
    	if (target < row[m]) return searchMatrixHori(row, l, m - 1, target);
    	else if (target > row[m]) return searchMatrixHori(row, m + 1, r, target);
    	return true;
    }
}
