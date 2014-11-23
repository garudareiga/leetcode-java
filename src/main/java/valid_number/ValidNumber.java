package valid_number;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Validate if a given string is numeric.
 * 
 * Some examples:
	"0" => true
	" 0.1 " => true
	"abc" => false
	"1 a" => false
	"2e10" => true // forget this one first
 * Note: It is intended for the problem statement to be ambiguous. 
 * You should gather all requirements up front before implementing one.
 */

public class ValidNumber {
    public boolean isNumber(String s) { 
//    	// Easy solution
//    	try {
//    		Double.valueOf(s);
//    		return true;
//    	} catch (NumberFormatException e) {
//    		return false;
//    	}
        s = s.trim();
        if (s.isEmpty()) return false;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') s = s.substring(1); // remove sign
        int p = 0;
        boolean isNumeric = false;
        while (p < s.length() && Character.isDigit(s.charAt(p))) { p++; isNumeric = true; }
        if (p < s.length() && s.charAt(p) == '.') {
            p++;
            while (p < s.length() && Character.isDigit(s.charAt(p))) {
                p++;
                isNumeric = true;
            }
        }
        return isNumeric && p == s.length();
    }
}
