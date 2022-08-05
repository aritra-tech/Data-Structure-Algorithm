

package Data_Structure.Matrix.LeetCodeProblems.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] A) {
        List<Integer> ans = new ArrayList<>();
        int Top = 0, Bottom = A.length-1, i;
        int Left = 0, Right = A[0].length-1, dir = 0;

        while(Top<=Bottom && Left<=Right) {
            if(dir==0) {    //Left to Right
                for(i=Left;i<=Right;i++)
                    ans.add(A[Top][i]);
                Top++;
            } else if(dir==1) {     //Top to Bottom
                for(i=Top;i<=Bottom;i++)
                    ans.add(A[i][Right]);
                Right--;
            } else if(dir==2) {     //Right to Left
                for(i=Right;i>=Left;i--)
                    ans.add(A[Bottom][i]);
                Bottom--;
            } else if(dir==3) {     //Bottom to Top
                for(i=Bottom;i>=Top;i--)
                    ans.add(A[i][Left]);
                Left++;
            }
            dir=(dir+1)%4;  //dir will not exceed 3
        }
        return ans;
    }
}
