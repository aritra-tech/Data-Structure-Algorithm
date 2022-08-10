

package Striver_SDE_Sheet.Arrays.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PT {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(
                        (j == 0 || j == i) ? 1 :
                                (result.get(i - 1).get(j - 1) + result.get(i - 1).get(j)));
            }
            result.add(temp);
        }
        return result;
    }
}


