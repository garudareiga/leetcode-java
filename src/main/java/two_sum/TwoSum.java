package two_sum;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * where index1 must be less than index2. Please note that your returned answers 
 * (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * Follow ups:
 * It should support the following operations: add and find.
 * 1) add(input)
 * 2) find(value): find if there exists any pair of numbers which sum is equal to the value.
 */

public class TwoSum {
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	class NumObj implements Comparable<NumObj> {
		public int value;
		public int index;
		NumObj(int val, int idx) {
			value = val;
			index = idx;
		}
		
		public int compareTo(NumObj obj) {
			return this.value - obj.value;
		}
	}
	
    public int[] twoSum(int[] numbers, int target) {
        /*
         * Time complexity: O(nlog(n))
         * Space complexity: O(1)
         */
        ArrayList<NumObj> numList = new ArrayList<NumObj>();
        for (int i = 0; i < numbers.length; i++) {
        	numList.add(new NumObj(numbers[i], i + 1));
        }
        Collections.sort(numList);
        
        int[] result = new int[2];
        for (int i = 0, j = numList.size() - 1; i < j; ) {
        	int currTarget = numList.get(i).value + numList.get(j).value;
        	if (currTarget < target) {
        		i++;
        	} else if (currTarget > target) {
        		j--;
        	} else {
        		if (numList.get(i).index < numList.get(j).index) {
	        		result[0] = numList.get(i).index;
	        		result[1] = numList.get(j).index;
        		} else {
        			result[0] = numList.get(j).index;
	        		result[1] = numList.get(i).index;
        		}
        		break;
        	}
        }
        return result;
    }
    
    public int[] twoSumHash(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length == 0) return result;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i]))
            	return new int[] {map.get(numbers[i]) + 1, i + 1};
            else
                map.put(target - numbers[i], i);
        }
        return result;
    }
    
    public void add(int value) {
    	int count = hm.containsKey(value) ? hm.get(value) : 0;
    	hm.put(value, count + 1);
    }
    
    public boolean find(int value) {
    	for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
    		int x = entry.getKey();
    		int y = value - x;
    		if (x == y && entry.getValue() >= 2)
    			return true;
    		else if (hm.containsKey(y))
    			return true;
    	}
    	return false;
    }
}
