#include<iostream>
#include<string>
#include <cctype>
using namespace std;

bool isPalindrome(string s) {
 int start=0, end=s.length()-1;
   while(start < end) {
    	if (!isalnum(s[start])){ 
            /* Iterating over start 
            & end while checking for isalum()*/
            start++;
		}else if (!isalnum(s[end])){
           end--;
		}else {
            /*If they are not equal
              it will return false*/ 
			if (tolower(s[start++])!= tolower(s[end--])) return false;
		}
	}
	return true;
}

int main(void){
    string s = "race a car";
    bool output = isPalindrome(s);
    printf("%s", output?"true":"false");
}