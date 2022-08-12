## What is a Stack?
Stack is a data structure that follows the **Last In First Out (LIFO)** rule.

## Operations in Stack

* **push() :**  Insert the element in the stack.

* **pop() :**  Remove and return the topmost element of the stack.

* **top() :**  Return the topmost element of the stack

* **size() :**  Return the number of remaining elements in the stack.

## Approach towards the Problem

As we know stack works on the principle of last in first out, so we have to put elements in an array such that it keeps track of the most recently inserted element.
```
- Declare an array of particular size.
- Define a variable “Top” and initialize it as -1.
- push(x): insert element is the array by increasing top by one.
- pop(): check whether top is not equal to -1 if it is so, return top and decrease its value by one.
- size(): return top+1.
```

## Complexity

- Time Complexity: O(N)

- Space Complexity: O(N)