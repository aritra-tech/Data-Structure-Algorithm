package Algorithm.Arrays.JumpGame;

public class Jump_Game_II {
    public static void main(String[] args) {
        int[] nums = { 2,3,1,1,4 };
        jump(nums);
        System.out.print(" The minimum number of jumps to reach the last index is " + jump(nums));
    }

    private static int jump(int[] nums) {
        int j=0,l=0,r=0;
        for(int i=0;i<nums.length-1;i++){
            r = Math.max(r,i+nums[i]);
            if(i==l){
                j++;
                l=r;
            }
        }
        return j;
    }
}
