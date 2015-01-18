package largest_number;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a list of non negative integers, arrange them such that they form 
 * the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * Note: The result may be very large, so you need to return a string instead 
 * of an integer.
 */ 

public class LargestNumber {
    public String largestNumber(int[] num) {
        ArrayList<String> numStr = new ArrayList<String>();
        for (int n : num) numStr.add(String.valueOf(n));

        NumStrComp comparator = new NumStrComp();
        Collections.sort(numStr, comparator);
        
        StringBuilder sb = new StringBuilder();
        for (String str : numStr) sb.append(str);
        return sb.toString();
    }
    
    class NumStrComp implements Comparator<String> {
        public int compare(String o1, String o2) {
            if (o1.equals(o2)) return 0;
            if (Integer.parseInt(o1 + o2) < Integer.parseInt(o2 + o1)) return 1;
            else return -1;
        }
    }
}