package maximal_rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximalRectangleTest {

	@Test
	public void test1() {
		char[][] matrix = new char[1][1];
		matrix[0][0] = '1';
		MaximalRectangle sol = new MaximalRectangle();
		assertEquals(1, sol.maximalRectangle(matrix));
	}
	
	@Test
	public void test2() {
		char[][] matrix = new char[2][2];
		matrix[0][0] = '0';
		matrix[0][1] = '1';
		matrix[1][0] = '1';
		matrix[1][1] = '0';
		MaximalRectangle sol = new MaximalRectangle();
		assertEquals(1, sol.maximalRectangle(matrix));
	}

	@Test
	public void test3() {
		char[][] matrix = {
			{'0', '1', '1', '0', '1'},
			{'1', '1', '0', '1', '0'},
			{'0', '1', '1', '1', '0'},
			{'1', '1', '1', '1', '0'},
			{'1', '1', '1', '1', '1'},
			{'0', '0', '0', '0', '0'}
		};
		MaximalRectangle sol = new MaximalRectangle();
		assertEquals(9, sol.maximalRectangle(matrix));
	}
}
