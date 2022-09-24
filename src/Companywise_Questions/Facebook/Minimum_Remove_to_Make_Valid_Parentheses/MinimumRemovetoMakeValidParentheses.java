package Companywise_Questions.Facebook.Minimum_Remove_to_Make_Valid_Parentheses;

import java.util.HashSet;
import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args){
        String st = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(st));
    }

    private static String minRemoveToMakeValid(String st) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<st.length();i++) {
            char ch = st.charAt(i);
            if(Character.isAlphabetic(ch))
                continue;
            if(ch == '(')
                stack.push(i);
            else {
                if(!stack.isEmpty() && st.charAt(stack.peek()) == '(')
                    stack.pop();
                else stack.push(i);
            }
        }

        // if(stack.size() == 0) return "";

        StringBuilder result = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for(int i=0;i<st.length();i++)
            if(!set.contains(i))
                result.append(st.charAt(i));

        return result.toString();
    }
}
