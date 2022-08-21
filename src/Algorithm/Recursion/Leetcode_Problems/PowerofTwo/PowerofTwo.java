package Algorithm.Recursion.Leetcode_Problems.PowerofTwo;
import java.util.*;

public class PowerofTwo {

    public static boolean isPowerOfTwo(int n) {

        // This is the recursive approach 
        
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 2 != 0) return false;
        else return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
}
