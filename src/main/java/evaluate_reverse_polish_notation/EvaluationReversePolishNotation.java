package evaluate_reverse_polish_notation;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 *	Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *	
 *	Some examples:
 *	["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *	["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 */


public class EvaluationReversePolishNotation {
	public int evalRPN(String[] tokens) {
		if (tokens.length == 0) 
			return 0;
		
		Stack<Integer> s = new Stack<Integer>();
		for (String str : tokens) {
			if (Character.isDigit(str.charAt(str.length() - 1))) {
				// take str.length() - 1, for example -4
				s.push(Integer.parseInt(str));
			} else {
				Integer v0 = s.pop();
				Integer v1 = s.pop();
				if (str.equals("+")) {
					s.push(new Integer(v1 + v0));
				} else if (str.equals("-")) {
					s.push(new Integer(v1 - v0));
				} else if (str.equals("*")) {
					s.push(new Integer(v1 * v0));
				} else if (str.equals("/")) {
					s.push(new Integer(v1 / v0));
				}
			}
		}
		return s.pop();
    }
}
