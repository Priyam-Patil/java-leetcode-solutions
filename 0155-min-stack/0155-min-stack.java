import java.util.*;

class MinStack {
    static class pair {
        int value;
        int minvalue;

        public pair(int value, int minvalue) {
            this.value = value;
            this.minvalue = minvalue;
        }
    }

    Stack<pair> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int value) {
        if (s.isEmpty()) {
            // for 1st pair both same
            s.push(new pair(value, value));
        } else {
            int min = Math.min(value, s.peek().minvalue);
            s.push(new pair(value, min));
        }
    }

    public void pop() {
        s.pop();
    }

    public int top() {
       return s.peek().value;
    }

    public int getMin() {
       return s.peek().minvalue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */