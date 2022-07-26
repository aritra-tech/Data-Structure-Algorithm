
package Algorithm.Arrays.LeetcodeProblems.FourSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {

    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set= new HashSet<List<Integer>>();
        List <List<Integer>> ans=new ArrayList<List<Integer>>();
        
        if(nums.length<4||nums==null){
            return ans;
        }
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int start=j+1;
                int end=n-1;
                
                while(start<end){
                  long sum=(long)nums[i]+(long)nums[j]+(long)nums[start]+(long)nums[end];
                        if(sum==target){
                           
                            List<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[start]);
                            temp.add(nums[end]);
                            
                            if(!set.contains(temp)){
                                set.add(temp);
                                ans.add(temp);
                                
                            }
                            start++;
                            end--;
                        }
                        else if(sum<target){ start++;
                                           }
                    else{ end--;
                        }
                }
            }
        }
        return ans;
    }
}