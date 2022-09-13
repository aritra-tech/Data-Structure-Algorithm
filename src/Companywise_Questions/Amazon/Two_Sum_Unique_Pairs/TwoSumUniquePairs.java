package Companywise_Questions.Amazon.Two_Sum_Unique_Pairs;

import java.util.*;

public class TwoSumUniquePairs {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 45, 46, 46};
        int target = 47;
        System.out.println(getUniquePairs(nums,target));   // O(nlogn)
        System.out.println(getUniquePairs1(nums,target));   // O(n)
    }

    private static int getUniquePairs1(int[] nums, int target) {
        Set<Integer> seen =  new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums){
            if (map.containsKey(num)){
                int key = map.get(num)*10 + num;
                if (! seen.contains(key)){
                    ans++;
                    seen.add(key);
                }
            } else {
                map.put(target-num, num);
            }
        }
        return ans;
    }
    private static int getUniquePairs(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int ans = 0;
        while (i < j){
            int sum = nums[i]+ nums[j];
            if (sum < target){
                i++;
            } else if (sum > target){
                j--;
            } else {
                ans++;
                i++;
                j--;
                while (i < j && nums[i] == nums[i-1]){
                    i++;
                }
                while (i < j && nums[j] == nums[j+1]){
                    j--;
                }
            }
        }
        return ans;
    }
}
