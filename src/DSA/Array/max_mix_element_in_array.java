package DSA.Array;

public class max_mix_element_in_array {
    public static void main(String[] args)
    {
        int[] nums = { 5, 7, 2, 4, 9, 6 };

        // find the minimum and maximum element, respectively
        findMinAndMax(nums);
    }

    private static void findMinAndMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        // do for each array element
        for (int i = 1; i < nums.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (nums[i] > max) {
                max = nums[i];
            }

            // if the current element is smaller than the minimum found so far
            else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
}
