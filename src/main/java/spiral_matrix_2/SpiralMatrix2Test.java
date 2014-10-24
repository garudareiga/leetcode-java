package spiral_matrix_2;

import org.junit.Test;

public class SpiralMatrix2Test {

	@Test
	public void test() {
		SpiralMatrix2 sol = new SpiralMatrix2();
		int n = 3;
		int[][] result = sol.generateMatrix(n);
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.print(result[r][c] + " ");
			}
			System.out.println();
		}
	}

}
