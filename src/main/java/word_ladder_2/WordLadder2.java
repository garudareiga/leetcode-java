package word_ladder_2;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:
 * 
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * 
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * Return
 * [
 *   ["hit","hot","dot","dog","cog"],
 *   ["hit","hot","lot","log","cog"]
 * ]
 * Note:
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * 
 */

public class WordLadder2 {   
	public List<List<String>> findLadders(String start, String end, HashSet<String> dict) {
		HashMap<String, ArrayList<String>> prevStrMap = new HashMap<String, ArrayList<String>>();
		
		dict.add(end);
		
		HashSet<String> curr = new HashSet<String>(), next = new HashSet<String>(), swap;
		
		curr.add(start);
		while (true) {
			for (String str: curr) dict.remove(str);
			for (String str : curr) findLadders(str, next, dict, prevStrMap);
			if (next.contains(end) || next.isEmpty()) break;
			curr.clear();
			swap = curr;
			curr = next;
			next = swap;
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		if (prevStrMap.containsKey(end)) {
			LinkedList<String> path = new LinkedList<String>();
			path.add(end);
			findPath(end, path, prevStrMap, result);
		}
		return result;
	}
		
	void findLadders(String curr, HashSet<String> next, HashSet<String> dict, HashMap<String, ArrayList<String>> prevStrMap) {
		for (int i = 0; i < curr.length(); i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				if (curr.charAt(i) == c) continue;
				String newstr = curr.substring(0, i) + c + curr.substring(i + 1);
				if (dict.contains(newstr)) {
					if (!prevStrMap.containsKey(newstr)) prevStrMap.put(newstr, new ArrayList<String>());
					prevStrMap.get(newstr).add(curr);
					next.add(newstr);
				}
			}
		}
	}
	
	void findPath(String currstr, LinkedList<String> path, HashMap<String, ArrayList<String>> prevStrMap, List<List<String>> result) {
		if (prevStrMap.containsKey(currstr)) {
			for (String prevstr : prevStrMap.get(currstr)) {
				path.addLast(prevstr);
				findPath(prevstr, path, prevStrMap, result);
				path.pollLast();
			}
		} else {
			LinkedList<String> newPath = new LinkedList<String>(path);
			Collections.reverse(newPath);
			result.add(newPath);
		}
	}
	
	
    public List<List<String>> findLadders_TLE(String start, String end, HashSet<String> dict) {
    	// TLE ...
    	List<List<String>> result = new LinkedList<List<String>>();
    	
    	LinkedList<String> current = new LinkedList<String>(), next;
    	current.add(start);
    	
    	Queue<LinkedList<String>> q = new LinkedList<LinkedList<String>>();
    	q.add(current);
    	
    	int shortestPath = Integer.MAX_VALUE;
    	while (!q.isEmpty()) {
    		current = q.poll();
    		if (current.size() >= shortestPath) continue;
    		String currstr = current.getLast();
    		dict.remove(currstr);
    		
    		for (int i = 0; i < currstr.length(); i++) {
    			for (char c = 'a'; c <= 'z'; c++) {
    				if (currstr.charAt(i) == c) continue;
    				String newstr = currstr.substring(0, i) + c + currstr.substring(i + 1);
    				if (end.equals(newstr)) {
    					next = new LinkedList<String>(current);
    					next.add(newstr);
    					result.add(next);
    					shortestPath = next.size();
    					continue;
    				}
    				if (!dict.contains(newstr)) continue;
    				next = new LinkedList<String>(current);
    				next.addLast(newstr);
    				q.add(next);
    			}
    		}
    	}
    	return result;
    }
}
