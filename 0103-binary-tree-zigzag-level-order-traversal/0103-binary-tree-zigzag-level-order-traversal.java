
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

import java.util.*;

class Solution {
    public class info {
        TreeNode node;
        int level;

        public info(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        Queue<info> q = new LinkedList<>();
        q.add(new info(root, 1));
        q.add(null);
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                ans.add(list);
                list = new ArrayList<>();//create empty list after each level
                if (!q.isEmpty()) {
                    q.add(null);
                }
                continue;
            }

            // Odd level → normal insertion:

            // list.add(curr.node.val);

            // Even level → insert at index 0:

            // list.add(0, curr.node.val);
            if (curr.level % 2 == 1) {//odd level
                list.add(curr.node.val);
            } else {//even level
                list.add(0, curr.node.val);
            }

            if (curr.node.left != null) {
                q.add(new info(curr.node.left, curr.level + 1));
            }
            if (curr.node.right != null) {
                q.add(new info(curr.node.right, curr.level + 1));
            }
        }
        return ans;

    }
}