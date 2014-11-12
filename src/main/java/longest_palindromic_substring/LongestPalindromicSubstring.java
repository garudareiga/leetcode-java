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
    
    public String longestPalindrome_2(String s) {
        /* 
         * Time complexity: O(n^2)
         * Space complextiy: O(1)
         */
        if (s.isEmpty()) return null;
        int len = s.length(), l, r, lp = 0, rp = 0;
        // expand from the center c: O(2*N)
        for (int c = 0; c < len; c++) {
            // If the size of palindrome is odd
            for (l = c, r = c; l >= 0 && r < len; l--, r++)
                if (s.charAt(l) != s.charAt(r))
                    break;
            if (r - l - 2 > rp - lp) { lp = l + 1; rp = r - 1; }
            // If the size of palindrome is even
            for (l = c, r = c + 1; l >= 0 && r < len; l--, r++)
                if (s.charAt(l) != s.charAt(r))
                    break;
            if (r - l - 2 > rp - lp) { lp = l + 1; rp = r - 1; }
        }
        return s.substring(lp, rp + 1);
    }
}
