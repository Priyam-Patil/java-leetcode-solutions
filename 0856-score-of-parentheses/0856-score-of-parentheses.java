class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char c : s.toCharArray()) {

            if (c == '(') {
                st.push(0);
            } 
            else {
                int val = st.pop();

                if (val == 0) {
                    val = 1;          // ()
                } 
                else {
                    val = 2 * val;    // (A)
                }

                st.push(st.pop() + val);
            }
        }

        return st.pop();
    }
}