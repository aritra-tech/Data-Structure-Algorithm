import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
  public static int removePalindromeSub(String s) {
        if(s.isEmpty())
            return 0;
        
        // check if palindrome
        boolean isPalin = true;
        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                isPalin = false;
        
        if(isPalin == true)
            return 1;
        else
            return 2;
    }
    
  public static void main (String[] args) throws java.lang.Exception
  {
    System.out.print(removePalindromeSub("abb"));
  }
}