package Companywise_Questions.Facebook.Lowest_Common_Ancestor_of_a_Binary_Tree;

public class LCA_BT {
    private static class TreeNode {
        int val;
        LCA_BT.TreeNode left;
        LCA_BT.TreeNode right;
        TreeNode (int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new LCA_BT.TreeNode(5);
        root.right = new LCA_BT.TreeNode(1);
        root.left.left = new LCA_BT.TreeNode(6);
        root.left.right = new LCA_BT.TreeNode(2);
        root.right.left = new LCA_BT.TreeNode(0);
        root.right.right = new LCA_BT.TreeNode(8);
        root.left.right.left = new LCA_BT.TreeNode(7);
        root.left.right.right = new LCA_BT.TreeNode(4);

        System.out.print("Tree: ");
        printTree(root);
        System.out.println();

        LCA_BT.TreeNode node1 = lowestCommonAncestor(root, root.left, root.left.right.right);
        LCA_BT.TreeNode node2 = lowestCommonAncestor(root, root.left, root.right);
        System.out.println(node1.val);
        System.out.println(node2.val);
    }

    private static void printTree(LCA_BT.TreeNode root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        printTree(root.left);
        printTree(root.right);
    }

    public static LCA_BT.TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }
}
