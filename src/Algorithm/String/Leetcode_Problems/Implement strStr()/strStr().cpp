#include<iostream>
#include<string>
using namespace std;

int strStr(string hs, string n) {
    /*Checking if haystack is less than needle*/
    if(hs.size() < n.size()){
        return -1; 
    }
    /*Now checking if the substring presnt in haystack is present in 
    needle using substr() then return index */ 
    for(int i = 0 ; i < hs.size() - n.size() + 1; i++){
        if(hs.substr(i,n.size()) == n){
            return i;
        }
    }
     return -1;
}

int main(){
    string haystack = "hello";
    string needle = "ll";
    int output = strStr(haystack,needle);
    printf("%d is the index of needle in the haystack");
}

/*OUTPUT
 2nd index of hello is where the needle = ll is present 
 */