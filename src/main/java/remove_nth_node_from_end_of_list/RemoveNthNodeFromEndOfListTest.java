package remove_nth_node_from_end_of_list;

import org.junit.Test;

import util.ListNode;

public class RemoveNthNodeFromEndOfListTest {

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
		RemoveNthNodeFromEndOfList sol = new RemoveNthNodeFromEndOfList();
		ListNode head = sol.removeNthFromEnd(nodes[0], 2);
		System.out.println("Test result shall be: 1, 2, 3, 5");
		ListNode.printList(head);
	}

}
