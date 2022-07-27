package Algorithm.Arrays.LeetcodeProblems.HowManyNumbersAreSmallerThantheCurrentNumber;

import java.util.Arrays;
public class samllernumber
{
	public static void main(String[] args) {
	    int[] nums={8,1,2,2,3};
		System.out.println (Arrays.toString(smallerNumbersThanCurrent(nums)));
	}
	static int[] smallerNumbersThanCurrent(int[] nums) {
	    int[] ans=new int[nums.length];
        int x;
       for (int i = 0; i < nums.length; i++) {
           x=0;
           for (int j = 0; j < nums.length; j++) {

               if(j != i && nums[j] < nums[i]){
                   x++;
               }
               ans[i]=x;

           }
       }
       return ans;     
    }
}

