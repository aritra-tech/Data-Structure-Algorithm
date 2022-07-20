# [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
## Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if: 
## 1.Open brackets must be closed by the same type of brackets.
## 2.Open brackets must be closed in the correct order.

### Example 1:

***Input***: s = "()"  
***Output***: true

### Example 2:

***Input***: s = "()[]{}"  
***Output***: true

### Example 3:

***Input***: s = "(]"  
***Output***: false


## Solution in Java:
```
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
        
        if(ch=='(' || ch=='[' || ch=='{') st.push(ch);       
        else {
         if(st.isEmpty()) return false;
         if (ch==')' && st.peek()!='(') return false;
         if (ch==']' && st.peek()!='[') return false;
         if (ch=='}' && st.peek()!='{') return false;
        
         st.pop();
         }                
       }
       return st.isEmpty();
    }
    
}
```