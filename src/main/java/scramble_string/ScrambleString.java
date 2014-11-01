package scramble_string;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 *  
 *  Below is one possible representation of s1 = "great":

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
        return isScrambleDP(s1, s2);
    }
    
    boolean isScrambleDP(String s1, String s2) {
        // array[k][i][j]
        // k => length of substring, i => start index of s1, j => start index of s2
        // array[k][i][j] => s1[i, i + k] is scramble of s2[j, j + k]
        int len = s1.length();
        boolean[][][] result = new boolean[len][len][len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; i < len; i++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    result[0][i][j] = true;
                }
            }
        }
        
        for (int k = 1; k <= len; k++) {
            for (int i = len - 1; i >= 0; i--) {
                for (int j = len - 1; j >= 0; j--) {
                    if (i + k >= len - 1 && j + k >= len - 1)
                        continue;
                    if (result[k - 1][i][j] == true && s1.charAt(i + k) == s2.charAt(j + k)) {
                        result[k][i][j] = true;
                        continue;
                    }
                }
            }
        }
        
        return result[s1.length() - 1][0][0];
    }
    
}
