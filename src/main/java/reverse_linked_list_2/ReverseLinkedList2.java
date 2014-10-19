package reverse_linked_list_2;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *  
 *  For example:
 *  Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *  return 1->4->3->2->5->NULL.
 *  
 *  Note:
 *  Given m, n satisfy the following condition:1 <= m <= n <= length of list.
 *  
 */

public class ReverseLinkedList2 {   
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (head == null || m >= n)
    		return head;
    	
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	
    	ListNode prev_m = dummy, curr_n = dummy;
    	for (int i = 1; i <= n; i++) {
    		if (i <= m - 1) prev_m = prev_m.next;
    		curr_n = curr_n.next;
    	}
    	prev_m.next = ListNode.reverse(prev_m.next, curr_n.next);
    	return dummy.next;
    }
}
