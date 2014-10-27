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
 */

public class TwoSum {
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
            if (map.containsKey(numbers[i])) {
                int j = map.get(numbers[i]);
                result[0] = j + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }
}
