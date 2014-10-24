package insert_interval;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import util.Interval;

public class InsertIntervalTest {

	@Test
	public void test1() {
		List<Interval> intervals = new LinkedList<Interval>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));
		
		Interval newInterval = new Interval(4, 9);
		
		InsertInterval sol = new InsertInterval();
		intervals = sol.insert(intervals, newInterval);
		assertEquals(3, intervals.size());
	}

	@Test
	public void test2() {
		List<Interval> intervals = new LinkedList<Interval>();
		intervals.add(new Interval(1, 5));
		
		Interval newInterval = new Interval(0, 0);
		
		InsertInterval sol = new InsertInterval();
		intervals = sol.insert(intervals, newInterval);
		for (Interval interval : intervals)
			System.out.println(interval.start + ", " + interval.end);
		assertEquals(2, intervals.size());
	}
}
