package Companywise_Questions.Goldman_Sachs.Trapping_Rain_Water;

public class TrappingRainWater {
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int length=height.length;
        int answer=0;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0]=height[0];
        for(int i=1;i<length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[length-1]=height[length-1];
        for(int i=length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<length;i++){
            answer+=(Math.min(left[i],right[i])-height[i]);
        }
        return answer;
    }
}
