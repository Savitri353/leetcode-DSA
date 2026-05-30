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
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
       
        int n = preorder.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++) {
            mp.put(inorder[i], i);
        }

        return solve(preorder, inorder, 0, n-1, mp);
    }

    public TreeNode solve(int[] preorder, int[] inorder, int start, int end, HashMap<Integer, Integer> mp) {
        if(start>end) {
            return null;
        }

        int rootVal = preorder[idx];
        int i = mp.get(rootVal);
        TreeNode root = new TreeNode(rootVal);

        idx++;

        root.left = solve(preorder, inorder, start, i-1, mp);
        root.right = solve(preorder, inorder, i+1, end, mp);

        return root;
    }
}