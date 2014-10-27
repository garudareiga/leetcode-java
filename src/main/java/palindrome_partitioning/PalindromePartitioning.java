package palindrome_partitioning;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 *
 * Return all possible palindrome partitioning of s.
 *	
 * For example, given s = "aab",
 * Return
 *	[
 *   	["aa","b"],
 *   	["a","a","b"]
 * 	]
 */

public class PalindromePartitioning {
	public List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<List<String>>();
		if (s.isEmpty()) return result;
		Stack<String> curr = new Stack<String>();
		partition(s, 0, curr, result);
		return result;
	}
	
	public void partition(String s, int p, Stack<String> curr, List<List<String>> result) {
		if (p == s.length()) {
			result.add(new ArrayList<String>(curr));
			return;
		}
		for (int i = p + 1; i <= s.length(); i++) {
			String substr = s.substring(p, i);
			if (isPalindrome(substr)) {
				curr.push(substr);
				partition(s, i, curr, result);
				curr.pop();
			}
		}
	}
		
	public boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
	}
}
