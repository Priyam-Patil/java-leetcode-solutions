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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        // finding midnode
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midnode = slow;
        ListNode curr = midnode.next;
        midnode.next = null;

        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode Rhead = prev;
        ListNode Lhead = head;
        while (Rhead != null) {
            if (Rhead.val != Lhead.val) {
                return false;
            }
            Rhead = Rhead.next;
    Lhead = Lhead.next;
        }
        return true;
    }
}