# Problem Link

[Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)




### Approach

So, this is our code.
We don't have the access to the previous node of the to be deleted node.
But we have the access to the next node, which makes deletion of next node possible.
So, we copy the value of the next node to this node and delete the next node (i.e connecting our current node to the next node's next)

    // now as we can't go in reverse direction our approach would be manipulation of 
    // a. links
    // b. values of the node
    
    // only link change would not be sufficient as we do not have access to the prev node
    
    // we can swap the value of 5, 1 (as in example)
    // and then delete the 5 valued node
    
    if(node != null && node.next != null)
    {
        // putting the value of next node into our current node
        node.val = node.next.val;
        
        // our list looks like:
        // 4->1->1->9->null
        
        // connecting node to 9, deleting the mid 1
        node.next = node.next.next;
    }
    
}

- 100% faster