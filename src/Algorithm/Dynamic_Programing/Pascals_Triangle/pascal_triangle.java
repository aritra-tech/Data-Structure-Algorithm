package Algorithm.Dynamic_Programing.Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static void main(String[] args){
        int numRows = 5;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> pre=null;
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
}
