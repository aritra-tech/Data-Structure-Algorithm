import java.io.*;
import java.util.*;

public class Main {
  public static String removeOuterParentheses(String s) {
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
  }

  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    String result = removeOuterParentheses(read.readLine());
    System.out.println(result);
  }
}