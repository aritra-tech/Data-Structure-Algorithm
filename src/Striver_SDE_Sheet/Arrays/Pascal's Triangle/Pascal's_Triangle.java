/* Approach

1. Look at the given statements in the question and then approach to the part of the solution.
2. We are given an integer numRows.
3. We know that each number is the sum of the two numbers directly above.
4. Look the constraints 1 <= numRows <= 30.
5. Now return the first numRows of Pascal's triangle.

*/

package Striver_SDE_Sheet.Arrays.Pascal_Triangle;

public class PT {
    public List<List<Integer>> generate(int numRows) {
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

// Time Complexity: O(n^2)
// Space Complexity: O(1)
