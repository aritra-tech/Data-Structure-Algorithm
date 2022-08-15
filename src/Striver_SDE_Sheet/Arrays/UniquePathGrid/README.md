
## Problem Statement - 
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner 
### Link :- [Unique Paths](https://leetcode.com/problems/unique-paths/)




### Approach: 

### Using Dynamic Programming
  The approach that has been explained above under the recursive solution can be easily memorized. Since the recursive function is dependent on two variables which are row, and column. Thus we create 2D DP array and store the result of each state. This will dramatically improve the time complexity because we are not resolving the same problems
  
   ### Complexity
  - Time Complexity: O(N*M)

  - Space Complexity: O(N*M)

  ### Optimal Approach  

  ## Combinatorics Solution

  First of all you should understand that we need to do n + m - 2 movements : m - 1 down, n - 1 right, because we start from cell (1, 1).
Secondly, the path it is the sequence of movements( go down / go right), therefore we can say that two paths are different when there is i-th (1 .. m + n - 2) movement in path1 differ i-th movement in path2.
So, how we can build paths. Let's choose (n - 1) movements(number of steps to the right) from (m + n - 2), and rest (m - 1) is (number of steps down).
I think now it is obvious that count of different paths are all combinations (n - 1) movements from (m + n-2).
    
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

 ### Complexity
  - Time Complexity: O(N-1)

 - Space Complexity: O(1)