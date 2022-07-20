package Data_Structure.Tree.LCA;

import groovyjarjarantlr4.runtime.tree.Tree;

public class LCA_BST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(7);

        TreeNode node1 = LCA(root, root.left, root.left.right);

        System.out.println(node1.val);
    }

    private static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val < p.val && root.val < q.val)
            return LCA(root.right, p, q);
        if (root.val > p.val && root.val > q.val)
            return LCA(root.left, p ,q);

        return root;
    }
}
