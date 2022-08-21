package Algorithm.Recursion.Leetcode_Problems.MaximumNoofNiceDivisors;

import java.util.*;
import java.math.*;

public class MaximumNoofNiceDivisors {
    static int MOD = (int)(1e9+7);

    public static int maxNiceDivisors(int n) {
        if(n <= 3) return n;
        
        /*
            Approach
            let say
            m = (p1 ^ e1) * (p2 ^ e2) ....  (pn ^ en)
            where p1, p2 ..... pn are primes
            and e1, e2, .. ..en are exponeent (power)
            
            As given n is the prime factor, 
            n will be n = e1 + e2 + e3 .... en
            
            and number of divisor will 
              divisorCount =  e1 * e2 * e3 .... en
            
            
            As in give problem statement, we want maximum divisor count
            so if want max divisor, so must large exponent,
            for largerst exponent, we must have smallest prime number as
            possible as.
            
            
            for this we can use only 2 numbers ,  2 and 3 as prime numbers
            
            we can convert any big number into 2s, 3s power
            
            Algorithm
            1. Keep adding 3s as long as n ≥ 5 and then subtarct 3 
            2. at end it will left, either 0, 2, 4
            3. so multiple the result by remaining n (except 0)
            
        */
        
        
        long divisorCount = 1L;
        int remainder = n % 3;
        
        if(remainder == 0){
            divisorCount = power(3, n / 3);
        
        }else if(remainder == 1) {
            divisorCount = 4 * power(3, (n - 4) / 3); 
        
        }else if(remainder == 2){
            divisorCount = 2 * power(3, n / 3);
        }
        
        return (int) (divisorCount % MOD);
    }
    
    private static long power(long num, long exp){
        if (exp == 1) return num;
        if (exp == 0) return 1;
        
        long k1 = power(num, exp / 2);
        if (exp % 2 == 0) {
            return (k1 * k1) % MOD;
        } else {
            return (k1 * k1 * num) % MOD;
        }
    }




    public static void main(String[] args) {
        int n = 5;
        System.out.println(maxNiceDivisors(n));
    }
}
