package Striver_SDE_Sheet.Dynamic_Programming.Minimum_Path_Sum;

public class Min_Path_Sum {
    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }

    private static int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;

        int[][] memo = new int[m+1][n+1];

        return find(grid, m, n, memo);
    }
    public static int find(int grid[][], int m, int n, int[][] memo)
    {
        if(m==0 && n==0)
            return grid[0][0];

        else if(m<0 || n<0)
            return Integer.MAX_VALUE;

        else if(memo[m][n]!=0)
            return memo[m][n];
        else
            return memo[m][n] =  grid[m][n] + Math.min(find(grid, m-1, n, memo),find(grid, m, n-1, memo));
    }
}
