package Companywise_Questions.Facebook.Valid_PalindromeII;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "aba";
        System.out.println(validpalindrome(s));
    }

    private static boolean validpalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
