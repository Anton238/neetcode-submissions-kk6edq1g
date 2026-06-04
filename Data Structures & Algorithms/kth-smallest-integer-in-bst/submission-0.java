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

    List<Integer> l = new ArrayList<Integer>();
    
    public int kthSmallest(TreeNode root, int k) {
        smallest(root);
        return l.get(k-1);
    }

    public void smallest(TreeNode root) {
        if (root == null) return;

        smallest(root.left);
        l.add(root.val);
        smallest(root.right);
    }
}
