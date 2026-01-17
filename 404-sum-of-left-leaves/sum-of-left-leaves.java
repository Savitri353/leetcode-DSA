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

     public int sumOfLeftLeaves(TreeNode root) {
        return solve(root, false);
     }

     public int solve(TreeNode current, boolean isLeft) {
        if(current == null) return 0;

        if(current.left == null && current.right == null) {
            if(isLeft) {
                return current.val;
            }
        }

        return solve(current.left, true) + solve(current.right, false);
     }
    // public int sumOfLeftLeaves(TreeNode root) {

    //  return solve(root, null); 
    // }

    // public int solve(TreeNode current, TreeNode parent) {
    //     if(current == null) return 0;

    //     //leaf
    //     if(current.left == null && current.right==null) {
    //         if(parent != null && parent.left == current) {
    //             return current.val;
    //         }
    //     }

    //     int left = solve(current.left, current); 
    //     int right = solve(current.right, current); 

    //     return left+right;
    // }
}