 package Algorithm.Arrays.LeetcodeProblems.Kadane'sAlgorithm;

public class solution {

	public static void main(String[] args) {
		
			int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
			
			int ans= maxSubArray( arr);
			System.out.println(ans);
			}
	  // max subarray solution 
	public static int maxSubArray(int[] nums) {
        int currsum=Integer.MIN_VALUE;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(currsum>0){
               currsum+=nums[i]; 
            }
            else{
                currsum=nums[i];
            }
        
        if(currsum>maxsum){
            maxsum=currsum;
        }
        }
        return maxsum;
		   

	}
}


