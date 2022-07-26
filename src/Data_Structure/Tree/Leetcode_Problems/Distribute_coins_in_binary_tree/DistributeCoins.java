package Data_Structure.Tree.Leetcode_Problems.Distribute_coins_in_binary_tree;


public class DistributeCoins {

    static class TreeNode {
        int val;
        DistributeCoins.TreeNode left;
        DistributeCoins.TreeNode right;
        TreeNode (int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }
    public static void main(String args[])
    {
        DistributeCoins.TreeNode root = new DistributeCoins.TreeNode(3);
        root.left = new DistributeCoins.TreeNode(0);
        root.right = new DistributeCoins.TreeNode(0);
        System.out.println(distributeCoins(root));
    }

    public static int distributeCoins(TreeNode root) {
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