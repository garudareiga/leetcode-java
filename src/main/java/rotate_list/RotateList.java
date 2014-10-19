package rotate_list;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 *  
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 */

public class RotateList {    
    public ListNode rotateRight(ListNode head, int n) {
    	if (head == null || head.next == null || n == 0)
    		return head;
  	
    	int count = 1;
    	ListNode tail = head;
    	while (tail.next != null) {
    		count++; tail = tail.next; 
    	}
    	
    	n = count - n % count;
    	tail.next = head; // connect head & tail to form a circle
    	for (int i = 0; i < n; i++) {
    		tail = tail.next;
    	}
    	head = tail.next;
    	tail.next = null;
    	return head;
    }       
}
