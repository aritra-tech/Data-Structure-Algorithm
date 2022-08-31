## Problem Statement: 
Given an undirected graph, return a vector of all nodes by traversing the graph using breadth-first search (BFS).

## Approach:

* **Queue data structure: follows FIFO, and will always contain the starting.**
* **Visited array: an array initialized to 0**

1. In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
2. In every iteration, we pop out the node ‘v’ and put it in the solution vector, as we are traversing this node.
3. All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue. The list of adjacent neighbors of the node can be accessed from the adjacency list.
4. Repeat steps 2 and 3 until the queue becomes empty, and this way you can easily traverse all the nodes in the graph.

**In this way, all the nodes are traversed in a breadth wise manner.**


![](C:/Users/aritr/Downloads/bfs.gif)

## Complexity:
* **Time Complexity**: O(N) + O(2E), Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes.

* **Space Complexity**: O(3N) ~ O(N), Space for queue data structure visited array and an adjacency list