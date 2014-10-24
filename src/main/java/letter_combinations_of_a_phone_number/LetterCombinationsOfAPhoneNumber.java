package letter_combinations_of_a_phone_number;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
	String[] pm = {   " ",    
	                  " ", "abc",  "def",
	                "ghi", "jkl",  "mno",
	               "pqrs", "tuv", "wxyz"
	};
			
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        Stack<Character> stack = new Stack<Character>();
        letterCombinations(digits, 0, stack, result);
        return result;
    }
    
    public void letterCombinations(String digits, int p, Stack<Character> stack, ArrayList<String> result) {
    	if (p == digits.length()) {
    		StringBuilder sb = new StringBuilder();
    		for (Character c : stack) sb.append(c);
    		result.add(sb.toString());
    		return;
    	}
    	int index = Character.getNumericValue(digits.charAt(p));
    	for (int i = 0; i < pm[index].length(); i++) {
    		stack.push(pm[index].charAt(i));
    		letterCombinations(digits, p + 1, stack, result);
    		stack.pop();
    	}
    }
}
