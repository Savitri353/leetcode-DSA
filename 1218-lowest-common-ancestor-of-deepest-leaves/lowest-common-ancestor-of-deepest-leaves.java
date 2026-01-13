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
    class Pair {
        int height;
        TreeNode node;

        Pair(int height, TreeNode node) {
            this.height = height;
            this.node = node;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }

    private Pair dfs(TreeNode root) {
        if(root == null) {
            return new Pair(-1, null);
        }

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        //if left subtree is deeper
        if(left.height > right.height) {
            return new Pair(left.height+1, left.node);
        }

        //if right subtree is deeper
        if(right.height>left.height) {
            return new Pair(right.height+1, right.node);
        }

        //if both sides are equal-> current node is LCA
        return new Pair(left.height+1, root);
    }
}      // Map<Integer, Integer> map = new HashMap<>();
        // int maxD = 0;
//     public TreeNode lcaDeepestLeaves(TreeNode root) {
//         depth(root, 0);
//        return lca(root);
//     }

//     public void depth(TreeNode root, int d) {
//         if(root == null) {
//             return;
//         }

//         maxD = Math.max(maxD, d);
//         map.put(root.val, d);
//         depth(root.left, d+1);
//         depth(root.right, d+1);
//     }

//     public TreeNode lca(TreeNode root) {
//         if(root == null || map.get(root.val) == maxD) {
//             return root;
//         }

//         TreeNode l = lca(root.left);
//         TreeNode r = lca(root.right);

//         if(l != null && r != null) {
//             return root;
//         }

//         return l != null ? l:r;
//     }
// }