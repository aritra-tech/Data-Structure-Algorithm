/*
    Problem Link: https://leetcode.com/problems/powx-n/
    Implement pow(x, n), which calculates x raised to the power n
    Ex. x = 2 n = 10 -> 1024, x = 2.1 n = 3 -> 9.261, x = 2 n = -2 -> 0.25

    Divide-and-conquer, even x^n = A * A, odd x^n = A * A * x

    Time: O(log n)
    Space: O(1) (if we use a global variable to store the result)
*/

class Solution {
    private:
    double power(double x, int n){
        if(n == 0){
            return 1;
        }
        double ans = power(x,n/2);
        if(n%2 == 0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
public:
    double myPow(double x, int n) {
        if(n<0)
            return (1/power(x,n));
        else
            return  power(x,n);
    }
};