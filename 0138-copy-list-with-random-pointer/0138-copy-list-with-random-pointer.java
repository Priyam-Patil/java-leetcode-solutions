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
        if(head==null){
            return null;
        }
        
        Node curr = head;
        // inserting same node between nodes
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);//same node
            curr.next.next = temp;
            curr = temp;
        }

        // arranging random pointers of node nodes
        curr = head;
        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }

            curr = curr.next.next;
        }

        // separating both ll
        Node ori = head;
        Node newN = head.next;
        Node temp1 = newN;
        while (ori != null) {
            ori.next = ori.next.next;
            if (newN.next != null) {
                newN.next = newN.next.next;
            }

            ori = ori.next;
            newN = newN.next;

        }
        return temp1;

    }
}