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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> list = new ArrayList<>();
       solve(list, new ArrayList<>(), root, targetSum);
        return list;
    }

    public void solve(List<List<Integer>> list, List<Integer> temp, TreeNode root, int targetSum) {
        if(root == null) return;
        temp.add(root.val);

        if(root.left == null && root.right == null && root.val == targetSum) {
            list.add(new ArrayList<>(temp));
        }

        solve(list, temp, root.left, targetSum-root.val);
        solve(list, temp, root.right, targetSum-root.val);

        temp.remove(temp.size()-1);
    }
}