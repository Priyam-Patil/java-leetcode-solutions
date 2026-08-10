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



//  zigzag pattern arrangement of nodes
class Solution {
    public void reorderList(ListNode head) {

        // step1-finding mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
ListNode midnode=slow;


// step2-reverse second half
ListNode curr=midnode.next;
midnode.next=null;
ListNode prev=null;
ListNode next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}

// step3-rearranging nodes in zigzag pattern
ListNode left_head=head;
ListNode right_head=prev;
ListNode lside;
ListNode rside;

while(left_head!=null && right_head!=null){
    lside=left_head.next;
    left_head.next=right_head;
    rside=right_head.next;
    right_head.next=lside;

    left_head=lside;
    right_head=rside;
}




        
    }
}