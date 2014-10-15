package gas_station;

import static org.junit.Assert.*;

import org.junit.Test;

public class GasStationTest {

	@Test
	public void testCanCompleteCircuit1() {
		int[] gas = new int[1];
		int[] cost = new int[1];
		
		gas[0] = 5;
		cost[0] = 4;
		
		GasStation sol = new GasStation();
		assertEquals(0, sol.canCompleteCircuit(gas, cost));
	}

}
