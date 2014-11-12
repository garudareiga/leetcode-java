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
         * Space Complexity: O(n) 
         */
        int maxLen = 0;
        HashSet<Character> hs = new HashSet<Character>();
        int l, r, k;
        for (l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (hs.contains(c)) { // find duplicate
                // update maxLen
                maxLen = Math.max(maxLen, r - l);
                // search for the next 'l'
                for (k = l; k < r; k++) {
                    if (s.charAt(k) == c) break;
                    hs.remove(s.charAt(k));
                }
                l = k + 1;
            } else 
                hs.add(c);
        }
        maxLen = Math.max(maxLen, r - l);
        return maxLen;
    }
}
