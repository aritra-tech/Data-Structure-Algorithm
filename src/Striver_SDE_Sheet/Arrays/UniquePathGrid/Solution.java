package Striver_SDE_Sheet.Array.UniquePathGrid;

class Solution{

	public static void main(String[] args) {
		int m=3;
		int n=7;
		
     int ans=uniquePaths(m, n);  //m x n grid 
     System.out.println(ans);

	}
	//solution
	public static int uniquePaths(int m, int n) {
        int N=n+m-2;
        int r=m-1;
        double res=1;
        
        for(int i=1;i<=r;i++){
            res=res *(N-r+i)/i;
            
        }
        return (int)res;
    }

}

