package Data_Structure.Stack.EvaluationOfPostfixExpression.PostfixExpression;

import java.util.*;

public class PostfixExpression {

	public static void main(String[] args) {
		String s="231*+9-";
		int ans=evaluatePostFix( s);
    System.out.println(ans);
	}

	private static int evaluatePostFix(String s) {
		Stack<Integer> st =new Stack<>();
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>='0'&& ch<='9') {
				st.push(ch-'0');
			}
			else {
				
					int top1=st.pop();
					int top2=st.pop();
					 if(ch=='+') st.push( top2+top1);
					 else if (ch=='*') st.push(top2*top1);
					 else if(ch=='-') st.push(top2-top1);
					 else if(ch=='/')st.push(top2/top1);
				
			}
		}
		
		return st.pop();
	}

}
