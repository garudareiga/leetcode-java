package decode_ways;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *  
 *  'A' -> 1
 *  'B' -> 2
 *  ...
 *  'Z' -> 26
 *  
 *  Given an encoded message containing digits, determine the total number of ways to decode it.
 *  
 *  For example,
 *  Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *  The number of ways decoding "12" is 2.
 */

public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.startsWith("0")) return 0;
        int n1 = 1, n2 = 1;
        String substr = null;
        for (int i = 1; i < s.length(); i++) {
        	substr = s.substring(i - 1, i + 1);
        	int curr = (substr.charAt(1) == '0' ? 0 : n1) + 
        			(substr.charAt(0) == '0' || Integer.valueOf(substr) > 26 ? 0 : n2);
        	n2 = n1;
        	n1 = curr;
        }
        return n1;
    }
}
