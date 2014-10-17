package reorder_list;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a singly linked list L: L0 -> L1 -> ... -> Ln-1 -> Ln,
 * reorder it to: L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 ...
 *  
 * You must do this in-place without altering the nodes' values.
 *  
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 */

public class ReorderList {    
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        // Divide the list into two portions
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
        	prev = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        // Separate the first half and second half
        prev.next = null;
        // Reverse second half
        ListNode first = head, second = slow;
        second = ListNode.reverse(second);
        // Connect two portions together
        while (first.next != null) {
        	ListNode next = first.next;
        	first.next = second;
        	second = second.next;
        	first.next.next = next;
        	first = next;
        }
        first.next = second;
    }
}
