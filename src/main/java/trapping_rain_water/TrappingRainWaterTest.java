package trapping_rain_water;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrappingRainWaterTest {

	@Test
	public void testTrap1() {
		int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
		TrappingRainWater sol = new TrappingRainWater();
		assertEquals(6, sol.trap(A));
	}

	@Test
	public void testTrap2() {
		int[] A = {2,0,2};
		TrappingRainWater sol = new TrappingRainWater();
		assertEquals(2, sol.trap(A));
	}

}
