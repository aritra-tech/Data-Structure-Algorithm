package Data_Structure.Stack.CelebrityProblem;


import java.util.*;

public class CelebrityProblem {

	public static void main(String[] args) {
		
		int[][] m= {{0, 1 ,0},
		         {0 ,0 ,0}, 
		         {0, 1 ,0}};
		int n=m.length;
		int ans=celebrity(m, n);
		System.out.println(ans);
	}
	 public static int celebrity(int m[][], int n) {
		 Stack<Integer> st=new Stack<Integer>();
			for(int i=0;i<n;i++){
	    	    st.push(i);
	    	}
	    	while(st.size()>1){
	    	    int i=st.pop();
	    	    int j=st.pop();
	    	    if(m[i][j]==1){
	    	        st.push(j);
	    	    }
	    	    else st.push(i);
	    	}
		 int ans=st.pop();
		 for(int i=0;i<n;i++) {
			 if(i!=ans) {
				 if(m[ans][i]==1||m[i][ans]==0){
					 return -1;
				 }
			 } 
		 }
		 return ans;
	 }
}
