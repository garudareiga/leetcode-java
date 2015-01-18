package intersection_of_two_linked_lists;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * A:       a1 -> a2
                  |
                   --> c1 -> c2 -> c3
                  |            
 * B: b1 -> b2 -> b3
 * begin to intersect at node c1.
 * 
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 */ 

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int numA = getNumNode(headA),
            numB = getNumNode(headB);
        ListNode swap;
        if (numA < numB) { swap = headA; headA = headB; headB = swap; }
        for (int i = 0; i < Math.abs(numA - numB); i++) headA = headA.next;
        while (headA != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int getNumNode(ListNode head) {
        int num = 0;
        while (head != null) { head = head.next; num++; }
        return num;
    }
}
