package pascal_triangle_2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PascalTriangle2Test {

	@Test
	public void test() {
		PascalTriangle2 sol = new PascalTriangle2();
		List<Integer> result = sol.getRow(3);
		for (Integer num : result) System.out.print(num + " ");
		System.out.println();
		assertEquals(4, result.size());
	}

}
