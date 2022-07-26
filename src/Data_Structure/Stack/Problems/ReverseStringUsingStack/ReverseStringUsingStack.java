package Data_Structure.Stack.Problems.ReverseStringUsingStack;

import java.util.*;
public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String s="GeeksforGeeks";
		 String  rev=reverse(s);
		 System.out.println(rev);
	}

	private static String reverse(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			st.push(ch);
			}
		String revString="";
		while(!st.isEmpty()) {
			revString+=st.pop();
		}
		
		return revString;
	}

}
