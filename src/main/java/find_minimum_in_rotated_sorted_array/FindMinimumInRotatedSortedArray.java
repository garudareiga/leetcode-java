package find_minimum_in_rotated_sorted_array;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 */ 

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] num) {
    	//return find_min(0, num.length - 1, num);
    	return findMinIterative(num);
    }
    
    private int find_min(int i, int j, int[] num) {
    	if (i > j) return Integer.MAX_VALUE;
    	if (i == j || num[i] < num[j]) return num[i];
    	int m = (i + j)/2;
    	return Math.min(find_min(i, m, num), find_min(m + 1, j, num));
    }
    
    public int findMinIterative(int[] num) {
    	int l = 0, r = num.length - 1;
    	while (l + 1 < r) {
    		if (num[l] < num[r]) break;
    		int m = (l + r)/2;
    		if (num[l] < num[m]) l = m + 1; // left sorted, right minimum
    		else r = m; // left minimum, right sorted
    	}
    	return Math.min(num[l], num[r]);
    }
}
