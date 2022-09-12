lass Solution {
    public int tilingRectangle(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j)
                    dp[i][j] = 1;
                else {
                    dp[i][j] = Integer.MAX_VALUE;
                    int rowStart = 1, rowEnd = i / 2;
                    for (int row = rowStart; row <= rowEnd; row++)
                        dp[i][j] = Math.min(dp[i][j], dp[row][j] + dp[i - row][j]);
                    int columnStart = 1, columnEnd = j / 2;
                    for (int column = columnStart; column <= columnEnd; column++)
                        dp[i][j] = Math.min(dp[i][j], dp[i][column] + dp[i][j - column]);
                    for (int row = 1; row <= i; row++) {
                        for (int column = 1; column <= j; column++) {
                            for (int side = Math.min(row, column) - 1; side > 0; side--)
                                dp[i][j] = Math.min(dp[i][j], 1 + dp[row - side][column] + dp[i - row + side][column - side] + dp[i - row][j - column + side] + dp[row][j - column]);
                        }
                    }
                }
            }
        }
        return dp[n][m];
    }
}