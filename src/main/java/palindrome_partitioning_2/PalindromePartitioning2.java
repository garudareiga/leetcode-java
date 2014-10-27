package palindrome_partitioning_2;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a string s, partition s such that every substring of the partition is a palindrome.
 *  
 *  Return the minimum cuts needed for a palindrome partitioning of s.
 *  For example, given s = "aab",
 *  Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 */

public class PalindromePartitioning2 {
    public int minCut(String s) {
        // Dynamic Programming
        if (s.isEmpty() || isPalindrome(s)) return 0;
        
        // Improve the way to check if palindrome
        // i : row
        // j : column
        // check[i][j] -> [i, j] is palindrome if check[i+1][j-1] is palindrome and s[i] == s[j]
        int[][] check = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; j <= s.length() - 1; j++) {
                if (j < i) {                // j always greater than i
                    continue;
                } else if (j == i) {
                    check[i][j] = 1;
                } else {
                    if (j - 1 < i + 1) {
                        if (s.charAt(j) == s.charAt(i)) {
                            check[i][j] = 1;
                        }
                    } else {
                        if (s.charAt(j) == s.charAt(i) && check[i + 1][j - 1] == 1) {
                            check[i][j] = 1;
                        }
                    }
                    
                }
            }
        }
        
        int[] minCutArray = new int[s.length()];       
        for (int i = 0; i < s.length(); i++) {
            //if (isPalindrome(s.substring(0, i + 1))) {
            if (check[0][i] == 1) {
                minCutArray[i] = 0;
                continue;
            }
            int minCut = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                //if (isPalindrome(s.substring(j, i + 1))) {
                if (check[j][i] == 1) {
                    int currCut = minCutArray[j - 1] + 1;
                    if (minCut > currCut) {
                        minCut = currCut;
                    }
                }
            }
            minCutArray[i] = minCut;
        }
        
        return minCutArray[s.length() - 1];
    }
    
    public int minCutSlow(String s) {
        if (s.isEmpty() || isPalindrome(s)) {
            return 0;
        }
        
        int minCut = s.length(), currCut = 0;
        for (int i = 1; i <= s.length() - 1; i++) {           
            String substr = s.substring(0, i);
            if (isPalindrome(substr) == true) {
                currCut = 1 + minCut(s.substring(i, s.length()));
                if (currCut < minCut) {
                    minCut = currCut;
                }
            }
        }
        return minCut;
    }
    
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
