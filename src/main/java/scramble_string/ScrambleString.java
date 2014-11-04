package scramble_string;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 *  
 * Below is one possible representation of s1 = "great":

 *     great
 *    /    \
 *   gr    eat
 *  / \    /  \
 * g   r  e   at
 *           / \
 *          a   t
 * To scramble the string, we may choose any non-leaf node and swap its two children.
 * 
 * For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".

 *     rgeat
 *    /    \
 *   rg    eat
 *  / \    /  \
 * r   g  e   at
 *            / \
 *           a   t
 * We say that "rgeat" is a scrambled string of "great".
 * 
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".

 *     rgtae
 *    /    \
 *   rg    tae
 *  / \    /  \
 * r   g  ta  e
 *       / \
 *      t   a
 *      
 * We say that "rgtae" is a scrambled string of "great".
 * 
 * Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
 */

public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
        // array[k][i][j]
        // k => length of substring
    	// i => start index of s1 
    	// j => start index of s2
        // array[k][i][j] => s1[i, i + k] is scramble of s2[j, j + k]
        int N = s1.length();
        boolean[][][] result = new boolean[N + 1][N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (s1.charAt(i) == s2.charAt(j))
                    result[1][i][j] = true;
        
        for (int n = 1; n <= N; n++) {
        	for (int i = 0; i + n <= N; i++) {
        		for (int j = 0; j + n <= N; j++) {
        			for (int k = 1; k < n; k++) {
        				if ((result[k][i][j] && result[n - k][i + k][j + k]) ||
        					(result[k][i][j + n - k] && result[n - k][i + k][j])) {
        					result[n][i][j] = true;
        					break;
        				}
        			}
        		}
        	}
        }        
        return result[N][0][0];
    }    
}
