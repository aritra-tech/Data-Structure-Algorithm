
### Problem Statement :- 
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

### Link :- [ Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)




### Approach: 

### Brute force
We can write a nested loop, the outer loop goes through each window and the inner loop finds the max within the window. This is O(N^2) time complexity.

To optimize on brute force, we can either reduce outer or inner loop complexity. Since we have to examine each element at least once (there's no way to find the maximum if we don't know what the values are..), there is not much we can do for outer loop. So we have to work on the inner loop.

### using Balanced binary search tree
One way to achieve this goal is to save the window elements in a self-balancing binary search tree. Because it's self-balancing, the depth of the tree is guaranteed to be O(log(N)) so lookup, getting max, insert and delete are all O(log(N)) operations. Every time we slide the window, we remove the node that's out of the window and add the one that comes into the window to the tree. Overall, this gives us O(N log(k)) since the number of tree nodes is k and we slide max N times.

This is pretty good already, but can we do better?


### Monotonic deque
Here we introduce an interesting data structure. It's a deque with an interesting property - the elements in the deque from head to tail are in decreasing order (hence the name monotonic).

To achieve this property, we modify the push operation so that

Before we push an element into the deque, we first pop everything smaller than it out of the deque.


     public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }


### complexity 
 -   Time Complexity: O( N )
- Space Complexity: O(k)