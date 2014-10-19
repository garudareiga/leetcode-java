package swap_nodes_in_pairs;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the 
 * values in the list, only nodes itself can be changed.
 * 
 */

public class SwapNodesInPairs {        
    public ListNode swapPairs(ListNode head) {
    	if (head == null)
    		return head;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode prev = dummy, next = null;
    	while (head != null && head.next != null) {
    		next = head.next.next;
    		prev.next = head.next;
    		prev.next.next = head;
    		head.next = next;
    		prev = head;
    		head = next;
    	}
    	return dummy.next;
    }
}
