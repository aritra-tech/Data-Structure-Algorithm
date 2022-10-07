package Striver_SDE_Sheet.Binary_Tree.Inorder_Traversal;

import Data_Structure.Tree.Traversals.Inorder_Traversal.Inorder_bt;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
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
