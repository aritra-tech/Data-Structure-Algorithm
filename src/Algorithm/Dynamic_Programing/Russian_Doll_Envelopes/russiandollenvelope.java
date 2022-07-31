package Algorithm.Dynamic_Programing.Russian_Doll_Envelopes;

import java.util.Arrays;

public class russiandollenvelope {
    public static void main(String[] args){
        int[][] envelopes = {{5,4},
                {6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(envelopes));
    }
    public static int maxEnvelopes(int[][] E) {
        Arrays.sort(E, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[E.length];
        int ans = 0;
        for (int[] env : E) {
            int height = env[1];
            int left = Arrays.binarySearch(dp, 0, ans, height);
            if (left < 0) left = -left - 1;
            if (left == ans) ans++;
            dp[left] = height;
        }
        return ans;
    }
}
