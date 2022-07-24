
package Algorithm.Arrays.LeetcodeProblems.NextPermutation;


import java.util.Arrays;

public class Solution {
   
	public static void main (String[] args) {
		int[] arr= {1,1,5};
		nextpermutation(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	          public static void nextpermutation(int[] nums) {
			
		        int p=-1;
		        if(nums==null || nums.length<=1)return;
		       for(int i=nums.length-1;i>0;i--){
		           if(nums[i]>nums[i-1]) {
		               p=i-1;
		               break;
		           }  
		             }  
		        if(p==-1){
		            reverse(nums,0,nums.length-1);
		            return;
		        }
		        int q=nums.length-1;
		        for(int i=nums.length-1;i>=p+1;i--){
		            if(nums[i]>nums[p]){
		                q=i;
		                break;
		            }
		        }
		        swap(nums,p,q);
		        reverse(nums, p + 1, nums.length - 1);
		       }


		    
		    public static  void  swap(int[] nums, int i, int j){
		        int temp=nums[i];
		        nums[i]=nums[j];
		        nums[j]=temp;
		        
		    }
		     public static void  reverse(int[] nums, int i, int j){
		        while(i<j){
		            swap(nums,i,j);
		            i++;
		            j--;
		        }
		     }
		     }
		     
		    


