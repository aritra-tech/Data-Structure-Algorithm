package Algorithm.Arrays.LeetcodeProblems.Flipping_of_Image;
import java.util.*;

public class Flipping {
    public int[][] flipAndInvertImage(int[][] image) {
        int numRows = image.length;
        int numCols = image[0].length - 1;
        for (int rowIdx = 0; rowIdx < numRows; rowIdx++) {
          int startIdx = 0;
          int endIdx = numCols;
          while (startIdx <= endIdx) {
            int temp = image[rowIdx][startIdx];
            image[rowIdx][startIdx++] = image[rowIdx][endIdx] == 1 ? 0 : 1;
            image[rowIdx][endIdx--] = temp == 1 ? 0 : 1;
          }
        }
        return image;
      }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)  
