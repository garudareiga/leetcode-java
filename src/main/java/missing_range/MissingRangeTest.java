package missing_range;

import java.util.List;

import org.junit.Test;

public class MissingRangeTest {

	@Test
	public void test() {
		MissingRange sol = new MissingRange();

		int[] A = {0, 1, 3, 50, 75};
		List<String> result1 = sol.findMissingRanges(A, 0, 99);
		for (String str : result1) System.out.println(str);
	
		int[] B = {0, 1, 2, 3};
		List<String> result2 = sol.findMissingRanges(B, 0, 3);
		for (String str : result2) System.out.println(str);
	}

}
