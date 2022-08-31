
### Problem Statement :- 
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

- MinStack() initializes the stack object.
- void push(int val) pushes the element val onto the stack.
- void pop() removes the element on the top of the stack.
- int top() gets the top element of the stack.
- int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function..

### Link :- [ Min Stack](https://leetcode.com/problems/min-stack/)




### Approach: 

### Brute force
The first element in the pair will store the value and the second element will store the minimum element till now.

When the first push operation comes in we will push the value and store it as minimum itself in the pair. 

In the second push operation, we will check if the top element’s minimum is less than the new value. If it is then we will push the value with minimum as the previous top’s minimum. To get the getMin element to take the top’s second element.


### optimise Approach

Create a class node which has two variables val and min.  val will store the actual value that we are going to insert in stack ,where as min will store the min value so far seen upto that node. look into the code for better understanding.

- Push operation:

Now if there is a push operation just check whether that number is less than the min number. If it is smaller than min we will push a modified value which is a push(2 * Val – min) into the stack and will update min to the value of the original number. If it’s not then we will just push it as it is.

getMin() operation:

We will just return the value of min.

- Top operation:

While returning the top value we know that it is a modified value. We will check if the top value is lesser than min, If it is then we will return the min as the top value.

- Pop operation:

While making pop we will check if the top value is lesser than min, If it is then we must update our min to its previous value. In order to do that min = (2 * min) – (modified value) and we will pop the element.



### complexity 
 -   Time Complexity: O( 1 )
- Space Complexity: O(N)