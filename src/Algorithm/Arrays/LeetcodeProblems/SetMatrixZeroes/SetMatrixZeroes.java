package Algorithm.Arrays.LeetcodeProblems.SetMatrixZeroes;

public class SetMatrixZeroes {
    private static void setZeroes(int[][] matrix, int n, int m) {
        int answer[][] = new int[n][m];
        // Set all elements of answer array as 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = 1;
            }
        }
        // Traverse row wise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Set this row as zero in answer array
                    for (int k = 0; k < m; k++) {
                        answer[i][k] = 0;
                    }
                    break;
                }
            }
        }
        // Traverse column wise
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 0) {
                    // Set this column as 0 in answer array
                    for (int k = 0; k < n; k++) {
                        answer[k][j] = 0;
                    }
                }
            }
        }
        // Update the elements in matrix array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (answer[i][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Example 1
        int[][] matrix = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = matrix.length;
        int m = matrix[0].length;
        setZeroes(matrix, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Example 2
        matrix = new int[][] {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        n = matrix.length;
        m = matrix[0].length;

        setZeroes(matrix, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
