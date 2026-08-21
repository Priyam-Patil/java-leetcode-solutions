// Key points:
// 1. Preorder's first element is always the root.
// 2. Find that root's index in inorder using HashMap.
// 3. Inorder left of root → left subtree, right of root → right subtree.
// 4. x = inRoot - inStart gives the number of nodes in the left subtree.
// 5. Use x to divide preorder into left-subtree and right-subtree ranges.
// 6. Recursively build left and right subtrees.
// 7. Base case: invalid range → return null.
// 8. HashMap gives inorder root index in O(1), making overall TC O(n).

import java.util.*;

class Solution {
    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = map.get(preorder[preStart]);
        int x = inRoot - inStart;

        root.left = helper(preorder, preStart + 1, preStart + x, inorder, inStart, inRoot - 1, map);
        root.right = helper(preorder, preStart + x + 1, preEnd, inorder, inRoot + 1, inEnd, map);

        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode root = helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);

        return root;

    }
}
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