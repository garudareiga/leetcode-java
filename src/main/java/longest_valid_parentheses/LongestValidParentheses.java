package longest_valid_parentheses;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a string containing just the characters '(' and ')', find the length 
 *  of the longest valid (well-formed) parentheses substring.
 *  
 *  For "(()", the longest valid parentheses substring is "()", which has length = 2.
 *  Another example is ")()())", where the longest valid parentheses substring is 
 *  "()()", which has length = 4.
 *  
 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
    	/*
    	 * Using stack
    	 * Runtime Complexity: O(n)
    	 */
    	int maxLen = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	for (int i = 0; i < s.length(); i++) {
    		if (stack.isEmpty()) {
    			stack.push(i);
    		} else {
    			char l = s.charAt(stack.peek()), r = s.charAt(i);
    			if ((l == '(' && r == ')') ||
    				(l == '[' && r == ']') ||
    				(l == '{' && r == '}')) {
    				stack.pop();
    				maxLen = Math.max(maxLen, i - (stack.isEmpty() ? -1 : stack.peek()));
    			} else {
    				stack.push(i);
    			}
    		}
    	}
    	return maxLen;
    	
    	/*
    	 * Dynamic Programming: Runtime Limit Exceeded
    	 * Runtime Complexity: O(n^2)
    	 */
    	/*
    	int maxLen = 0;
    	boolean[][] valid = new boolean[s.length()][s.length()];
    	for (int r = 1; r < s.length(); r++) {
    		for (int l = 0; l < r; l++) {
    			char lc = s.charAt(l), rc = s.charAt(r);
    			if ((lc == '(' && rc == ')') &&
    				(lc == '[' && rc == ']') &&
    				(lc == '{' && rc == '}')) {
    				if (r == l + 1 || valid[l + 1][r - 1] == true) {
    					valid[l][r] = true;
    					maxLen = Math.max(maxLen, r - l + 1);
    				}
    			}			
    		}
    	}
        return maxLen;
        */
    }
}
