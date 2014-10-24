package pascal_triangle_2;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * Return [1,3,3,1]
 * Could you optimize your algorithm to use only O(k) extra space?
*/

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i <= rowIndex; i++) result.add(1);
    	for (int i = 2; i <= rowIndex; i++) 
    		for (int j = i - 1; j > 0; j--)
    			result.set(j, result.get(j) + result.get(j - 1));
    	return result;
    }
}
