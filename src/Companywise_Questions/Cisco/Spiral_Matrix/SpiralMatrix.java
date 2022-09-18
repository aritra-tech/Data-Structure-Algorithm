package Companywise_Questions.Cisco.Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}
                ,{4,5,6},
                {7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();

        if(matrix.length == 0) return result;

        int rowbegin = 0;
        int rowend = matrix.length-1;
        int columnbegin = 0;
        int columnend = matrix[0].length-1;

        while(rowbegin <= rowend && columnbegin <= columnend){

            for(int i=columnbegin; i<=columnend; i++)
                result.add(matrix[rowbegin][i]);

            rowbegin++;

            for(int i=rowbegin;i<=rowend;i++)
                result.add(matrix[i][columnend]);

            columnend--;

            if(rowbegin <= rowend){
                for(int i=columnend;i>=columnbegin;i--)
                    result.add(matrix[rowend][i]);
            }
            rowend--;

            if(columnbegin <= columnend){
                for(int i=rowend;i>=rowbegin;i--)
                    result.add(matrix[i][columnbegin]);
            }
            columnbegin++;
        }
        return result;
    }
}
