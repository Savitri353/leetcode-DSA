/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
     if(root == null) {
        return null;
     }

    //if both p and q are on the left side
     if(p.val<root.val && q.val<root.val) {
        return lowestCommonAncestor(root.left, p, q);
     }   

    //if both p and q are on the right side
     if(p.val>root.val && q.val>root.val) {
        return lowestCommonAncestor(root.right, p, q);
     } 

     //if split

        return root; 
    }
}

//In a BST:

// Left subtree values < root

// Right subtree values > root
// Case 1️⃣

// If both p and q are smaller than root
// ➡️ LCA must be in the left subtree

// Case 2️⃣

// If both p and q are greater than root
// ➡️ LCA must be in the right subtree

// Case 3️⃣

// If one is on the left and one is on the right
// ➡️ 🎯 root is the LCA

// Case 4️⃣

// If root equals p or q
// ➡️ 🎯 root is the LCA