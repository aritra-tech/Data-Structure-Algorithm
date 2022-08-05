#include <iostream>

using namespace std;

class Solution {
public:
    string removeOuterParentheses(string str) {
      int len = str.size();
      //initialize a stack of characters
      stack<char> st;
      string answer;
      for(int i = 0; i < len; i++){
          if(str[i] == '('){
              //if the stack is not empty, add to the variable
              if(!st.empty()){
                  answer += '(';
              }
              st.push('(');
          }
          else{
             st.pop();
             if(!st.empty()){
                 answer += ')';
             }
          }
      }
      return answer;
    }
};
