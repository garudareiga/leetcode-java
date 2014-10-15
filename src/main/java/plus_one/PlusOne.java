package plus_one;

/**
 * 
 * @author raychen
 * Problem:
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
        for (int i = digits.length - 1; i >= 0; i--) {
        	int value = digits[i] + 1;
        	digits[i] = value % 10;
        	if (value < 10) 
        		return digits; 	   	
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 0; i < digits.length; i++)
        	result[i + 1] = digits[i];
        return result;
    }
}
