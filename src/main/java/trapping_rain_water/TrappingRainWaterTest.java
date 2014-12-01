package trapping_rain_water;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrappingRainWaterTest {

	@Test
	public void testTrap1() {
		int[] A1 = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] A2 = {2,1,3};
		int[] A3 = {1,1,1};
		int[] A4 = {4,1,3,1,4};
		int[] A5 = {4,0,4,1,3};
		TrappingRainWater sol = new TrappingRainWater();
		assertEquals(6, sol.trap(A1));
		assertEquals(1, sol.trap(A2));
		assertEquals(0, sol.trap(A3));
		assertEquals(7, sol.trap(A4));
		assertEquals(6, sol.trap(A5));
	}
   
    @Test
    public void testTrap2() {
        int[] A1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] A2 = {2,1,3};
        int[] A3 = {1,1,1};
        int[] A4 = {4,1,3,1,4};
        int[] A5 = {4,0,4,1,3};
        TrappingRainWater sol = new TrappingRainWater();
        assertEquals(1, sol.trapWithLeaking(A1));
        assertEquals(1, sol.trapWithLeaking(A2));
        assertEquals(0, sol.trapWithLeaking(A3));
        assertEquals(7, sol.trapWithLeaking(A4));
        assertEquals(2, sol.trapWithLeaking(A5));
    }

}
