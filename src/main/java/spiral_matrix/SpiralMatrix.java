package spiral_matrix;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * 
 * For example,
 * Given the following matrix:

	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]

 * You should return [1,2,3,6,9,8,7,4,5].
 */

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if (matrix.length == 0 || matrix[0].length == 0) return result;
    	int startX = 0, startY = 0, endX = matrix[0].length - 1, endY = matrix.length - 1;
    	while (true) {
    		// from left to right
    		for (int i = startX; i <= endX; i++) { result.add(matrix[startY][i]); }
    		if (++startY > endY) break;
    		// from top to bottom
    		for (int j = startY; j <= endY; j++) { result.add(matrix[j][endX]); }
    		if (--endX < startX) break;
    		// from right to left
    		for (int i = endX; i >= startX; i--) { result.add(matrix[endY][i]); }
    		if (--endY < startY) break;
    		// from bottom to top
    		for (int j = endY; j >= startY; j--) { result.add(matrix[j][startX]); }
    		if (++startX > endX) break;
    	}
    	return result;
    }
}
