#include<iostream>
#include<string>
using namespace std;

 int countAsterisks(string s) {
    int n=s.length();
    if(n==0) return 0;
    int cnt = 0;
    int as = 0;
    for(int i=0;i<n;i++){
        if(s[i] =='|'){
            /* No. of | by comparing */
             as++;
        }
        if(as%2 == 0 && s[i]=='*'){
            /*Condition is if 2 || and * will add cnt */
            cnt++;
                                        
        }
    }
    return cnt;
}
  
int main(void){
   string s = "l|*e*et|c**o|*de|";
   int output = countAsterisks(s);
   printf("%d",output);
}