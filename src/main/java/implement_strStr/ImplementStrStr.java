package implement_strStr;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement strStr().
 * 
 * Returns a pointer to the first occurrence of needle in haystack, 
 * or null if needle is not part of haystack.
 * 
 */

public class ImplementStrStr {
    public String strStr(String haystack, String needle) {
    	/* 
    	 * Brute-force
    	 * Time Complexity: O(n*m)
    	 */ 
    	if (needle.isEmpty()) return haystack;
    	for (int i = 0; i < haystack.length(); i++) {
    		if (haystack.length() - i < needle.length())
    			break;
    		if (haystack.substring(i, i + needle.length()).equals(needle))
    			return haystack.substring(i);
    	}
    	return null;
    }
}
