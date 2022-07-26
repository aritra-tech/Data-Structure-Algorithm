
package Algorithm.Arrays.LeetcodeProblems.TwoSum;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr= {2,7,11,15};
		int target=9;
		int[] ans=twosum(arr, target);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] twosum(int[] arr, int target) {
		
		 Arrays.sort(arr);
	        int[] ans=new int[2];
	        int start=0;
	        int high=arr.length-1;
	        
	       while(start<high){
	           
	           if(arr[start]+arr[high]>target){
	               high--;
	              
	           }
	           else if(arr[start]+arr[high]<target){
	              start++;
	            
	           }
	           else{
	               ans[0]=start;
	               ans[1]=high;
	               break;
	           }
	           
	       }
	        return ans;
	}

}
