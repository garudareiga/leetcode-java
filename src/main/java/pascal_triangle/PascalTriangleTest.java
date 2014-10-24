package pascal_triangle;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class PascalTriangleTest {

	@Test
	public void test1() {
		System.out.println("*** TEST 1 ***");
		PascalTriangle sol = new PascalTriangle();
		List<List<Integer>> result = sol.generate(2);
		for (List<Integer> l : result) System.out.println(l.toString());
		assertEquals(2, result.size());
	}
	
	@Test
	public void test2() {
		System.out.println("*** TEST 2 ***");
		PascalTriangle sol = new PascalTriangle();
		List<List<Integer>> result = sol.generate(5);
		for (List<Integer> l : result) System.out.println(l.toString());
		assertEquals(5, result.size());
	}

}
