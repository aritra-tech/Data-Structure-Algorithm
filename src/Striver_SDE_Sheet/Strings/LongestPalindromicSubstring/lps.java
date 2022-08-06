package Striver_SDE_Sheet.Strings.LongestPalindromicSubstring;

public class lps {
    public static void main(String[] args){
        String s = "babad";
        longestPalindrome(s);
    }

    private static String longestPalindrome(String s) {

        int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len=0; len<n; len++) {
            for (int i=0; i+len<n; i++) {
                dp[i][i+len] = s.charAt(i) == s.charAt(i+len) && (len < 2 || dp[i+1][i+len-1]);
                if (dp[i][i+len] && len > end - start) {
                    start = i;
                    end = i + len;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
