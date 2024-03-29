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

package Data_Structure.Stack.Problems.MaximumBinaryTree;
import java.util.*;

public class MBT {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
          return null;
        }
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
      }
      
      private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) {
          return null;
        }
        int maxIdx = getMaxIdx(nums, start, end);
        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = helper(nums, start, maxIdx - 1);
        root.right = helper(nums, maxIdx + 1, end);
        return root;
      }
      
      private int getMaxIdx(int[] nums, int start, int end) {
        int maxVal = Integer.MIN_VALUE;
        int maxIdx = -1;
        while (start <= end) {
          if (nums[start] > maxVal) {
            maxVal = nums[start];
            maxIdx = start;
          }
          start++;
        }
        return maxIdx;
      }
}

// Time Complexity : O(n^2)
// Space Complexity : O(h)