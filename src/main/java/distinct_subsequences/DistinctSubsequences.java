package distinct_subsequences;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 *
 * A subsequence of a string is a new string which is formed from the original string by 
 * deleting some (can be none) of the characters without disturbing the relative positions 
 * of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 *	
 * Return 3.
 */

public class DistinctSubsequences {
	public int numDistinct(String S, String T) {
        return numDistinctDP(S, T);
        //return numDistinct(S, 0, T, 0);
    }
	
	private int numDistinct(String s, int is, String t, int it) {
	    /*
	     * Time Limit Exceeded
	     */
	    if (it == t.length()) return 1;
	    if (s.length() - is < t.length() - it) return 0;
	    if (s.length() - is == t.length() - it) 
	        return s.substring(is).equals(t.substring(it)) ? 1 : 0;
	    return numDistinct(s, is + 1, t, it) + 
	            (s.charAt(is) == t.charAt(it) ? numDistinct(s, is + 1, t, it + 1) : 0);
	}
	
	private int numDistinctDP(String s, String t) {
        /*
         * Dynamic Programming
         */
	    int ls = s.length(), lt = t.length();
	    int[][] array = new int[ls + 1][lt + 1];
	    array[0][0] = 1;
	    for (int i = 1; i <= ls; i++) array[i][0] = 1;
	    for (int i = 1; i <= lt; i++) array[0][i] = 0;
	    for (int i = 1; i <= ls; i++)
	        for (int j = 1; j <= lt && j <= i; j++)
	            array[i][j] = array[i - 1][j] + (s.charAt(i - 1) == t.charAt(j - 1) ? array[i - 1][j - 1] : 0);
	    return array[ls][lt];
	}
}
