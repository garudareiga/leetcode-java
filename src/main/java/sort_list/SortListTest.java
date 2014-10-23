package sort_list;

import util.ListNode;

import org.junit.Test;

public class SortListTest {

    @Test
    public void testSortList1() {
        ListNode node_1 = new ListNode(2);
        ListNode node_2 = new ListNode(1);
        ListNode node_3 = new ListNode(4);
        ListNode node_4 = new ListNode(3);
        
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        
        SortList sol = new SortList();
        ListNode.printList(node_1);
        ListNode head = sol.sortList(node_1);
        ListNode.printList(head);
    }

    @Test
    public void testSortList2() {
        ListNode node_1 = new ListNode(2);
        ListNode node_2 = new ListNode(1);
        ListNode node_3 = new ListNode(4);
        ListNode node_4 = new ListNode(3);
        ListNode node_5 = new ListNode(2);
        
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        
        SortList sol = new SortList();
        ListNode.printList(node_1);
        ListNode head = sol.sortList(node_1);
        ListNode.printList(head);
    }
}
