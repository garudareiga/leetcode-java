package insertion_sort_list;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Sort a linked list using insertion sort.
 */

public class InsertionSortList {	
	public ListNode insertionSortList(ListNode head) {
		/*
		 * Runtime Complexity: O(n^2)
		 * Space Complexity: O(1)
		 */
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		while (head != null) {
			ListNode next = head.next;
			head.next = null;
			ListNode prev = dummy, curr = dummy.next;
			while (curr != null) {
				if (head.val < curr.val)
					break;
				prev = curr;
				curr = curr.next;
			}
			prev.next = head;
			head.next = curr;
			head = next;
		}
		return dummy.next;
	}
}
