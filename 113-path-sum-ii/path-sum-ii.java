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
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        solve(result, new ArrayList<>(), root, targetSum);
        return result;
    }

    public void solve(List<List<Integer>> result, List<Integer> temp, TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }

        temp.add(root.val);

        if(root.left == null && root.right == null &&root.val == targetSum) {
            result.add(new ArrayList<>(temp));
        } else {
        solve(result, temp, root.left, targetSum-root.val);
        solve(result, temp, root.right, targetSum-root.val);
        }
        temp.remove(temp.size()-1);
    }
}