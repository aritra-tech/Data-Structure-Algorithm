package Data_Structure.Stack.Problems.MinimumAddtoMakeParenthesesValid;

public class MinimumAdd {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
          if (c == '(') {
            stack.push(c);
          } else {
            if (stack.isEmpty()) {
              count++;
            } else {
              stack.pop();
            }
          }
        }
        return count + stack.size();
      }
}

// Time Complexity : O(n)
// Space Complexity : O(1)

