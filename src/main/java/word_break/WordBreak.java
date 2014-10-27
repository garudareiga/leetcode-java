package word_break;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a 
 * space-separated sequence of one or more dictionary words.
 *  
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 *  
 * Return true because "leetcode" can be segmented as "leet code".
 */

import java.util.*;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		/* 
		 * dynamic programming
		 * Time complexity: O(m*n)
		 * Space complexity: O(m)
		 * 
		 * m : size of String s
		 * n : size of dictionary
		 */
		boolean[] result = new boolean[s.length() + 1];
		result[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (String word : dict) {
				if (i >= word.length() &&
					result[i - word.length()] && 
					word.equals(s.substring(i - word.length(), i))) {
					result[i] = true;
					break;
				}
			}
		}
		return result[s.length()];
	}
}
