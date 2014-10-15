package add_two_numbers;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	/*
    	 * Time Complexity: O(M + N)
    	 * Space Complexity: O(1)
    	 */
        int inc = 0, v, v1, v2;
        ListNode dummy = new ListNode(0), curr = dummy;
    	while (l1 != null || l2 != null || inc == 1) {
    		v1 = l1 != null ? l1.val : 0;
    		v2 = l2 != null ? l2.val : 0;
    		l1 = (l1 != null ? l1.next : null);
    		l2 = (l2 != null ? l2.next : null);
    		    		
    		v = v1 + v2 + inc;
    		inc = v/10;
        	ListNode next = new ListNode(v%10);
        	curr.next = next;
        	curr = next;
        }
    	return dummy.next;
    }
}
