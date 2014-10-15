package gray_code;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class GrayCodeTest {

	@Test
	public void test() {
		GrayCode sol = new GrayCode();
		List<Integer> result = sol.grayCode(3);
		for (Integer r : result) {
			System.out.println(r);
		}
		assertEquals(1<<3, result.size());
	}

}
