## Problem Link:
[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

## Approach:
* Our outter loop will represent our length - 1, len.
* Our inner loop will represent our left pointer, i.
* Therefore, our right pointer will be represented by i+len. This makes our logic a bit easier:

**Our base cases are when len is 0 or 1 (i.e. when the length of the substring is of length 1 or 2). In these situations, DP won't work. Thankfully, all we need to check for is whether s.charAt(i) == s.charAt(i + len).**
      
**For len > 1, we would also need to check whether the inner substring is a palindrome as illustrated above. Therefore, we'll also check if dp[i+1][i+len-1] is true.**
  
* There are a few ways we could keep track of our longest substring. We could just assign a new substring whenever our current window length is greater than the current string
's length. However, assigning a new substring on each update takes O(n) time at worst. Therefore, we'll just keep track of the indices of our longest substring using start 
and end and we'll only convert this into a substring at the end.

## Time Complexity: O(n^2)
## Space Complexity: O(n^2)


## Better Approach:

```
public String longestPalindrome(String s) {
        
        if(s == null || s.length() < 1){
            return "";
        }
        
        int start = 0;
        int end = 0;
        
        for(int i=0; i< s.length(); i++){
            
            int l1 = middle(s,i,i);
            int l2 = middle(s,i,i+1);
            
            int l = Math.max(l1,l2);
            
            if(l> end-start){
                
                start = i - ((l - 1) / 2);
                end = i + (l/2);
            }
        }
        
        return s.substring(start,end+1);
        
    }
    
    public int middle(String s, int left, int right){
        
        if(s == null){
            return 0;
        }
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            
            left--;
            right++;
        }
        
        return right-left-1;
    }public String longestPalindrome(String s) {
        
        if(s == null || s.length() < 1){
            return "";
        }
        
        int start = 0;
        int end = 0;
        
        for(int i=0; i< s.length(); i++){
            
            int l1 = middle(s,i,i);
            int l2 = middle(s,i,i+1);
            
            int l = Math.max(l1,l2);
            
            if(l> end-start){
                
                start = i - ((l - 1) / 2);
                end = i + (l/2);
            }
        }
        
        return s.substring(start,end+1);
        
    }
    
    public int middle(String s, int left, int right){
        
        if(s == null){
            return 0;
        }
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            
            left--;
            right++;
        }
        
        return right-left-1;
    }
```

## Time Complexity: O(n^2)
## Space Complexity: O(1)