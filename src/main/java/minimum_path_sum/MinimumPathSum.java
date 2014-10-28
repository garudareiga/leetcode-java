package minimum_path_sum;

/**
 * 
 * @author raychen
 * 
 *  Problem:
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom
 right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 */

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	/* 
    	 * Dynamic Programming: minSum_{i, j} = max(minSum_{i-1,j}, minSum_{i,j-1})
    	 */
    	if (grid.length == 0 || grid[0].length == 0) return 0;
        int nr = grid.length, nc = grid[0].length;
        int[] minPathSum = new int[nc];
        minPathSum[0] = 0;
        for (int c = 1; c < nc; c++) minPathSum[c] = Integer.MAX_VALUE;
        for (int r = 0; r < nr; r++) {
        	for (int c = 0; c < nc; c++) { 
        		minPathSum[c] = grid[r][c] + (c == 0 ? minPathSum[c] : Math.min(minPathSum[c - 1], minPathSum[c]));
        	}
        }
        return minPathSum[nc - 1];
    }
}
