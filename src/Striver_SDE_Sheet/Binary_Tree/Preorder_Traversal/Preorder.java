package Striver_SDE_Sheet.Binary_Tree.Preorder_Traversal;

import Data_Structure.Tree.Traversals.PreOrderTraversal.Preorder_bt;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
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
        System.out.println(preorderTraversal(root));
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> b = new ArrayList<>();
        preOrder(root, b);
        return b;
    }

    public static void preOrder(TreeNode root, List<Integer> b) {
        if (root == null) {
            return;
        }
        b.add(root.val);
        preOrder(root.left, b);
        preOrder(root.right, b);
    }
}
