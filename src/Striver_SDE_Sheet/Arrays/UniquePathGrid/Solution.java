package Striver_SDE_Sheet.Arrays.UniquePathGrid;

class Solution{

	public static void main(String[] args) {
		int m=3;
		int n=7;
		
     int ans=uniquePaths(m, n);  //m x n grid 
     System.out.println(ans);

	}
	//solution
	public static int uniquePaths(int m, int n) {
        int N=n+m-2; // how much steps we need to do
            
        int r=m-1; // number of steps that need to go dow
        double res=1;
         // here we calculate the total possible path number 
            // Combination(N, k) = n! / (k!(n - k)!)
            // reduce the numerator and denominator and get
            // C = ( (n - k + 1) * (n - k + 2) * ... * n ) / k!
        
        for(int i=1;i<=r;i++){
            res=res *(N-r+i)/i;
            
        }
        return (int)res;
    }

}

