package reverse_nodes_in_k_group;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a linked list, reverse the nodes of a linked list k at a time 
 * and return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in 
 * the end should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * 
 * For example,
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 *
 */

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
    	if (head == null || k <= 1)
    		return head;
    	
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	
    	ListNode prev = dummy, tail = head;
    	while (true) {
    		int count = 0;
    		for (int i = 0; i < k; i++) {
    			if (tail == null)
    				break;
    			count++;
    			tail = tail.next; 
    		}
    		if (count < k) 
    			break;
    		
    		// reverse [head, tail)
    		prev.next = ListNode.reverse(head, tail);
    		head.next = tail;
    		prev = head;
    		head = tail;
    	}
    	return dummy.next;
    }   
}
