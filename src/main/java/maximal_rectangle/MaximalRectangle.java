package maximal_rectangle;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle 
 *  containing all ones and return its area.
 */

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        /*
         * Dynamic programming, for each bottom-right corner of rectangle
         * Time Complexity: O(N*N*N)
         */
    	if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int nr = matrix.length, nc = matrix[0].length;
        
        int maxArea = 0;
        int[][] W = new int[nr][nc];
        for (int r = 0; r < nr; r++) {
        	for (int c = 0; c < nc; c++) {
        		if (matrix[r][c] == '1') {
        			W[r][c] = (c == 0 ? 1 : W[r][c - 1] + 1);
        			
        			// Calculate area of rectangle
        			int minW = Integer.MAX_VALUE;
        			for (int k = r; k >= 0; k--) {	// Go up
        				if (matrix[k][c] == '0') break;
        				minW = Math.min(minW, W[k][c]);
        				maxArea = Math.max(minW*(r - k + 1), maxArea);
        			}
        		}
        	}
        }
        return maxArea;
    }
}
