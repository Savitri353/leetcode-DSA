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
       return solve(root) != -1;
    }

    public int solve(TreeNode root) {
        if(root == null) return 0;

        int leftH = solve(root.left);
        if(leftH == -1) return -1;

        int rightH = solve(root.right);
        if(rightH == -1) return -1;

        if(Math.abs(leftH-rightH) > 1) return -1;

        return 1+Math.max(solve(root.left), solve(root.right));
    }   
}
//Height depends on children

// So use postorder traversal

// If any subtree is unbalanced → return -1

// Propagate -1 upwards

// At the end:

// -1 → not balanced 

// otherwise → balanced 