
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

// Rabin-Karp Approach

class Solution {
public:
    int power(int x, unsigned int y, unsigned int m){ 
        if (y == 0) 
            return 1; 
        long long p = power(x, y/2, m) % m; 
        p = (p * p) % m; 

        return (y%2 == 0)? p : (x * p) % m; 
    };

    // Function to return gcd of a and b 
    int gcd(int a, int b){ 
        if (a == 0) 
            return b; 
        return gcd(b%a, a); 
    };

    int modInverse(int a, int m){ 
        int g = gcd(a, m); 
        if (g != 1){
            return -1;
        }else{ 
            return power(a, m-2, m);
        } 
    };
    
    bool check(int index, string A, string B){
        for(int i = 0; i < B.size(); i++) {
            if(A[(i+index) % A.size()] != B[i]){
                return false;
            }
        }
        return true;
    }
    int repeatedStringMatch(string A, string B) {
        int q = (B.size() - 1)/A.size() + 1;
        int p = 113, MOD = 1000000007;
        int pInv = modInverse(p, MOD);
        
        long long bHash = 0, power = 1;
        for(int i = 0; i < B.size(); i++){
            bHash += power * int(B[i]);
            bHash %= MOD;
            power = (power * p) % MOD;
        }
        
        long long aHash = 0;
        power = 1;
        for(int i = 0; i < B.size(); i++){
            aHash += power * int(A[i % A.size()]);
            aHash %= MOD;
            power = (power * p) % MOD;
        }
        
        if(aHash == bHash && check(0, A, B)) return q;
        power = (power * pInv) % MOD;
        for(int i = B.size(); i < (q + 1) * A.size(); i++){
            aHash -= int(A[(i - B.size()) % A.size()]);
            aHash *= pInv;
            
            //power: p^(n-1)
            aHash += power * int(A[i % A.size()]);
            aHash %= MOD;
            if(aHash == bHash && check(i - B.size() + 1, A, B)){
                return i < q * A.size() ? q : q+1;
            }
        }
        return -1;
    }
};

// Time Complexity : O(M+N)
// Space Complexity : O(1)
