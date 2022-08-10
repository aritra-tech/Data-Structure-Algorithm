package Algorithm.Dynamic_Programing.Unique_Paths;

public class Unique_Paths {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }
        return grid[m - 1][n - 1];
    }
}
