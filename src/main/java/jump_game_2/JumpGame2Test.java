package jump_game_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGame2Test {

	@Test
	public void test() {
		int[] A1 = {2,3,1,1,4};
		int[] A2 = {2, 1};
		JumpGame2 sol = new JumpGame2();
		assertEquals(2, sol.jump(A1));
		assertEquals(1, sol.jump(A2));
	}

}
