package next_permutation;

import util.ArrayUtil;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement next permutation, which rearranges numbers into the 
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as 
 * the lowest possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its 
 * corresponding outputs are in the right-hand column.
 * 
    1,2,3 -> 1,3,2
    3,2,1 -> 1,2,3
    1,1,5 -> 1,5,1
 */

public class NextPermutation {
    /*
     * 1)  6   8   7   4   3   2
     * 2) [6]  8   7   4   3   2
     *    From right to left, find the first digit (PartitionNumber)
     *    which violates the increase trend
     *    If can't find violation, reverse the array and return 
     * 3) [6]  8  [7]  4   3   2
     *    From right to left, find the first digit (SwapNumber) which 
     *    is larger than PartitionNumber
     * 4) [7]  8  [6]  4   3   2
     *    Swap the PartitionNumber and ChangeNumber  
     * 5) Reverse all the digits from the right of partition index
     *
     */
    public void nextPermutation(int[] num) {
        if (num.length <= 1) return;
        int partIndex = find_partition_index(num);
        if (partIndex >= 0) {
            ArrayUtil.swap(num, partIndex, find_swap_index(num, partIndex));
            reverse(num, partIndex + 1, num.length - 1);
        } else {
            reverse(num, 0, num.length - 1);
        }
    }

    private int find_partition_index(int[] num) {
        for (int i = num.length - 2; i >= 0; i--)            
            if (num[i] < num[i + 1])             
                return i;
        return -1;
    }
    
    private int find_swap_index(int[] num, int partIndex) {
        // We can use binary search to speed up a bit
        for (int i = num.length - 1; i > partIndex; i--)
            if (num[i] > num[partIndex])
                return i;
        return -1;
    }
    
    private void reverse(int[] num, int i, int j) {
        while (i < j)
            ArrayUtil.swap(num, i++, j--);
    }
}
