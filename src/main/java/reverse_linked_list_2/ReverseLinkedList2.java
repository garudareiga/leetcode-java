package reverse_linked_list_2;

import java.util.*;
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
    	
    	ListNode prev_mnd = dummy;
    	for (int i = 0; i < m - 1; i++) {
    		prev_mnd = prev_mnd.next;
    	}
    	
    	ListNode prev = prev_mnd.next, curr = prev.next;
    	for (int i = m; i < n; i++) {
    		prev.next = curr.next;
    		curr.next = prev_mnd.next;
    		prev_mnd.next = curr;
    		curr = prev.next;
    	}
    	
    	return dummy.next;
    }
}
