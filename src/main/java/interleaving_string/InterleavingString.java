package interleaving_string;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false
 *
 */

public class InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		/*
		 * Dynaimic Programming
		 * Time Complexity: O(n*n)
		 * Space Complexity: O(n*n)
		 */
	    if (s1.isEmpty()) return s3.equals(s2);
	    if (s2.isEmpty()) return s3.equals(s1);
	    if (s1.length() + s2.length() != s3.length()) return false;
	    int m = s1.length(), n = s2.length();
	    boolean[][] isInterleave = new boolean[m + 1][n + 1];
	    for (int i = 0; i <= m; i++) {
	    	for (int j = 0; j <= n; j++) {
	    		if (i == 0 && j == 0)
	    			isInterleave[0][0] = true;
	    		else if ((i > 0 && isInterleave[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
	    				 (j > 0 && isInterleave[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)))
	                isInterleave[i][j] = true;	            
	        }
	    }
	    return isInterleave[m][n];
	}
    
    public boolean isInterleaveRecursive(String s1, String s2, String s3) {
        // Time Limit Exceeds
        if (s3.length() != s1.length() + s2.length()) return false;
        if (s3.length() == 0) return true;       
        if (s1.length() > 0 && s2.length() == 0) {
            if (s1.equals(s3)) return true;
            else return false;
        }
        
        if (s1.length() == 0 && s2.length() > 0) {
            if (s2.equals(s3)) return true;
            else return false;
        } 

        if (s1.charAt(0) == s3.charAt(0) && s2.charAt(0) == s3.charAt(0)) {
            return isInterleaveRecursive(s1.substring(1), s2, s3.substring(1)) ||
                    isInterleaveRecursive(s1, s2.substring(1), s3.substring(1)); 
        } else if (s1.charAt(0) == s3.charAt(0) && s2.charAt(0) != s3.charAt(0)) {
            return isInterleaveRecursive(s1.substring(1), s2, s3.substring(1));
        } else if (s1.charAt(0) != s3.charAt(0) && s2.charAt(0) == s3.charAt(0)) {
            return isInterleaveRecursive(s1, s2.substring(1), s3.substring(1));
        } else {
            return false;
        }
    }   
}
