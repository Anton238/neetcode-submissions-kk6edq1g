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
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree2(root);
        return max;
    }


    public int diameterOfBinaryTree2(TreeNode root) {
        if (root == null) return 0;

        var left = diameterOfBinaryTree2(root.left);
        var right = diameterOfBinaryTree2(root.right);

        max = Math.max(left + right, max);

        return 1 + Math.max(left, right);
    }
}
