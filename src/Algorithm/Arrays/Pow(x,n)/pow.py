# Problem link: https://leetcode.com/problems/powx-n/

class Solution:
    def myPow(self, x: float, n: int) -> float:
        def recurMe(m,n):
            if n==0:
                return 1
            if n==1:
                return m
            else:
                temp=recurMe(m,n//2)
                if n%2!=0:
                    return temp*temp*m
                else:
                    return temp*temp
        if n<0:
            return (1/recurMe(x,abs(n)))
        return recurMe(x,abs(n))