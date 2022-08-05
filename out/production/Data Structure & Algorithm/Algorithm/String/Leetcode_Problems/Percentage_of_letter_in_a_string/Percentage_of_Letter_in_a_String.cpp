#include <iostream>

using namespace std;

int percentageLetter(string str, char lttr) {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str[i]==lttr)
                count++;
        }
      int answer=count*100/str.length();

        return answer;
    }
