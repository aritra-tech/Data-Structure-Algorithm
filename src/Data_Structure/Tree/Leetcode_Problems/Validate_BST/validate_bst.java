package Data_Structure.Tree.Leetcode_Problems.Validate_BST;

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
public class validate_bst {

    static class TreeNode {
        int val;
        validate_bst.TreeNode left;
        validate_bst.TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }
    public static void main(String args[])
    {
        validate_bst.TreeNode root = new validate_bst.TreeNode(2);
        root.left = new validate_bst.TreeNode(1);
        root.right = new validate_bst.TreeNode(3);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode root, long min_range, long max_range) {
        if(root==null) return true;
        if(root.val >= max_range || root.val <=min_range) return false;
        return valid(root.left,min_range,root.val) && valid(root.right, root.val , max_range);
    }
}