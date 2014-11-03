package edit_distance;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
 *	You have the following 3 operations permitted on a word:
 *	a) Insert a character
 *	b) Delete a character
 *	c) Replace a character
 */

public class EditDistance {
    public int minDistance(String word1, String word2) {
        /*
         * Time Complexity: O(n^2)
         * Space Complexity: O(n^2)
         */
    	int len1 = word1.length(), len2 = word2.length();
    	int[][] distance = new int[len1 + 1][len2 + 1];
    	distance[0][0] = 0;
    	for (int i = 1; i <= len1; i++) distance[i][0] = distance[i - 1][0] + 1;
    	for (int i = 1; i <= len2; i++) distance[0][i] = distance[0][i - 1] + 1;
    	for (int i = 1; i <= len1; i++) {
    	    for (int j = 1; j <= len2; j++) {
    	        if (word1.charAt(i - 1) == word2.charAt(j - 1))
    	            distance[i][j] = distance[i - 1][j - 1];
    	        else
    	            distance[i][j] = Math.min(distance[i - 1][j - 1],
    	                    Math.min(distance[i - 1][j], distance[i][j - 1])) + 1;    	        
    	    }
    	}
    	return distance[len1][len2];
    }	
}
