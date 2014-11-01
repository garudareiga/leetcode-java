package permutation_sequence;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * The set [1,2,3,..,n] contains a total of n! unique permutations.
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
	"123"
	"132"
	"213"
	"231"
	"312"
	"321"
 * Given n and k, return the kth permutation sequence.
 * Note: Given n will be between 1 and 9 inclusive.
 */

public class PermutationSequence {
    /*
     * Assume we have a_1 a_2 a_3 ... a_n
     * k_1 = k
     * a_1 = k_1 / (n - 1)!
     * 
     * k_2 = k_1 % (n - 1)!
     * a_2 = k_2 / (n - 2)!
     * ...
     * k_(n-1) = k_(n-2)%2!
     * a_(n-1) = k_(n-1)/1!
     * a_n = 0
     * 
     */
    public String getPermutation(int n, int k) {
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	int factorial = 1;	// factorial
    	for (int i = 1; i <= n; i++) {
    		factorial *= i;
    		list.add(i);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = n; i >= 1; i--) {
    		factorial = factorial / i;
    		int p = (k - 1)/factorial;
    		k = k - p*factorial;
    		sb.append(list.get(p));
    		list.remove(p);
    	}
    	return sb.toString();
    }
}
