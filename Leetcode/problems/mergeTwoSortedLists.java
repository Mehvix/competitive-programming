class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode combo = null;
        ListNode current = null;

        while (l1 != null || l2 != null) {
            ListNode small = smaller(l1, l2);

            if(combo == null)   combo = small;
            else                current.next = small;
            current = small;


            if (small == l1) {
                l1 = l1.next;
            }
            if (small == l2) {
                l2 = l2.next;
            }
        }
        return combo;
    }


    ListNode smaller (ListNode  l1, ListNode l2){
        if (l1 == null && l2 == null) return null;
        if (l1 == null && l2 != null) return l2;
        if (l1 != null && l2 == null) return l1;
        if (l1.val > l2.val) return l2;
        return l1;
    }
}
