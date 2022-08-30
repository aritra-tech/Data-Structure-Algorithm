### Link :- [String pattern](https://leetcode.com/problems/implement-strstr/)




### Approach: 

### Using KMP Algorithm
Knuth-Morris and Pratt is  linear time algorithm for the string matching problem.
A matching time of O (n) is achieved by avoiding comparison with an element of 'S' that have previously been involved in comparison with some element of the pattern 'p' to be matched. i.e., backtracking on the string 'S' never occurs

    public int strStr(String str, String pat) {
        if(str.equals("") && pat.equals("")) return 0;
        if(pat.equals("")) return 0;
        int[] reset = new int[pat.length() + 1];
        int i = 0,j = 0;
        kmpPreprocess(reset,pat);
        while(i < str.length()){
            while(j >= 0 && str.charAt(i) != pat.charAt(j)){
                j = reset[j];
            }
            i++;j++;
            if(j == pat.length()) return i - j;
        }
        return -1;
    }
    public void kmpPreprocess(int[]reset,String pat){
        int i = 0,j = -1;
        reset[0] = -1;
        while(i < pat.length()) {
            while(j >= 0 && pat.charAt(i) != pat.charAt(j)) {
                j = reset[j];
            }
            i++; j++;
            reset[i] = j;
        }
    }

   ### Complexity

- Time complexity :- O(n+m) where n=haystack length, m=needle length
- Space complexity :- O(m)