package pascal_triangle;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return

	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
*/

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
    	LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
    	for (int i = 0; i < numRows; i++) {
    		LinkedList<Integer> curr = new LinkedList<Integer>();
    		for (int j = 0; j <= i; j++) {
    			if (j == 0 || j == i) curr.add(1);
    			else curr.add(result.getLast().get(j - 1) + result.getLast().get(j));
    		}
    		result.add(curr);
    	}
    	return result;
    }
}
