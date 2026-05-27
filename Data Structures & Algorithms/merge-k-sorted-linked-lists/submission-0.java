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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode res = lists[0];

        for (int i = 1; i < lists.length; i++) {
            res = mergeList(res, lists[i]);
        }

        return res;
    }

    ListNode mergeList(ListNode l1, ListNode l2) {
        var res = new ListNode();
        var result = res;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                res.next = l2; 
                return result.next;
            } 

            if (l2 == null) {
                res.next = l1;
                return result.next;
            }

            if (l2.val < l1.val) {
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            } else {
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            }
        }

        return result.next;
    }
}
