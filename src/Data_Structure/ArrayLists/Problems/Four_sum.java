public class Four_sum {
    // Naive recursive function to check if quadruplet exists in an array
    // with the given sum
    public static boolean hasQuadruplet(int[] nums, int n, int target, int count)
    {
        // if the desired sum is reached with 4 elements, return true
        if (target == 0 && count == 4) {
            return true;
        }

        // return false if the sum is not possible with the current configuration
        if (count > 4 || n == 0) {
            return false;
        }

        // Recur with
        // 1. Including the current element
        // 2. Excluding the current element

        return hasQuadruplet(nums, n - 1, target - nums[n - 1], count + 1) ||
                hasQuadruplet(nums, n - 1, target, count);
    }

    public static void main(String[] args)
    {
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 20;

        if (hasQuadruplet(nums, nums.length, target, 0)) {
            System.out.println("Quadruplet exists");
        }
        else {
            System.out.println("Quadruplet Doesn't Exist");
        }
    }
}
