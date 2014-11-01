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

public class LongestPalindromicSubstring {
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
    	if (s.isEmpty()) return null;
    	int len = s.length(), lp = 0, rp = 0;
    	boolean[][] p = new boolean[len][len];
    	for (int r = 0; r < len; r++) {
    		for (int l = 0; l <= r; l++) {
    			if (r == l) p[l][r] = true;
    			else if (r == l + 1 && s.charAt(r) == s.charAt(l)) {
					p[l][r] = true;
					if (lp == rp) { lp = l; rp = r; }   				
    			} else if (s.charAt(l) == s.charAt(r) && p[l + 1][r - 1]) {
    					p[l][r] = true;
    					if (r - l > rp - lp) { lp = l; rp = r; }
    			}
    		}
    	}
    	return s.substring(lp, rp + 1);
    }
}
