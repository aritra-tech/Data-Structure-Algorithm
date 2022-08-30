package Striver_SDE_Sheet.Strings.MinimumCharacterForPalindrome;

public class solution{
    public static void main(String[] args) {
        String str="abcd";
        
    int  ans= minCharsforPalindrome(str);
       System.out.println(ans);
    }
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
    
   
}