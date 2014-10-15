package partition_list;

import util.ListNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a linked list and a value x, partition it such that all nodes less than x 
 * come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	if (head == null || head.next == null)
    		return head;
    	ListNode dummy_1 = new ListNode(0);
    	ListNode dummy_2 = new ListNode(0);
    	ListNode curr_1 = dummy_1, curr_2 = dummy_2;
    	while (head != null) {
    		if (head.val < x) {
    			curr_1.next = head;
    			curr_1 = head;
    		} else {
    			curr_2.next = head;
    			curr_2 = head;
    		}
    		head = head.next;
    	}
    	curr_1.next = dummy_2.next;
    	curr_2.next = null;		// very importance !!!
    	return dummy_1.next;
    }	
}
