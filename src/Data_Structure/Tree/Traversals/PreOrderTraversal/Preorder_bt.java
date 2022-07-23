package Data_Structure.Tree.Traversals.PreOrderTraversal;


import java.util.ArrayList;
import java.util.List;

public class Preorder_bt {
    static class TreeNode {
        int val;
        Preorder_bt.TreeNode left;
        Preorder_bt.TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Preorder_bt.TreeNode root = new Preorder_bt.TreeNode(1);
        root.left = new Preorder_bt.TreeNode(0);
        root.right = new Preorder_bt.TreeNode(2);
        root.right.left = new Preorder_bt.TreeNode(3);
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