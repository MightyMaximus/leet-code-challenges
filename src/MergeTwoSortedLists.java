/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Merge Two Sorted Lists</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-09
 * */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode nodes = head;

        while(l1 != null && l2!= null) {
            if(l1.val < l2.val) {
                nodes.next = l1;
                l1 = l1.next;
            } else {
                nodes.next = l2;
                l2 = l2.next;
            }
            nodes = nodes.next;
        }

        if(l1 != null) // different sized lists
            nodes.next = l1;
        if(l2 != null)
            nodes.next = l2;
        return head.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
