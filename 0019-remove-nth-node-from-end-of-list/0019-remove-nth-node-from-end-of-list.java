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


// return the head of the modified linked list.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size=0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if(n==size){
            head=head.next;
            return head;

        }

        int i = 1;
        ListNode prev = head;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
       
        prev.next = prev.next.next;
        return head;
    }
}