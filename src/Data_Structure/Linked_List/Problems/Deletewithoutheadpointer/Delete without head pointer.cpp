/*
We can delete a pointer without the head pointer because previous node's next has to be updated
Therefore, we'll delete the data 

--Will copy the next's node value in the current node and will move del to next node
--Now will update the link of curr->next
-- and will delete the del node
*/

class Solution
{
    public:
    void deleteNode(Node *del)
    {
       Node* curr=del;
       
       curr->data=curr->next->data;
       del=del->next;
       curr->next=curr->next->next;
       delete del;
    }

};