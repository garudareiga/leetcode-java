package linked_list_cycle_2;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a linked list, determine if it has a cycle in it.
 *  
 */

public class LinkedListCycle2 {    
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
            	fast = head;
            	while (fast != slow) {
            		fast = fast.next;
            		slow = slow.next;
            	}
            	return fast;
            }
        }
        return null;
    }
}
