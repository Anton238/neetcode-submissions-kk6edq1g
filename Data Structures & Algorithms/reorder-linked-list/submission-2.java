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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        var fast = head;
        var slow = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null) break;
        }

        var fix = slow.next;

        while (fix.next != null) {
            var tmp = slow.next;
            slow.next = fix.next;
            fix.next = fix.next.next;
            slow.next.next = tmp;
        }

        fast = slow.next;
        slow.next = null;
        slow = fast;

        fast = head;

        while (slow != null && fast != null) {
            var tmp = fast.next;
            fast.next = slow;
            slow = slow.next;

            if (fast.next != null) {
            fast.next.next = tmp;
            fast = fast.next.next;
            }
        }


    }
}
