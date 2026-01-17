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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        
        
        solve(list, root);
        return list.get(k-1);
    }

    public void solve(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }

        //inroder
         solve(list, root.left);
         list.add(root.val);
         solve(list, root.right);
    }
}