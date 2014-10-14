package longest_consecutive_sequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {

	@Test
	public void test() {
		int[] num = {100, 4, 200, 1, 3, 2};
		LongestConsecutiveSequence sol = new LongestConsecutiveSequence();
		assertEquals(4, sol.longestConsecutive(num));
	}

}
