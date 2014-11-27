package longest_substring_without_repeating_characters;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstring2(s);
    }
    
    public int lengthOfLongestSubstringDP(String s) {
        /*
         * Runtime Complexity: O(n^2)
         * Space Complexity: O(n) 
         */
    	if (s.isEmpty()) return 0;
    	int[] result = new int[s.length()];
    	result[0] = 1;
    	int i, j, maxLen = 1;
    	for (i = 1; i < s.length(); i++) {
    		int len = result[i - 1];
    		for (j = 1; j <= len; j++) {
    			if (s.charAt(i) == s.charAt(i - j))
    				break;
    		}
    		result[i] = j;
    		maxLen = Math.max(maxLen, result[i]);
    	}
    	return maxLen;
    }
    
    public int lengthOfLongestSubstring2(String s) {
        /*
         * Runtime Complexity: O(n)
         * Space Complexity: O(1) assume we only have ASCII characters 
         */
    	int maxLen = 0;
    	int[] table = new int[256];
    	Arrays.fill(table, -1);
    	int l = 0, r;
    	for (r = 0; r < s.length(); r++) {
    		char c = s.charAt(r);
    		if (table[c] < l) maxLen = Math.max(r - l + 1, maxLen);
    		else l = table[c] + 1;
    		table[c] = r;
    	}
    	return maxLen;
    }
}
