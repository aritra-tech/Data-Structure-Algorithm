package Striver_SDE_Sheet.Arrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(nums, tar)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
