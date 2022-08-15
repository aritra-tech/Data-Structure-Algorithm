package Striver_SDE_Sheet.Array.MajorityElement-1;

class Solution {
    public static void main(String[] args) {
		
		int[] nums= {3,2,3};
		int ans=majorityElement(nums);
		System.out.println(ans); // ans is 3 
		
	}
	
	 // solution 
	
	 public static int majorityElement(int[] nums) {
	       int count=0;
	        int element=0;
	        
	        for(int num:nums){
	            
	            if(count==0){
	                element=num;
	          }
	            if(element==num){
	                count+=1;
	            }
	            else{
	                count-=1;
	            }
	        }
	        return element;
	    }

}