package find_minimum_in_rotated_sorted_array_2;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * The array may contain duplicates.
 */ 

public class FindMinimumInRotatedSortedArray2 {
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
    	while (l < r) {
    		if (num[l] < num[r]) break;
    		int m = (l + r)/2;
    		if (num[l] == num[m]) l++;
    		else if (num[r] == num[m]) r--;
    		else if (num[l] < num[m]) l = m; // not use m + 1
    		else r = m; // not use m - 1
    	}
    	return num[l];
    }
}
