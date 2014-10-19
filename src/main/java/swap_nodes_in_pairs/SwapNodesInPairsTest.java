package swap_nodes_in_pairs;

import util.ListNode;

import org.junit.Test;

public class SwapNodesInPairsTest {

	@Test
	public void test1() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3),
			new ListNode(4),
			new ListNode(5)
		};
		
		for (int i = 0; i < 4; i++)
			nodes[i].next = nodes[i + 1];
		SwapNodesInPairs sol = new SwapNodesInPairs();
		ListNode head = sol.swapPairs(nodes[0]);
		ListNode.printList(head);
	}
}
