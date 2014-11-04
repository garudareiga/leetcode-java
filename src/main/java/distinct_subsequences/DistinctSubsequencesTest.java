package distinct_subsequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctSubsequencesTest {

	@Test
	public void test1() {
		DistinctSubsequences sol = new DistinctSubsequences();
		assertEquals(3, sol.numDistinct("rabbbit", "rabbit"));
	}

   @Test
    public void test2() {
        DistinctSubsequences sol = new DistinctSubsequences();
        assertEquals(3, sol.numDistinct("ccc", "c"));
    }
}
