package longest_substring_without_repeating_characters;

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
}
