/* Approach

1. Look at the given statements in the question and then approach to the solution part.
2. We are given with an array nums with n objects.
3. They are colored red, white, or blue.
4. We have to now sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
5. Remember that we have to use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
6. Solve the problem without using the library's sort function.
7. Look up at the given constraints n == nums.length and 1 <= n <= 300 and nums[i] is either 0, 1, or 2.
8. Finally return the nums and print the array.

*/

package Striver_SDE_Sheet.Arrays.Sort_Colors;

public class SC {
    public void sortColors(int[] nums) {

        int zero = -1;          // [0...zero] == 0
        int two = nums.length;  // [two...n-1] == 2
        for(int i = 0 ; i < two ; ){
            if(nums[i] == 1)
                i ++;
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else{ // nums[i] == 0
                assert nums[i] == 0;
                swap(nums, ++zero, i++);
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }

    public static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 2, 1, 1, 0};
        (new Solution2()).sortColors(nums);
        printArr(nums);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)