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
    public List<Integer> rightSideView(TreeNode root) {
        var res = new ArrayList<Integer>();

        if (root == null) return res;

        var q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()) {
            var s = q.size();

            for (int i = 0; i < s; i++) {
                var n = q.poll();

                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }

                if (i == s-1) {
                    res.add(n.val);
                }
            }
        }

        return res;
    }
}
