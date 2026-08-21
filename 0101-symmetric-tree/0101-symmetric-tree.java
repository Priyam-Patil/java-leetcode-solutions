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


class Solution {
    public boolean same(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return same(left.left, right.right) && same(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return same(root.left, root.right);
    }
}