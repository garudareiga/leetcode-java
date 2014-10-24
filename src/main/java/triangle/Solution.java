package triangle;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may 
 * move to adjacent numbers on the row below.
 * For example, given the following triangle
 * [
 * 	  [2],
 *   [3,4],
 *  [6,5,7],
 * [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is 
 * the total number of rows in the triangle.
 */

import java.util.*;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.isEmpty() || triangle.get(0).isEmpty()) return 0;
		int[] minPathSum = new int[triangle.get(triangle.size() - 1).size()];
		for (int i = 0; i < minPathSum.length; i++) minPathSum[i] = Integer.MAX_VALUE;
		minPathSum[0] = triangle.get(0).get(0);
		for (int i = 1; i < triangle.size(); i++) {
			for (int j = triangle.get(i).size() - 1; j > 0; j--)
				minPathSum[j] = Math.min(minPathSum[j], minPathSum[j - 1]) + triangle.get(i).get(j);
			minPathSum[0] = minPathSum[0] + triangle.get(i).get(0);
		}
		int result = Integer.MAX_VALUE;
		for (Integer v : minPathSum) result = Math.min(result, v);
		return result;
	}
}
