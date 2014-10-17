package reverse_nodes_in_k_group;

import util.ListNode;

import org.junit.Test;

public class ReverseNodesInKGroupTest {

	@Test
	public void test1() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3),
			new ListNode(4),
			new ListNode(5),
			new ListNode(6)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ReverseNodesInKGroup sol = new ReverseNodesInKGroup();
		ListNode head = sol.reverseKGroup(nodes[0], 2);
		ListNode.printList(head);
	}
	
	@Test
	public void test2() {
		ListNode[] nodes = {
			new ListNode(1)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ReverseNodesInKGroup sol = new ReverseNodesInKGroup();
		ListNode head = sol.reverseKGroup(nodes[0], 2);
		ListNode.printList(head);
	}
	
	@Test
	public void test3() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ReverseNodesInKGroup sol = new ReverseNodesInKGroup();
		ListNode head = sol.reverseKGroup(nodes[0], 2);
		ListNode.printList(head);
	}
}
