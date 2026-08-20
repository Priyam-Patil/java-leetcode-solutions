// variation of catalan number sequence
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("", 0, 0, n, ans);
        return ans;

    }

    public void helper(String curr, int open, int closed, int total, List<String> ans) {
        if (curr.length() == 2 * total) {
            ans.add(curr);
            return;
        }
        if (open < total) {
            helper(curr + "(", open + 1, closed, total, ans);
        }
        if (closed < open) {
            helper(curr + ")", open, closed + 1, total, ans);
        }
    }
}