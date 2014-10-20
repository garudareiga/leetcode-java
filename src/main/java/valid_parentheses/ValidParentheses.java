package valid_parentheses;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid 
 * but "(]" and "([)]" are not.
 *
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (stack.isEmpty()) {
        		stack.push(c);
        	} else {
	        	char t = stack.peek();
	    		if ((c == ')' && t == '(') ||
	    			(c == ']' && t == '[') ||
	    			(c == '}' && t == '{'))
	    			stack.pop();
	        	else
	        		stack.push(c);
        	}
        	System.out.println(stack.size());
        }
        return stack.isEmpty();
    }
}
