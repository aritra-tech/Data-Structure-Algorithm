
### Problem Statement :- 
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

### Link :- [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)




### Approach: 

#### Brute Force O(n^2)
we can compute area of every subarray and return the max of them all.
    
1) Brute Force O(n^2)(too slow TLE)
we can compute area of every subarray and return the max of them all.  

### Using left_smaller and right_smaller O(N)(2 pass)
we use two arrays left and right which store the next smaller element to the left and right respectively.
then for every index we calculate area as heights[i] * (right[i] - left[i] + 1)

###  Using only one stack O(N)(1 pass)
same as approach 2 but better space complexity (O(N) space)
  
     static int largestRectangleArea(int histo[]) {
        Stack < Integer > st = new Stack < > ();
        int max_area = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                max_area = Math.max(max_area, width * height);
            }
            st.push(i);
        }
        return max_area;
    }

### complexity 
 -   Time Complexity: O( N ) + O (N)

- Space Complexity: O(N)