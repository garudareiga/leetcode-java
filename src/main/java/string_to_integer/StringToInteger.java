package string_to_integer;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 * please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
You are responsible to gather all the input requirements up front.

spoilers alert... click to show requirements for atoi.

Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first 
non-whitespace character is found. Then, starting from this character, takes an optional 
initial plus or minus sign followed by as many numerical digits as possible, and interprets 
them as a numerical value.

The string can contain additional characters after those that form the integral number, which
are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or 
if no such sequence exists because either str is empty or it contains only whitespace characters, 
no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is 
out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */

public class StringToInteger {
    public int atoi(String str) {
    	int result = 0;
    	str = str.trim();
    	if (str.isEmpty())
    		return 0;
    	
    	boolean sign = true;
    	if (str.charAt(0) == '+') {
    		str = str.substring(1);
    	} else if (str.charAt(0) == '-') {
    		sign = false;
    		str = str.substring(1);
    	}
    	
    	for (int i = 0; i < str.length(); i++) {
    		if (Character.isDigit(str.charAt(i)) == false)
    			break;
    		if (result > Integer.MAX_VALUE/10)
    			return sign == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    		
    		int v = Character.getNumericValue(str.charAt(i));
    		if (sign == true && result == Integer.MAX_VALUE/10 
    				&& v >= Integer.MAX_VALUE % 10)
    			return Integer.MAX_VALUE;
    		if (sign == false && result == Integer.MAX_VALUE/10 
    				&& v >= Integer.MIN_VALUE % 10)
    			return Integer.MIN_VALUE;
    		result = result*10 + v;
    	}
    	return sign == true ? result : -result;
    }

}
