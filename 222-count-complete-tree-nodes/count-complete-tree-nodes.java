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
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        solve(root);
        return count;
    }

    public void solve(TreeNode root) {
        if(root == null) return;

        solve(root.left);
        count++;
        solve(root.right);
    }
}