
// q1.isEmpty() and q2.isEmpty() are predefined Queue methods.
// We use them with queue objects to check whether that particular queue is empty.

// empty() is our own method required by LeetCode.
// It checks whether the complete stack is empty or not.

// Direct isEmpty() is wrong here because MyStack class does not have any method named isEmpty().
// So inside MyStack, use empty() instead of isEmpty().

import java.util.*;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        // add elements in non-empty queue
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        int top = -1;
        // remove the elements from non-empty queue till last ele which is stack top 
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(top);//here q2 hold all elements from q1 except last ele which is stack top
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }
                q1.add(top);//// here q1 hold all elements from q2 except last ele which is stack top
            }
        }
        return top;
    }

    public int top() {
        if (empty()) {
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top); // add all elements including top
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top); // add all elements including top
            }
        }

        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();//check both queues are empty or not bcz we dont know which queue holds the elements
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */