package Algorithm.Recursion.Leetcode_Problems.EliminationGame;
import java.util.*;

/**
 * Eleminationgame
 */

 public class Eliminationgame {
    public static int lastRemaining(int n) {
        boolean isLeft = true;
        int remaining = n;
        int start = 1;      //will have our answer
        int jump = 1;
        
        while(remaining > 1){
            if(isLeft || (remaining % 2 != 0)){     // in this case we have to delete our start no.
                start += jump;
            }
            
            remaining = remaining / 2;
            jump = jump * 2;
            isLeft = !isLeft;
        }
        return start;
    }
    public static void main(String[] args) {
        int n = 9;
        int k = lastRemaining(n);
        System.out.println(k);
    }
}
