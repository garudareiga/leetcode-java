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
	"2e10" => true // ignore
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
        if (s.charAt(0) == '-' || s.charAt(0) == '+') s = s.substring(1); 
        int i = 0;
        boolean isNumeric = false;
        while (i < s.length() && Character.isDigit(s.charAt(i))) { i++; isNumeric = true; }
        if (i < s.length() && s.charAt(i) == '.') {
            i++;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                i++;
                isNumeric = true;
            }
        }
        if (i < s.length() && isNumeric && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
        	isNumeric = false;
        	i++;
        	if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        	while (i < s.length() && Character.isDigit(s.charAt(i))) { i++; isNumeric = true; }
        }
        return isNumeric && i == s.length();
    }
}
