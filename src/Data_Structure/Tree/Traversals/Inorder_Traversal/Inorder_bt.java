package Data_Structure.Tree.Traversals.Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;

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
public class Inorder_bt {

    static class TreeNode {
        int val;
        Inorder_bt.TreeNode left;
        Inorder_bt.TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Inorder_bt.TreeNode root = new Inorder_bt.TreeNode(1);
        root.left = new Inorder_bt.TreeNode(0);
        root.right = new Inorder_bt.TreeNode(2);
        root.right.left = new Inorder_bt.TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }
    
    public static void inOrder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrder(root.left, ans);
        }
        ans.add(root.val);
        if (root.right != null) {
            inOrder(root.right, ans);
        }
    }
}