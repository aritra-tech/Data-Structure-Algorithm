package Data_Structure.Tree.ViewofBT.Right_View_of_Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class RightViewBT_Java {
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
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        List<Integer> list = new ArrayList<>();
        System.out.println(rightView(root, list, 0));
    }

    private static List<Integer> rightView(TreeNode root, List<Integer> list, int level) {
        if (root == null) return null;
        if (list.size() == level) list.add(root.val);
        rightView(root.right, list, level+1);
        rightView(root.left, list, level+1);
        return list;
    }
}
