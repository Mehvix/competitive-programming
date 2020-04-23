/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode extra = new ListNode(-1);
        extra.next = head;  // add -1 to head

        ListNode slow = extra;
        ListNode fast = extra;

        while(fast.next != null && fast.next.next != null){  // has to be in this order
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow.next != null) {
            return slow.next;
        } else {
            return slow;
        }
    }
}