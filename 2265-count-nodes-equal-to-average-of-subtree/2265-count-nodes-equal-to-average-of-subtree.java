/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


// Instance variable accessible by all methods in the class to maintain state across recursive calls.
// Persists throughout the entire DFS traversal so every matching subtree average increments the total count.


class Solution {
    int result = 0;

    public int averageOfSubtree(TreeNode root) {
        bfs(root);
        return result;
    }

    public int[] bfs(TreeNode root) {
        if (root == null) {
            return new int[] { 0, 0 };//{sum,count}
        }
        int[] left = bfs(root.left);
        int[] right = bfs(root.right);
        int sum = root.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];
        if (sum / count == root.val) {
            result++;
        }
        return new int[] { sum, count };
    }
}