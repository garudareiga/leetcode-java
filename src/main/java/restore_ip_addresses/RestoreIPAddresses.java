package restore_ip_addresses;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *  
 * For example:
 * Given "25525511135",
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
    	ArrayList<String> result = new ArrayList<String>();
    	Stack<String> segments = new Stack<String>();
    	restoreIpAddresses(s, 0, segments, result);
    	return result;
    }
    
    public void restoreIpAddresses(String s, int p, Stack<String> segments, ArrayList<String> result) {
    	if (p == s.length() && segments.size() == 4) {
    		StringBuilder sb = new StringBuilder();
    		for (int i = 0; i < segments.size() - 1; i++) {
    			sb.append(segments.get(i) + '.');
    		}
    		sb.append(segments.peek());
    		result.add(sb.toString());
    		return;
    	}
    	// pruning
    	if (segments.size() == 4) return;
    	for (int i = p + 1; i <= p + 3 && i <= s.length(); i++) {
    		String substr = s.substring(p, i);
    		if (isValidSegment(substr)) {
    			segments.push(substr);
    			restoreIpAddresses(s, i, segments, result);
    			segments.pop();
    		}
    	}
    }
    
    private boolean isValidSegment(String s) {
    	if (!"0".equals(s) && s.charAt(0) == '0') return false;
    	Integer value = Integer.parseInt(s);
    	return value >= 0 && value <= 255; 
    }   
}
