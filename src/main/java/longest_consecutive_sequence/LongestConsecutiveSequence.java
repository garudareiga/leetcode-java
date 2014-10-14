package longest_consecutive_sequence;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *  
 *  For example,
 *  Given [100, 4, 200, 1, 3, 2],
 *  The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 *  
 *  Your algorithm should run in O(n) complexity.
 */

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
    	/*
    	 * O(nlog(n)): sort
    	 * O(n): hash
    	 */
    	int result = 0;
    	HashMap<Integer, Boolean> numMap = new HashMap<Integer, Boolean>();
    	for (int value : num)
    		numMap.put(value, true);
    	
    	for (Map.Entry<Integer, Boolean> entry : numMap.entrySet()) {
    		if (entry.getValue() == false)
    			continue;
    		numMap.put(entry.getKey(), false);
    		
    		int count = 1;
    		int leftvalue = entry.getKey() - 1, rightvalue = entry.getKey() + 1;
    		while (numMap.containsKey(leftvalue)) {
    			count++; numMap.put(leftvalue, false); leftvalue--;
    		}
    		while (numMap.containsKey(rightvalue)) {
    			count++; numMap.put(rightvalue, false); rightvalue++;
    		}
    		result = Math.max(result, count);
    	}
    	return result;
    }
}
