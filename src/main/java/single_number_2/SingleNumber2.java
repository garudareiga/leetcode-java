package single_number_2;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given an array of integers, every element appears three times except for one. 
 *  Find that single one.
 */

public class SingleNumber2 {
    public int singleNumber(int[] A) {
        // Java int is 32-bit
        int[] bitCount = new int[32];
        for (int a : A) {
        	for (int i = 0; i < 32; i++) {
        		if (((a >>> i) & 0x1) == 1)
        			bitCount[i]++;
        	}
        }
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 == 1)
                result += 1<<i;
        }        
        return result;
    }
}
