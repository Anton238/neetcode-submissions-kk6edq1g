/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var d = new ListNode();
        var res = d;

        boolean ten = false;
        while (l1 != null || l2 != null) {
            int n = 0;

            if (l1 == null) n = l2.val;
            else if (l2 == null) n = l1.val;
            else n = l1.val + l2.val;

            if (ten) n++;

            if (n >= 10) {
                n -= 10;
                ten = true;
            } else {
                ten = false;
            }

            d.next = new ListNode(n);
            d = d.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            if (l1 == null && l2 == null && ten) {
                d.next = new ListNode(1);
            }
        }

        return res.next;
    }
}
