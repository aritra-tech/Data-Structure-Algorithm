## Problem Link:
[Sort A Stack](https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275)

## Problem Statement
You’re given a stack consisting of 'N' integers. Your task is to sort this stack in descending order using recursion.

We can only use the following functions on this stack S.
- is_empty(S) : Tests whether stack is empty or not.
- push(S) : Adds a new element to the stack.
- pop(S) : Removes top element from the stack.
- top(S) : Returns value of the top element. Note that this function does not remove elements from the stack.
 

## Approach:

## Brute Force Approach:

Brute Force Approach not feasible for the Time constraints given in the problem.
**
1 <= 'T' <= 100
1 <=  'N' <= 100
1 <= |'V'| <= 10^9
Time Limit: 1 second
**
Hence Recursive solution is best suitable for this problem.

## Optimal Solution (Recursive):

1. Remove top of stack and store it (Recursively) then insert it at appropiate position.
2. A function insertStack to insert element at appropriate position (stack.top()<num).
3. Else pop top element and insert after inserting the element(num). 


### Code
```cpp
class Solution {
public:
    void insertInSorted(stack<int> &stack,int element){
        if(stack.empty() || (!stack.empty() && stack.top()<element)){
            stack.push(element);
            return;
        }
        int num = stack.top();
        stack.pop();
        
        insertInSorted(stack,element);
        stack.push(num);
    }
    void sortStack(stack<int> &stack) {
        if(stack.empty()){
            return;
        }
        int num = stack.top();
        stack.pop();
        sortStack(stack);
        insertInSorted(stack,num);
    }
};
```

### Time Complexity: O(n*log(n))
### Space Complexity: O(n)




