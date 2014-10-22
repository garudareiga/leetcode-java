package merge_two_sorted_lists;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoSortedLists {	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(0), p = dummy;
    	while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				p.next = l1; l1 = l1.next;
			} else {
				p.next = l2; l2 = l2.next;
			}
    		p = p.next;
    	}
    	p.next = l1 != null ? l1 : l2;
    	return dummy.next;
    }
}
