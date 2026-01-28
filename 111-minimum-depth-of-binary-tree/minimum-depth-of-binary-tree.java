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
   
    public int minDepth(TreeNode root) {
       if(root == null) return 0;

       //if left is null go towards right,
       //n1-n2-n3-n4,, to avoid this kind of tree that is like chain there we can't return 1

       if(root.left == null) {
            return 1+minDepth(root.right);
       } 

       if(root.right == null) {
            return 1+minDepth(root.left);
       }

       return 1 + Math.min( minDepth(root.left), minDepth(root.right) );
    }
}