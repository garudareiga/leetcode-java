package jump_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGameTest {

	@Test
	public void test() {
		int[] A1 = {2,3,1,1,4};
		int[] A2 = {3,2,1,0,4};
		JumpGame sol = new JumpGame();
		assertTrue(sol.canJump(A1));
		assertFalse(sol.canJump(A2));
	}

}
