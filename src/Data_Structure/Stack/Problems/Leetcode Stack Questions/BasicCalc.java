import java.util.*;

public class BasicCalc {
    public static int calculate(String s) {
        Stack<Object> evaluation = new Stack<>();
        int number = 0;
        int n=0;//represents the power of 10, for forming the number
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                number = (int)Math.pow(10,n)*(int)(ch-'0') + number;
                n++;
            }else if(ch!=' '){
                if(n!=0){//To see if there is a number formed
                    evaluation.push(number);
                    n=0; //Putting it to original state, so that new numbers could be formed;
                    number=0;//Putting it to original state, so that new numbers could be formed;
                }
                
                if(ch == '('){
                    int res = evaluateExprsn(evaluation);
                    evaluation.pop(); // to pop the ')' for the evaulation and complete the bracket evaluation 
                    evaluation.push(res);
                }else{
                    evaluation.push(ch);
                }
            }
        }
        
        if(n!=0){
            evaluation.push(number);
        }
        
        return evaluateExprsn(evaluation);
    }
    
    public static int evaluateExprsn(Stack evaluation){
        if(!(evaluation.peek() instanceof Integer)){
           evaluation.push(0); // To account for negative numbers
        }
        
        int res=(int)evaluation.pop();
        
        while((!evaluation.isEmpty()) && !((char)evaluation.peek() == ')')){
                char sign = (char)evaluation.pop();
                
                if(sign == '+'){
                    res = res + (int)evaluation.pop();
                }else{
                    res = res - (int)evaluation.pop();
                }
            }
            return res;
        }

    public static void main(String[] args) {
        String st = "1 + 1";
        System.out.println(calculate(st));
    }
}
