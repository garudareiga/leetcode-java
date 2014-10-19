package remove_duplicates_from_sorted_list_2;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given a sorted linked list, delete all nodes that have duplicate numbers, 
 *	leaving only distinct numbers from the original list.
 *	For example,
 *	Given 1->2->3->3->4->4->5, return 1->2->5.
 *	Given 1->1->1->2->3, return 2->3.
 */

public class RemoveDuplicatesFromSortedList2 {
	/*
	 * Runtime Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode dummy = new ListNode(0);
		ListNode prev = null, newNode = dummy;
		boolean duplicated = false;
		while (head != null) {
			if (prev == null) {
				prev = head;
			} else {
				if (head.val == prev.val) {
					duplicated = true;
				} else {
					if (duplicated == false) {
						newNode.next = prev;
						newNode = prev;
					} else {
						duplicated = false;
					}
					prev = head;
				}
			}
			head = head.next;
		}
		if (duplicated == false) {
			newNode.next = prev;
			newNode = prev;
		}
		newNode.next = null;
		return dummy.next;
	}
}
