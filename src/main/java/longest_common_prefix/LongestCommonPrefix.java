package longest_common_prefix;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0)
    		return "";
    	if (strs.length == 1)
    		return strs[0];
    	
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) 
        	minLen = Math.min(minLen, str.length());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
        	char c = strs[0].charAt(i);
        	for (String str : strs) {
        		if (str.charAt(i) != c)
        			return sb.toString();
        	}
        	sb.append(c);
        }
        return sb.toString();
    }
}
