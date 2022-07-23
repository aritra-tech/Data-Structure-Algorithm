package Data_Structure.Tree.Traversals.Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Postorder_bt {

    static class TreeNode {
        int val;
        Postorder_bt.TreeNode left;
        Postorder_bt.TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Postorder_bt.TreeNode root = new Postorder_bt.TreeNode(1);
        root.left = new Postorder_bt.TreeNode(0);
        root.right = new Postorder_bt.TreeNode(2);
        root.right.left = new Postorder_bt.TreeNode(3);
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }

    public static void postOrder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
}