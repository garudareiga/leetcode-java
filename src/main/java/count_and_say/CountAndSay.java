package count_and_say;

/**
 * 
 * @author raychen
 * 
 * Problem
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 */

public class CountAndSay {
	public String countAndSay(int n) {
		if (n == 0)	return "";
		String r = "1";
		for (int i = 2; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			
			int count = 1;
			char prev = r.charAt(0);
			for (int j = 1; j < r.length(); j++) {
				if (prev == r.charAt(j)) {
					count++;
				} else {
					sb.append(count); sb.append(prev);
					count = 1; prev = r.charAt(j);
				}
			}
			sb.append(count); sb.append(prev);
			r = sb.toString();
		}
		return r;
	}
}
