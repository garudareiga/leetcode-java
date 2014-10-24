package triangle;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class SolutionTest {

	@Test
	public void test() {
		Solution sol = new Solution();
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(new ArrayList<Integer>(Arrays.asList(2)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(3,4)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(6,5,7)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(4,1,8,3)));
		assertEquals(11, sol.minimumTotal(triangle));
	}

}
