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
    public boolean isBalanced(TreeNode root) {
        return balanced(root)[0] == 1;
    }

    private int[] balanced(TreeNode root) {
        if (root == null) return new int[] {1, 0};

        var l = balanced(root.left);
        var r = balanced(root.right);

        if (l[0] == 1 && r[0] == 1 && Math.abs(r[1] - l[1]) <= 1) {
            return new int[] {1, Math.max(r[1], l[1]) + 1};
        }

        return new int[] {0,0};
    }
}
