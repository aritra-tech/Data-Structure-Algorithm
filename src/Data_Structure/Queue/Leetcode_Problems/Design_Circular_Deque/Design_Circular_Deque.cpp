#include <bits/stdc++.h>
using namespace std;

class MyCircularDeque {
public:
    vector<int> q;
    int head, curSize;
    bool isStart;
    
    MyCircularDeque(int k) {
        q = vector<int>(k, -1);
        head = 0;
        curSize = 0;
        isStart = true;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    bool insertFront(int value) {
        if(isFull()) return false;
        if(isEmpty()){
            head = 0;
        }else{
            head = (head-1+q.size()) % q.size();
        }
        q[head] = value;
        curSize++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    bool insertLast(int value) {
        if(isFull()) return false;
        q[(head+curSize) % q.size()] = value;
        curSize++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    bool deleteFront() {
        if(isEmpty()) return false;
        q[head] = -1;
        head = (head+1) % q.size();
        curSize--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    bool deleteLast() {
        if(isEmpty()) return false;
        q[(head+curSize-1) % q.size()] = -1;
        curSize--;
        return true;
    }
    
    /** Get the front item from the deque. */
    int getFront() {
        return q[head];
    }
    
    /** Get the last item from the deque. */
    int getRear() {
        return q[(head+curSize-1) % q.size()];
    }
    
    /** Checks whether the circular deque is empty or not. */
    bool isEmpty() {
        return curSize == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    bool isFull() {
        return curSize == q.size();
    }
};

int main() {

    return 0;
}

