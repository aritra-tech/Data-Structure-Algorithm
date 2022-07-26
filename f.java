public class Main
{
	public static void main(String[] args) {
	    int[] nums={1,2,3,1,1,3};
		System.out.print(numIdenticalPairs(nums));
	}
	static int numIdenticalPairs(int[] nums) {
        int x=0;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                   x++; 
                }
            }
        }
        return x;
    }
}
