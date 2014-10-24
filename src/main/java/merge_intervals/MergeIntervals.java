package merge_intervals;

import util.Interval;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a collection of intervals, merge all overlapping intervals.
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 */

public class MergeIntervals {	
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> newIntervals = new LinkedList<Interval>();
        ListIterator<Interval> iter = intervals.listIterator();
        while (iter.hasNext())
        	Interval.insert(newIntervals, iter.next());
        return newIntervals;
    }
}
