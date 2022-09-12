## Problem Link:
[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## Problem Statement
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.
 

## Approach:

## Brute Force:

1. Declare an empty stack.
2. Push an opening parenthesis on top of the stack.
3. In case of a closing bracket, check if the stack is empty.
4. If not, pop in a closing parenthesis if the top of the stack contains the corresponding opening parenthesis.
5. If the parentheses are valid,​ then the stack will be empty once the input string finishes.

### Code:

```cpp
class Solution {
public:
    bool isValid(string s) {
        stack<char> sack;
        int n = s.size();
        for(int i=0;i<n;i++)
        {   
            if(s[i]=='(' || s[i]=='{' || s[i]=='[')
            { 
            sack.push(s[i]);
            continue;
            }
            if(sack.empty())
                return false;
            char x = sack.top();
            if((x=='(' && s[i]==')') || (x=='{' && s[i]=='}') || (x=='[' && s[i]==']'))
                sack.pop();
            else
                return false;
        } 
        if(sack.empty())
            return true;
        return false;
    }
};
```


### Time Complexity: O(n)
### Space Complexity: O(1)

The Brute Force Approach given above is the optimal Solution for this Problem
