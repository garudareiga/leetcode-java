package missing_range;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a sorted integer array where the range of elements are [0, 99] inclusive, 
 * return its missing ranges.
 * For example, given [0, 1, 3, 50, 75], return [Ò2Ó, Ò4->49Ó, Ò51->74Ó, Ò76->99Ó]
 * 
 * Example Questions Candidate Might Ask:
 * Q: What if the given array is empty?
 * A: Then you should return [Ò0->99Ó] as those ranges are missing.
 * 
 * Q: What if the given array contains all elements from the ranges? 
 * A: Return an empty list, which means no range is missing.
 * 
 */

public class MissingRange {
    public List<String> findMissingRanges(int[] vals, int start, int end) {	
    	int prev = start;
    	List<String> result = new ArrayList<String>();
    	for (int i = 0; i <= vals.length; i++) {
    		int curr = (i == vals.length) ? end + 1 : vals[i]; // trick!!!
    		if (curr - prev > 1) {
    			if (curr - prev == 2) result.add(String.valueOf(curr - 1));
    			else result.add(String.format("%d->%d", prev + 1, curr - 1));
    		}
    		prev = curr;
    	}
    	return result;
    } 
}
