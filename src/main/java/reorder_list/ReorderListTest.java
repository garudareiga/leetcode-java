package reorder_list;

import org.junit.Test;
import util.ListNode;;

public class ReorderListTest {

    @Test
    public void test1() {
        ListNode[] nodeList = {
            new ListNode(1),
            new ListNode(2),
            new ListNode(3),
            new ListNode(4),
            new ListNode(5),
        };
        for (int i = 1; i < nodeList.length; i++) {
            nodeList[i - 1].next = nodeList[i];
        }
        
        ListNode.printList(nodeList[0]);
        ReorderList sol = new ReorderList();
        sol.reorderList(nodeList[0]);
        ListNode.printList(nodeList[0]);
    }

    @Test
    public void test2() {
        ListNode[] nodeList = {
            new ListNode(1),
            new ListNode(2),
            new ListNode(3),
            new ListNode(4),
            new ListNode(5),
            new ListNode(6),
        };
        for (int i = 1; i < nodeList.length; i++) {
            nodeList[i - 1].next = nodeList[i];
        }
        
        ListNode.printList(nodeList[0]);
        ReorderList sol = new ReorderList();
        sol.reorderList(nodeList[0]);
        ListNode.printList(nodeList[0]);
    }
    
    @Test
    public void test3() {
        ListNode[] nodeList = {
            new ListNode(1),
            new ListNode(2),
            new ListNode(3),
        };
        for (int i = 1; i < nodeList.length; i++) {
            nodeList[i - 1].next = nodeList[i];
        }
        
        ListNode.printList(nodeList[0]);
        ReorderList sol = new ReorderList();
        sol.reorderList(nodeList[0]);
        ListNode.printList(nodeList[0]);
    }
}
