package add_binary;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given two binary strings, return their sum (also a binary string).
 *	
 *	For example,
 *	a = "11"
 *	b = "1"
 *	Return "100".
 */

public class AddBinary {
    public String addBinary(String a, String b) {
    	StringBuilder sb = new StringBuilder();
    	if (a.length() < b.length()) {
    		String tmp = a;
    		a = b;
    		b = tmp;
    	}
    	
    	int carry = 0, v_a, v_b, v;
    	for (int i = 1; i <= a.length(); i++) {
    		v_a = Character.getNumericValue(a.charAt(a.length() - i));
    		v_b = i <= b.length() ? Character.getNumericValue( b.charAt(b.length() - i)) : 0;
    		v = (v_a + v_b + carry)%2;
    		carry = (v_a + v_b + carry)/2;
    		sb.append(String.valueOf(v));
    	}
    	if (carry == 1)
    		sb.append(String.valueOf(carry));
    	return sb.reverse().toString();
    }   
}
