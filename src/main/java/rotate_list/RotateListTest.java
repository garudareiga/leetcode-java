package rotate_list;

import util.*;

import org.junit.Before;
import org.junit.Test;

public class RotateListTest {
	RotateList sol = null;
	
	@Before
	public void setUp() {
		sol = new RotateList();
	}
	
	@Test
	public void test1() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3),
			new ListNode(4),
			new ListNode(5)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ListNode head = sol.rotateRight(nodes[0], 2);
		System.out.println("Test 1: 4, 5, 1, 2, 3");
		ListNode.printList(head);
	}

	@Test
	public void test2() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ListNode head = sol.rotateRight(nodes[0], 1);
		System.out.println("Test 2: 2, 1");
		ListNode.printList(head);
	}
	
	@Test
	public void test3() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ListNode head = sol.rotateRight(nodes[0], 2);
		System.out.println("Test 3: 1, 2");
		ListNode.printList(head);
	}
	
	@Test
	public void test4() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		ListNode head = sol.rotateRight(nodes[0], 3);
		System.out.println("Test 4: 2, 1");
		ListNode.printList(head);
	}
	
	@Test
	public void test5() {
		ListNode[] nodes = {
			new ListNode(1),
			new ListNode(2),
			new ListNode(3)
		};
		
		for (int i = 0; i < nodes.length - 1; i++)
			nodes[i].next = nodes[i + 1];
		
		System.out.println("Test 5: 3, 1, 2");
		RotateList sol = new RotateList();
		ListNode head = sol.rotateRight(nodes[0], 4);
		ListNode.printList(head);
	}
}
