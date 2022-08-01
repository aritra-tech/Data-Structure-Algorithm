#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;

char repeatedCharacter(string s)
{
    /*Creating hashmap so 
     if string[i] is present
     present in string[i]
     then true or else false*/ 
    vector<bool> hash(26);
    for (const char c : s)
    {
        /*
        c is (s[i] -97)(ASCII VALUE OF 'a')) so will get
        hash[i] and will get added
         */
        if (hash[c - 'a'])
        {
            /*if present then return c*/
              return c;
        }
        hash[c - 'a'] = true;
    }
    return 'a';
}

int main(void){
    string s = "abccbaacz";
    char output = repeatedCharacter(s);
    printf("%c",output);   
} 