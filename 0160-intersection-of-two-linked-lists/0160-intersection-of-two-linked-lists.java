/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        int diff = Math.abs(lenA - lenB);

        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            while (diff > 0) {
                tempA = tempA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                tempB = tempB.next;
                diff--;
            }
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                // We don't check values because the same value can appear in different nodes before the intersection.
                return tempA;

            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
    }
