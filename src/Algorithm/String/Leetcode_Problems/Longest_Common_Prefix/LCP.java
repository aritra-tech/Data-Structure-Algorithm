package Algorithm.String.Leetcode_Problems.Longest_Common_Prefix;

import java.util.Scanner;

public class LCP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strs = {"flower","flow","flight"};
        System.out.println( "The longest Common Prefix is : " +
                LCP.longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
