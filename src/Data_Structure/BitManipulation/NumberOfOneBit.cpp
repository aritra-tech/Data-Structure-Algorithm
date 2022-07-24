#include<bits/stdc++.h>
using namespace std;

int numberOfbits(int n){
    int count = 0;
    while(n != 0){
        if(n&1){
            count++;
        }
        n = n>>1;
    }
    return count;
}

int main(){
    int n;
    cout << "Enter the number: ";
    cin >> n;
    cout << numberOfbits(n) << endl;
    return 0;
}