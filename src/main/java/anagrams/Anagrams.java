package anagrams;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an array of strings, return all groups of strings that are anagrams.
 * Note: All inputs will be in lower-case.
 * 
 */

public class Anagrams {
    public List<String> anagrams(String[] strs) {
    	List<String> r = new ArrayList<String>();
    	if (strs.length == 0)
    		return r;
    	HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
    	for (String str : strs) {
    		char[] charArray = str.toCharArray();
    		Arrays.sort(charArray);
    		String key = new String(charArray);
    		if (hm.containsKey(key)) {
    			hm.get(key).add(str);
    		} else {
    			ArrayList<String> values = new ArrayList<String>();
    			values.add(str);
    			hm.put(key, values);
    		}
    	}
    	for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
    		if (entry.getValue().size() > 1)
    			r.addAll(entry.getValue());
    	}
    	return r;
    }
}
