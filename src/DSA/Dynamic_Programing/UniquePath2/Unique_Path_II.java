package DSA.Dynamic_Programing.UniquePath2;

import java.util.Arrays;

public class Unique_Path_II {
    public static void main(String[] args){
        int[][] obstacleGrid = {{0,0,0},
                {0,-1,0},
                {0,0,0}};

        int n = obstacleGrid.length;
        int m = obstacleGrid.length;
        System.out.println(uniquePath(n,m,obstacleGrid));
    }

    private static int uniquePath(int n, int m, int[][] obstacleGrid) {
        int dp[][] = new int[n][m];
        for (int row[]: dp){
            Arrays.fill(row,-1);
        }
        return uniquePathsWithObstacles(n-1,m-1,obstacleGrid,dp);
    }

    private static int uniquePathsWithObstacles(int i, int j, int[][] obstacleGrid, int[][] dp) {
        if (i>0 && j>0 && obstacleGrid[i][j]==-1) {
            return 0;
        }
        if (i==0 && j==0){
            return 1;
        }
        if (i<0 || j<0){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int up = uniquePathsWithObstacles(i-1,j,obstacleGrid,dp);
        int left = uniquePathsWithObstacles(i,j-1,obstacleGrid,dp);

        return dp[i][j] = up+left;
    }
}
