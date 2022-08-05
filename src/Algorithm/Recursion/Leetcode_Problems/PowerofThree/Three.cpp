#include <bits/stdc++.h>
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
bool isPowerOfThree(int n) {

    if(n==0){
        return false;
    }
    
    while(n!=1){
        
        if(n%3!=0){
            return false;
        }
        
        n=n/3;
        
    }
    
    return true;  
}
};