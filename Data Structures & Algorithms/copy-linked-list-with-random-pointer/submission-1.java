/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        var d = head;

        while (head != null) {
            var clone = new Node(head.val);
            clone.random = head.random;
            var tmp = head.next;
            head.next = clone;
            clone.next = tmp;
            head = tmp;
        }

        head = d.next;
        var newNode = head;

        while (head != null) {
            var random = head.random == null ? null : head.random.next;
            head.random = random;
            
            if (head.next == null) break;

            head = head.next.next;
        }

        head = d.next;

        while (head != null) {
            if (head.next != null) {
                head.next = head.next.next;
            }

            if (head != null)
                head = head.next;
        }

        d.next = null;

        return newNode;
    }
}
