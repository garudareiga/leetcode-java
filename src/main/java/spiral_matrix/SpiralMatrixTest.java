package spiral_matrix;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class SpiralMatrixTest {

	@Test
	public void test() {
		int matrix[][] = {
			{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
		};
		SpiralMatrix sol = new SpiralMatrix();
		List<Integer> result = sol.spiralOrder(matrix);
		for (Integer n : result) System.out.print(n + " ");
		System.out.println();
		assertEquals(9, result.size());
	}

}
