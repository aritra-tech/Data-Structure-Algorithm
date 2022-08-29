### Link :- [Minimum Characters For Palindrome](https://www.codingninjas.com/codestudio/problems/893000?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website)




### Approach: 

### Using LPS Array

LPS = "Longest Proper Prefix which is also Suffix"
LPS[i] = MAXIMUM(j) such that string[0 to j-1] == string[i-j+1 to i]

that is: longest sub-string from index 0 which also, ends at index i.

This simple pattern stored in LPS can be used to accelerate several algorithm and also, enable a linear time string pattern matching algorithm known as KMP algorithm.

The brute force approach to compute values of LPS take O(N2) time. This is an overhead for most algorithms.

-The idea is to find out the largest prefix which is a palindrome. This can be found out in an optimised way by updating the string by concatenating it with a special symbol along with reverse of the string.Now, we will find out the LPS array for the above updated string.

   

    public static int minCharsforPalindrome(String str) {

        public static int minCharsforPalindrome(String str) {

            String revStr = reverse(str);
    
            
            String concat = str + "$" + revStr;
    
            
            int[] lps = calculateLPSArray(concat);
    
            return (str.length() - lps[lps.length - 1]);
    
        }
    
        
        public static int[] calculateLPSArray(String str) {
    
            int n = str.length();
            int[] lps = new int[n];
    
            int len = 0;
    
            
            lps[0] = 0;
    
           
            int i = 1;
            while (i < n) {
    
               
                if (str.charAt(i) == str.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
    
                   
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
    
                        
                        lps[i] = 0;
                        i++;
                    }
                }
            }
    
            return lps;
    
        }
    
        // Function for reverse a string
        public static String reverse(String s) {
    
            int n = s.length();
            StringBuffer sb = new StringBuffer(s);
            for (int i = n - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
    
            return sb.toString();
    
        }

   ### Complexity

- Time complexity :- O(n)
- Space complexity :- O(n)