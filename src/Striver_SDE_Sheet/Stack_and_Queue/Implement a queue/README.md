## Implementing a queue

## What is a queue

The queue which is implemented as FIFO where insertions are done at one end and deletions are done from another end.
The operations performed on queue are:

EnQueue (int data) − Insertion at rear end

DeQueue()− Deletion from front end

# Algorithm of implementing queue using an array

Begin
   function Enqueue() to insert elements in queue:
      If queue is completely filled up then print “Overflow”.
      Otherwise insert element at rear.
      Update the value of rear
End
Begin
   function Dequeue() to delete elements from queue:
      If queue is completely empty then print “Underflow”.
      Otherwise insert element from the front.
      Update the value of rear.
End

## Time Complexity

Enqueue: O(1)
Dequeue: O(1)
Display: O(1)

# Space Complexity

O(n)

Source: Tutorialspoint