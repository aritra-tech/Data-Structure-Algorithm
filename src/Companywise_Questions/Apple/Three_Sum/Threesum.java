package Companywise_Questions.Apple.Three_Sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Threesum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new LinkedList();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1;
                int h = nums.length - 1;
                int sum = 0 - nums[i];

                while (l < h) {
                    if (nums[l] + nums[h] == sum) {
                        arr.add(Arrays.asList(nums[i], nums[l], nums[h]));
                        while (l < h && nums[l] == nums[l + 1]) l++;
                        while (l < h && nums[h] == nums[h - 1]) h--;
                        l++;
                        h--;
                    } else if (nums[l] + nums[h] > sum) {
                        h--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return arr;
    }
}

