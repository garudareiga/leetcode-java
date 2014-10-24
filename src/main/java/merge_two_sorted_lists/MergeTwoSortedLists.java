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
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
    	return ListNode.merge(l1, l2);
    }
}
