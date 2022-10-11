package Striver_SDE_Sheet.Dynamic_Programming.Edit_Distance;

public class editdistance {
    public static void main(String[] args){
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("The minimum number of operations required is: "+ editDistance(word1,word2));
    }
    private static int editDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<=m;j++){
            dp[0][j] = j;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i - 1][j - 1];

                else dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[n][m];
    }
}
