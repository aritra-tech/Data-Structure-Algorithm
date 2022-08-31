## Implementing a stack using queue

# Approach

This method ensures that the newly entered element is always at the front of ‘q1’ so that pop operation dequeues from ‘q1’. ‘q2’ is used to put every new element in front of ‘q1’.

push(s, x) operation’s steps are described below: 
Enqueue x to q2
One by one dequeue everything from q1 and enqueue to q2.
Swap the names of q1 and q2
pop(s) operation’s function is described below: 
Dequeue an item from q1 and return it.

# Time Complexity 

O(n)

# Space Complexity

O(n)

Source: GeeksforGeeks