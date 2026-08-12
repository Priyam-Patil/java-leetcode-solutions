class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        
        int r = k % size;

if (r == 0 || size == 1) {
    return head;
}

        int i = 1;
        ListNode prev = head;

        while (i < (size - r)) {
            prev = prev.next;
            i++;
        }

        ListNode sechead = prev.next;
        prev.next = null;

        ListNode temp1 = sechead;

        while (temp1.next != null) {
            temp1 = temp1.next;
        }

        temp1.next = head;
        head = sechead;

        return head;
    }
}
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