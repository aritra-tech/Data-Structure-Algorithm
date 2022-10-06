package Companywise_Questions.Google.Binary_Tree_Maximum_Path_Sum;

public class Binary_Tree_Maximum_Path_Sum {

    public static int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        int[] res = new int[1];
        res[0] = root.val;
        maxBranchSum(root, res);
        return res[0];
    }
          
    public static int maxBranchSum(TreeNode root, int[] res) {
        if (root == null) return 0;
        
        int leftB = maxBranchSum(root.left, res);
        int rightB = maxBranchSum(root.right, res);

        int maxB = root.val + Math.max(leftB, rightB); 
        maxB = Math.max(root.val, maxB);

        int maxPath = Math.max(maxB, root.val + leftB + rightB);

        res[0] = Math.max(res[0], maxPath);
        return maxB;
    }
}
