package Striver_SDE_Sheet.Arrays.Search_in_2d_Matrix;

public class search_in_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int t = 3;
        System.out.println(searchMatrix(matrix,t));
    }

    public static boolean searchMatrix(int[][] matrix , int t){
        if (matrix.length == 0) return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows*columns-1;
        while (left<=right) {
            int midpoint = left + (right-left) / 2;
            int midpoint_element = matrix[midpoint/columns] [midpoint%columns];
            if (midpoint_element == t) {
                return true;
            } else if (t < midpoint_element) {
                right = midpoint-1;
            } else {
                left = midpoint+1;
            }
        }
        return false;
    }
}
