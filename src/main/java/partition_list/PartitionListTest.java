package partition_list;

import util.ListNode;

import org.junit.Test;

public class PartitionListTest {

	@Test
	public void test() {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(1);
		node1.next = node2;
		
		PartitionList sol = new PartitionList();
		ListNode head = sol.partition(node1, 2);
		System.out.println(head.val);
		System.out.println(head.next.val);
	}

}
