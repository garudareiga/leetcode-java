package partition_list;

import partition_list.Solution.ListNode;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(1);
		node1.next = node2;
		
		Solution sol = new Solution();
		ListNode head = sol.partition(node1, 2);
		System.out.println(head.val);
		System.out.println(head.next.val);
	}

}
