package spiral_matrix_2;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.
 * 
 * For example,
 * Given n = 3,
 * 
 * You should return the following matrix:
	[
	 [ 1, 2, 3 ],
	 [ 8, 9, 4 ],
	 [ 7, 6, 5 ]
	]
 */

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
    	int[][] result = new int[n][n];
    	if (n == 0) return result;
    	int v = 0, start = 0, end = n - 1;
    	while (start < end) {
    		for (int i = start; i < end; i++) { result[start][i] = ++v; }	// left to right
    		for (int i = start; i < end; i++) { result[i][end] = ++v; }		// top to bottom
    		for (int i = end; i > start; i--) { result[end][i] = ++v; }		// right to left
    		for (int i = end; i > start; i--) { result[i][start] = ++v; }	// bottom to top
    		start++;
    		end--;
    	}
    	if (start == end) result[start][start] = ++v;
    	return result;
    }
}
