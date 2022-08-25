package Data_Structure.BitManipulatio.DivideTwoIntegers;

public class Divide {
    // Notice: the integer division truncates toward zero.
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        } else if (divisor == 1) {
            return dividend;
        }  else if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }else if (divisor < 0) {
                return divide(dividend - divisor, divisor) + 1;
            } else {
                return divide(dividend + divisor, divisor) - 1;
            }
        }

        // Records the supposed sign (positive/negative) of the result.
        int sign = 1;
        if (dividend > 0 && divisor < 0) {
            sign = -1;
        } else if (dividend < 0 && divisor > 0) {
            sign = -1;
        }

        int result = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            result++;
            dividend -= divisor;
        }

        return result * sign;
    }
}

// Time Complexity: O(log^2 n)
// Space Complexity: O(1)