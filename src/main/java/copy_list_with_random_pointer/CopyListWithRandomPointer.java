package copy_list_with_random_pointer;

import util.RandomListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * A linked list is given such that each node contains an additional random 
 * pointer which could point to any node in the list or null.
 *  
 * Return a deep copy of the list.
 * 
 */

public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
    	if (head == null)
    		return head;
    	for (RandomListNode curr = head; curr != null; ) {
    		RandomListNode n = new RandomListNode(curr.label);
    		n.next = curr.next;
    		curr.next = n;
    		curr = n.next;
    	}
    	for (RandomListNode curr = head; curr != null; ) {
    		if (curr.random != null)
    			curr.next.random = curr.random.next;
    		curr = curr.next.next;
    	}
    	
    	// Seperate two lists again !!!
    	RandomListNode dummy = new RandomListNode(0);
    	RandomListNode prev = dummy;
    	for (RandomListNode curr = head; curr != null; ) {
    		prev.next = curr.next;
    		prev = curr.next;
    		curr = curr.next.next;
    	}
    	prev.next = null;
    	return dummy.next;
    }
}
