/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

/// Definition for undirected graph.
struct UndirectedGraphNode {
    int label;
    vector<UndirectedGraphNode *> neighbors;
    UndirectedGraphNode(int x) : label(x) {};
};

/// DFS
class Solution {

public:
    UndirectedGraphNode *cloneGraph(UndirectedGraphNode *node) {

        if(node == NULL)
            return NULL;

        unordered_map<UndirectedGraphNode*, UndirectedGraphNode*> nodeMap;
        return dfs(node, nodeMap);
    }

private:
    UndirectedGraphNode *dfs(UndirectedGraphNode *node,
                             unordered_map<UndirectedGraphNode*, UndirectedGraphNode*>& nodeMap){

        if(nodeMap.count(node))
            return nodeMap[node];

        nodeMap[node] = new UndirectedGraphNode(node->label);
        for(UndirectedGraphNode* next: node->neighbors)
            nodeMap[node]->neighbors.push_back(dfs(next, nodeMap));
        return nodeMap[node];
    }
};


int main() {

    return 0;
}

// Time Complexity: O(V+E)
// Space Complexity: O(V)


