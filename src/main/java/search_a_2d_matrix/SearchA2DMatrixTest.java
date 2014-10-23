package search_a_2d_matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchA2DMatrixTest {

	@Test
	public void test1() {
		int[][] matrix = {
				{ 1,  3,  5,  7},
				{10, 11, 16, 20},
				{23, 30, 34, 50}
		};
		SearchA2DMatrix sol = new SearchA2DMatrix();
		assertTrue(sol.searchMatrix(matrix, 3));
		assertFalse(sol.searchMatrix(matrix, 12));
	}
	
	@Test
	public void test2() {
		int[][] matrix = {
				{1},
		};
		SearchA2DMatrix sol = new SearchA2DMatrix();
		assertFalse(sol.searchMatrix(matrix, 2));
	}

}
