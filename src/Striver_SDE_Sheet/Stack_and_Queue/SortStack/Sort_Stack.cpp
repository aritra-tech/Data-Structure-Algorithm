#include<bits/stdc++.h>
using namespace std;

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