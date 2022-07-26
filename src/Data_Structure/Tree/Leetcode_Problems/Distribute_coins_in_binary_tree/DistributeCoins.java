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
    public int distributeCoins(TreeNode root) {
        int res = 0;
        if (root.left != null) {
            // Traverse left subtree
            res += distributeCoins(root.left);
            root.val += root.left.val - 1;
            // Update number of moves
            res += Math.abs(root.left.val - 1);
        }
        if (root.right != null) {
            // Traverse right subtree
            res += distributeCoins(root.right);
            root.val += root.right.val - 1;
            // Update number of moves
            res += Math.abs(root.right.val - 1);
        }
        return res;
    }
}