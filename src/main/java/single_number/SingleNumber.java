package single_number;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given an array of integers, every element appears twice except for one. Find that single one.
 *  
 *  Note:
 *  Your algorithm should have a linear runtime complexity. Could you implement it without using 
 *  extra memory?
 */

public class SingleNumber {
    /*
     * Bit manipulation: 
     * XOR will return 1 only on two different bits. If two 
     * numbers are the same, XOR will return 0.
     */
    public int singleNumber(int[] A) {
        int result = 0;
        for (int a : A) {
            result = result ^ a;
        }
        return result;
    }
}
