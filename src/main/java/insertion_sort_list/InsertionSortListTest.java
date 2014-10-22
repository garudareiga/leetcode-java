package insertion_sort_list;

import org.junit.Test;
import util.ListNode;

public class InsertionSortListTest {

	@Test
	public void testInsertionSortList() {
		InsertionSortList sol = new InsertionSortList();
		ListNode[] nodes = {
			new ListNode(4),
			new ListNode(3),
			new ListNode(0),
			new ListNode(2),
			new ListNode(1)
		};
		for (int i = 0; i < nodes.length - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
		ListNode.printList(nodes[0]);
		ListNode head = sol.insertionSortList(nodes[0]);
		ListNode.printList(head);
	}

}
