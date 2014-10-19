package reverse_linked_list_2;

import org.junit.Test;
import util.ListNode;

public class ReverseLinkedList2Test {

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
		ReverseLinkedList2 sol = new ReverseLinkedList2();
		ListNode head = sol.reverseBetween(nodes[0], 2, 4);
		ListNode.printList(head);
	}
	
	@Test
	public void test2() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ReverseLinkedList2 sol = new ReverseLinkedList2();
		ListNode head = sol.reverseBetween(nodes[0], 1, 3);
		ListNode.printList(head);
	}

}
