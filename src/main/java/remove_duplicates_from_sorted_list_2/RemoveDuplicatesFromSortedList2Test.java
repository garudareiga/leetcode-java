package remove_duplicates_from_sorted_list_2;

import static org.junit.Assert.*;

import org.junit.Test;

import util.ListNode;

public class RemoveDuplicatesFromSortedList2Test {

	@Test
	public void testDeleteDuplicates1() {
		RemoveDuplicatesFromSortedList2 sol = new RemoveDuplicatesFromSortedList2();
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3),
			new ListNode(3),
			new ListNode(4),
			new ListNode(4),
			new ListNode(5)
		};
		for (int i = 0; i < nodes.length - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
		ListNode.printList(nodes[0]);
		ListNode head = sol.deleteDuplicates(nodes[0]);
		ListNode.printList(head);
		
		int nodeCnt = 0;
		ListNode tmpNode = head;
		while (tmpNode != null) {
			nodeCnt += 1;
			tmpNode = tmpNode.next;
		}
		assertEquals(3, nodeCnt);
	}

	@Test
	public void testDeleteDuplicates2() {
		RemoveDuplicatesFromSortedList2 sol = new RemoveDuplicatesFromSortedList2();
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(1),
			new ListNode(1),
			new ListNode(2),
			new ListNode(3)
		};
		for (int i = 0; i < nodes.length - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
		ListNode.printList(nodes[0]);
		ListNode head = sol.deleteDuplicates(nodes[0]);
		ListNode.printList(head);
		
		int nodeCnt = 0;
		ListNode tmpNode = head;
		while (tmpNode != null) {
			nodeCnt += 1;
			tmpNode = tmpNode.next;
		}
		assertEquals(2, nodeCnt);
	}
	
	@Test
	public void testDeleteDuplicates3() {
		RemoveDuplicatesFromSortedList2 sol = new RemoveDuplicatesFromSortedList2();
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(1),
			new ListNode(1)
		};
		for (int i = 0; i < nodes.length - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
		ListNode.printList(nodes[0]);
		ListNode head = sol.deleteDuplicates(nodes[0]);
		ListNode.printList(head);
		
		int nodeCnt = 0;
		ListNode tmpNode = head;
		while (tmpNode != null) {
			nodeCnt += 1;
			tmpNode = tmpNode.next;
		}
		assertEquals(0, nodeCnt);
	}
	
	@Test
	public void testDeleteDuplicates4() {
		RemoveDuplicatesFromSortedList2 sol = new RemoveDuplicatesFromSortedList2();
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(2)
		};
		for (int i = 0; i < nodes.length - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
		ListNode.printList(nodes[0]);
		ListNode head = sol.deleteDuplicates(nodes[0]);
		ListNode.printList(head);
		
		int nodeCnt = 0;
		ListNode tmpNode = head;
		while (tmpNode != null) {
			nodeCnt += 1;
			tmpNode = tmpNode.next;
		}
		assertEquals(1, nodeCnt);
	}
}
