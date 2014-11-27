package longest_substring_with_at_most_two_distinct_characters;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string S, find the length of the longest substring T that
 * contains at most two distinct characters.
 * 
 * Given S = "eceba",
 * T is "ece".
 * 
 * Follow-up:
 * Generalized to the case where T contains at most k distinct characters
 */

public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
    	int l = 0, r = -1, maxLen = 0;
    	for (int i = 1; i < s.length(); i++) {
    		if (s.charAt(i) == s.charAt(i - 1)) continue;
    		if (r >= 0 && s.charAt(i) == s.charAt(r)) {
    				maxLen = Math.max(maxLen, i - l);
    			l = r + 1;
    		}
    		r = i - 1;
    	}
    	return Math.max(s.length() - l, maxLen);
    }
    
    public int lengthOfLongestSubstringTwoDistinct(String s, int k) {
    	int numDistinct = 0, l = 0, maxLen = 0;
    	int[] table = new int[256];
    	for (int r = 0; r < s.length(); r++) {
    		if (table[s.charAt(r)] == 0) numDistinct++;
    		table[s.charAt(r)]++;
    		while (numDistinct > k) {
    			table[s.charAt(l)]--;
    			if (table[s.charAt(l)] == 0) numDistinct--;
    			l++;
    		}
    		maxLen = Math.max(maxLen, r - l + 1);
    	}
    	return maxLen;
    }
}
