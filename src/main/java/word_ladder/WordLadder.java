package word_ladder;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given two words (start and end), and a dictionary, find the length of shortest transformation 
 * sequence from start to end, such that:
 * 
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * 
 * Given:\
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.

 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters
 * 
 */

public class WordLadder {   
    public int ladderLength(String start, String end, HashSet<String> dict) {	
		HashSet<String> curr = new HashSet<String>(), next = new HashSet<String>(), swap;		
		curr.add(start);
		int step = 1;
		while (!curr.isEmpty()) {
			step++;
			for (String str: curr) dict.remove(str);
			for (String str : curr) {
	    		for (int i = 0; i < str.length(); i++) {
	    			for (char c = 'a'; c <= 'z'; c++) {
	    				if (str.charAt(i) == c) continue;
	    				String newstr = str.substring(0, i) + c + str.substring(i + 1);
	    				if (end.equals(newstr)) return step;
	    				if (next.contains(newstr) || !dict.contains(newstr)) continue;
	    				next.add(newstr);
	    			}
	    		}
			}
			curr.clear();
			swap = curr;
			curr = next;
			next = swap;
		}
		return 0;
    }
	
    public int ladderLength_2(String start, String end, HashSet<String> dict) {
    	HashMap<String, Integer> tranNum = new HashMap<String, Integer>();
    	tranNum.put(start, 1);
    	
    	Queue<String> q = new LinkedList<String>();
    	q.add(start);
    	while (!q.isEmpty()) {
    		String curr = q.poll();
    		for (int i = 0; i < curr.length(); i++) {
    			for (char c = 'a'; c <= 'z'; c++) {
    				if (curr.charAt(i) == c) continue;
    				String newstr = curr.substring(0, i) + c + curr.substring(i + 1);
    				if (end.equals(newstr)) return tranNum.get(curr) + 1;
    				// A better way instead of checking tranNum key
    				// if (!dict.contains(newstr)) continue; dict.remove(newstr);
    				if (tranNum.containsKey(newstr) || !dict.contains(newstr)) continue;
    				tranNum.put(newstr, tranNum.get(curr) + 1);
    				q.add(newstr);
    			}
    		}
    	}
    	return 0;
    }
}
