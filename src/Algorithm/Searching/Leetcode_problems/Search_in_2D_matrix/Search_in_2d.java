package Algorithm.Searching.Leetcode_problems.Search_in_2D_matrix;

public class Search_in_2d {

    public static void main(String[] args){

        int[][] matrix = { {1,3,5,7},
                            {10,11,16,20},
                            {23,30,34,60}};

        int target = 3;
        if (searchMatrix(matrix, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows*columns-1;
        while (left<=right) {
            int midpoint = left + (right-left) / 2;
            int midpoint_element = matrix[midpoint/columns] [midpoint%columns];
            if (midpoint_element == target) {
                return true;
            } else if (target < midpoint_element) {
                right = midpoint-1;
            } else if (target > midpoint_element) {
                left = midpoint+1;
            }
        }
        return false;
    }
}
