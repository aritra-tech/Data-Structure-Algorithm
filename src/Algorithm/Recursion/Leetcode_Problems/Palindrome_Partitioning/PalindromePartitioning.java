package Algorithm.Recursion.Leetcode_Problems.Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> now = new ArrayList<>();
        helper(0, s, now, ans);
        return ans;
    }
    public void helper(int index, String s, List<String> curr, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                curr.add(s.substring(index, i + 1));
                helper(i + 1, s, curr, ans);
                curr.remove(curr.size() - 1); 
            }
        }
    } 
    public boolean isPalindrome(String s, int l, int r){ 
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}

// Time Complexity: O(N*2^N) 
// Space Complexity: O(N)