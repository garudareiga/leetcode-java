package generate_parentheses;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
    	List<String> result = new ArrayList<String>();
    	int lpn = 0, rpn = 0;
    	generate_parenthesis(lpn, rpn, n, "", result);
    	return result;
    }
    
    private void generate_parenthesis(int lpn, int rpn, int n, String prev, List<String> result) {
		if (lpn == n) {
			StringBuilder sb = new StringBuilder(prev);
			while (rpn++ < n) sb.append(')');
			result.add(sb.toString());
			return;
		}
		generate_parenthesis(lpn + 1, rpn, n, prev + '(', result);
		if (lpn > rpn)			
			generate_parenthesis(lpn, rpn + 1, n, prev + ')', result);
	}
}
