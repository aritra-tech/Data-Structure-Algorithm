/**
 * ValidParenthese
 */
import java.util.*;
public class ValidParenthese {

    static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() && (ch==')'||ch=='}'||ch==']')){
                return false;
            }
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.peek()!='('){
                    return false;
                }
                else{
                st.pop();
            }
            }
            else if(ch=='}'){
                if(st.peek()!='{'){
                   return false;
                }
                else{
                st.pop();
            }
            }
            else if(ch==']'){
                if(st.peek()!='['){
                   return false;
                }
                else{
                st.pop();
            }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String st = "()";
        System.out.println(isValid(st));

    }

}