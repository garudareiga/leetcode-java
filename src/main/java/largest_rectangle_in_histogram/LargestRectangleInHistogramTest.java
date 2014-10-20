package largest_rectangle_in_histogram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LargestRectangleInHistogramTest {
	LargestRectangleInHistogram sol = null;
	
	@Before
	public void setUp() {
		sol = new LargestRectangleInHistogram();
	}

	@Test
	public void test1() {
		int[] height = {4, 2};	
		assertEquals(4, sol.largestRectangleArea(height));
	}

	@Test
	public void test2() {
		int[] height = {2,1,5,6,2,3};
		assertEquals(10, sol.largestRectangleArea(height));
	}
	
	@Test
	public void test3() {
		int[] height = {1,2,2};
		assertEquals(4, sol.largestRectangleArea(height));
	}
	
	@Test
	public void test4() {
		int[] height = {2,1,2};
		assertEquals(3, sol.largestRectangleArea(height));
	}
	
	@Test
	public void test5() {
		int[] height = {4,2,0,3,2,5};
		assertEquals(6, sol.largestRectangleArea(height));
	}
	
	@Test
	public void test6() {
		int[] height = {1};		
		assertEquals(1, sol.largestRectangleArea(height));
	}
}
