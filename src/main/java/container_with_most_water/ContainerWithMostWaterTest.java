package container_with_most_water;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterTest {
	ContainerWithMostWater sol = null;

	@Before
	public void setUp() throws Exception {
		sol = new ContainerWithMostWater();
	}

	@Test
	public void test1() {
		int[] height = {1, 2, 1};
		assertEquals(2, sol.maxArea(height));
	}
	
	@Test
	public void test2() {
		int[] height = {1, 1};
		assertEquals(2, sol.maxArea(height));
	}

}
