package linked_list_cycle;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a linked list, determine if it has a cycle in it.
 *  
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {        
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
