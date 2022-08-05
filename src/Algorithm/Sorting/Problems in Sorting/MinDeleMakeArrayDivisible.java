import java.util.*;
public class MinDeleMakeArrayDivisible {
    static int minOperations(int[] A, int[] numsDivide) {
        int g = numsDivide[0], tmp;
        for (int a : numsDivide) {
            while (a > 0) { // g = gcd(g, a)
                tmp = g % a;
                g = a;
                a = tmp;
            }
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length && A[i] <= g; ++i)
            if (g % A[i] == 0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {2,3,2,4,3};
        int[] num = {9,6,9,3,15};
        System.out.println(minOperations(n, num));
    }
}