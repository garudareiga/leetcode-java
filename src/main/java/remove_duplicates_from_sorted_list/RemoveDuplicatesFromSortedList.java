package remove_duplicates_from_sorted_list;

import util.ListNode;

/*
 *  @author raychen
 * 
 *  Problem:
 *  Given a sorted linked list, delete all duplicates such that each element appear only once.
 *  
 *  For example,
 *  Given 1->1->2, return 1->2.
 *  Given 1->1->2->3->3, return 1->2->3.
 *
 */

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	if (head == null || head.next == null)
    		return head;
    	ListNode dummy = new ListNode(Integer.MAX_VALUE), prev = dummy;
    	while (head != null) {
    		if (head.val != prev.val) {
    			prev.next = head;
    			prev = head;    			
    		}
    		head = head.next;
    	}
    	prev.next = null;	// important !!!
    	return dummy.next;
    }
}
