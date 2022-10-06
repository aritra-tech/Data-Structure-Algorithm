package Companywise_Questions.Google.Evaluate_Reverse_Polish_Notation;

public class Evaluate_Reverse_Polish_Notation {

        public int evalRPN(String[] tokens) {
                 Stack<Integer> numStack = new Stack<Integer>();
                 for(String str : tokens){
                     if(isNumber(str)){ 
                         numStack.push(Integer.valueOf(str));///add to stack 
                         continue;
                     }
                     int num2 = numStack.pop();
                     int num1 = numStack.pop();
                     numStack.push(operate(num1, num2, str)); ///push result back
                 }
                 return numStack.peek();
             }
             
             private boolean isNumber(String str){
                 char[] chs = str.toCharArray();
                 if(chs[0]=='-'&&chs.length>1){
                     return isNumber(str.substring(1, chs.length));
                 }
                 for(char ch:chs){
                     if(!Character.isDigit(ch)) return false;
                 }
                 return true;
             }
             private int operate(int d1,int d2,String op){
                 char operate = op.charAt(0);
                 switch(operate){
                     case '+':
                         return d1+d2;
                     case '-':
                         return d1-d2;
                     case '/':
                         return d1/d2;
                     case '*':
                         return d1*d2;
                     default:
                         return Integer.MIN_VALUE;
                 }
             }
}
