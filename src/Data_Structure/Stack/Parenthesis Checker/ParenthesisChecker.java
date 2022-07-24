package Data_Structure.Stack.ParenthesisChecker;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		String s="[(])";
		boolean ans=ispar(s);
		System.out.println(ans);

	}

	private static boolean ispar(String s) {
		int n = s.length();
	       
	       if( n == 0 ) return false;
	       
	       Stack<Character> st = new Stack<>();
	       
	       for(int i = 0 ; i < n ; i++)
	       {
	           char temp = s.charAt(i);
	           
	           if( temp == '{' || temp == '(' || temp == '[')
	               st.push(temp);
	               
	           else
	           {
	               if(st.isEmpty()) return false;
	               
	               char k = st.peek();
	               
	               if( temp == '}' && k != '{' || temp == ')' && k != '(' || temp == ']' && k != '[')
	                   return false;
	               
	               else st.pop();    }
	 
	       }
	       
	       return st.isEmpty();
		
	
	}

}
