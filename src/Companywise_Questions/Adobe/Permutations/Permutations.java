package Companywise_Questions.Adobe.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,nums,0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result , int[] nums, int s){
        if(s == nums.length){
            result.add(toList(nums));
        }
        for(int i=s;i<nums.length;i++){
            swap(i,s,nums);
            backtrack(result,nums,s+1);
            swap(i,s,nums);
        }
    }

    public static List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i:nums)
            res.add(i);
        return res;
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
