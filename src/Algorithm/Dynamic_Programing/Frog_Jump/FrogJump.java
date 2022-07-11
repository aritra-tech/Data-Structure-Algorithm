package Algorithm.Dynamic_Programing.Frog_Jump;

public class FrogJump {
    public static void main(String[] args){
        int[] height = {30,10,60,10,60,50};
        int n = height.length;
        int prev1=0 , prev2=0;
        for(int i=1;i<n;i++){
            int jumptwo = Integer.MAX_VALUE;
            int jumpone = prev1 + Math.abs(height[i] - height[i-1]);
            if(i>1){
                jumptwo = prev2 + Math.abs(height[i] - height[i-2]);
            }
            int curr = Math.min(jumpone,jumptwo);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
