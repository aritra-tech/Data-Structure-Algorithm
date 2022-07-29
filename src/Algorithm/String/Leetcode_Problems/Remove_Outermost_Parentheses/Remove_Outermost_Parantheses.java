package Algorithm.String.Leetcode_Problems.Remove_Outermost_Parentheses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Remove_Outermost_Parantheses {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = removeOuterParentheses(read.readLine());
        System.out.println(result);
    }
  public static String removeOuterParentheses(String S) {
      char[] arr = S.toCharArray();
      int s = 0;
      List<Integer> indexs = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == '(') {
              s++;
          } else if (arr[i] == ')') {
              s--;
          }
          if (indexs.size() % 2 == 0 && s == 1) {
              indexs.add(i + 1);
          } else if (indexs.size() % 2 != 0 && s == 0) {
              indexs.add(i);
          }
      }
      String res = "";
      for (int i = 0; i < indexs.size(); i += 2) {
          res += S.substring(indexs.get(i), indexs.get(i + 1));
      }
      return res;
    }
  }
