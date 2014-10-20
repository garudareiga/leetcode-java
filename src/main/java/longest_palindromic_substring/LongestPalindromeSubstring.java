package longest_palindromic_substring;

/**
 * 
 * @author raychen
 * 
 * Problem: Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, and there exists one 
 * unique longest palindromic substring.
 *
 */

public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
    	/* 
    	 * Time complexity: O(n^2)
    	 * Space complextiy: O(n^2)
    	 * 
    	 * Dynamic Programming
    	 * 				true, if l = r
    	 * p{l, r} = 	s[l] = s[r], r = l + 1
    	 * 				s[l] = s[r] and p{l + 1, r - 1} is true, r > l + 1
    	 * 
    	 */
    	if (s.isEmpty())
    		return null;
    	int len = s.length(), pl = 0, pr = 0;
    	boolean[][] p = new boolean[len][len];
    	for (int r = 1; r < len; r++) {
    		for (int l = 0; l <= r; l++) {
    			if (r == l) p[r][l] = true;
    			else if (r == l + 1 && s.charAt(r) == s.charAt(l)) {
					p[l][r] = true;
					if (pl == pr) {
						pl = l; pr = r;
					}
    				
    			} else if (s.charAt(l) == s.charAt(r)) {
    				if (p[l + 1][r - 1] == true) {
    					p[l][r] = true;
    					if (r - l > pr - pl) {
    						pl = l; pr = r;
    					}
    				}
    			}
    		}
    	}
    	return s.substring(pl, pr + 1);
    }
}
