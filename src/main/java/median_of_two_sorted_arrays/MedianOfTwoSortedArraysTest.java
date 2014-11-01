package median_of_two_sorted_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
	
	@Test
	public void test1() {
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		int[] A = {1, 5, 9, 13};
		int[] B = {2, 8, 10};
		double result = sol.findMedianSortedArrays(A, B);
		System.out.println(result);
		assertTrue(Math.abs(8.0 - result) < 0.001);
	}
	
	@Test
	public void test2() {
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		int[] A = {1, 5, 13};
		int[] B = {2, 8, 10};
		double result = sol.findMedianSortedArrays(A, B);
		System.out.println(result);
		assertTrue(Math.abs(6.5 - result) < 0.001);
	}
	
	@Test
	public void test3() {
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		int[] A = {};
		int[] B = {1};
		double result = sol.findMedianSortedArrays(A, B);
		System.out.println(result);
		assertTrue(Math.abs(1.0 - result) < 0.001);
	}
	
	@Test
	public void test4() {
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		int[] A = {3, 4};
		int[] B = {};
		double result = sol.findMedianSortedArrays(A, B);
		System.out.println(result);
		assertTrue(Math.abs(3.5 - result) < 0.001);
	}

	@Test
	public void test5() {
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		int[] A = {1, 1};
		int[] B = {1, 1};
		double result = sol.findMedianSortedArrays(A, B);
		System.out.println(result);
		assertTrue(Math.abs(1.0 - result) < 0.001);
	}
}
