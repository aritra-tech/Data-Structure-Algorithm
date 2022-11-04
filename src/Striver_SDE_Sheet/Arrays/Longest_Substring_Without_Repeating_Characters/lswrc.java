package Striver_SDE_Sheet.Arrays.Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class lswrc {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        int p1 = 0;
        int p2 = 0;
        int max = 0;

        HashSet<Character> set = new HashSet();

        while(p2 < s.length()){
            if(!set.contains(s.charAt(p2))){
                set.add(s.charAt(p2));
                p2++;
                max = Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(p1));
                p1++;
            }
        }
        return max;
    }
}
