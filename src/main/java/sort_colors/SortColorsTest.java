package sort_colors;

import org.junit.Before;
import org.junit.Test;

public class SortColorsTest {
	SortColors sol = null;

	@Before
	public void setUp() throws Exception {
		sol = new SortColors();
	}

	@Test
	public void test1() {
		int[] A = {0};
		sol.sortColors(A);
		for (int a : A) System.out.print(a + " ");
		System.out.println();
	}
	
	@Test
	public void test2() {
		int[] A = {1};
		sol.sortColors(A);
		for (int a : A) System.out.print(a + " ");
		System.out.println();
	}

}
