/* Approach

1. We are given an array of integers nums.
2. Find the next permutation of nums.
3. First look at the given statements and then approach to the part of the solution.
4. Look that the next permutation of an array of integers is the next lexicographically greater permutation of its integer.
5. Look if all the permutations of the array are sorted in one container.
6. The next permutation of that array is the permutation that follows it in the sorted container.
7. The replacement must be in place and use only constant extra memory.

*/

package Striver_SDE_Sheet.Arrays.Next_Permutation;

public class NP {
    public void nextPermutation(int[] nums) {
        int idx = nums.length - 2;
        while (idx >= 0 && nums[idx + 1] <= nums[idx]) {
          idx--;
        }
        if (idx >= 0) {
          int endIdx = nums.length - 1;
          while (nums[endIdx] <= nums[idx]) {
            endIdx--;
          }
          swap(nums, idx, endIdx);
        }
        reverse(nums, idx + 1);
      }
      
      private void reverse(int[] nums, int startIdx) {
        int endIdx = nums.length - 1;
        while (startIdx < endIdx) {
          swap(nums, startIdx, endIdx);
          startIdx++;
          endIdx--;
        }
      }
      
      private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }

// Time Complexity: O(nlogn)
// Space Complexity: O(logn)

