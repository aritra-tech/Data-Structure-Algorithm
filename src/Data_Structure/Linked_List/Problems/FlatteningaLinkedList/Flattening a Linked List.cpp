// This is the same approach of Merge 2 sorted LL
Node* mergelist(Node* l1,Node* l2)
{
    Node* dummy=new Node(-1);
    Node* temp=dummy;
    if(!l1) return l2;
    if(!l2) return l1;
     while(l1 && l2)
     {
         if(l1->data<=l2->data)
         {
             temp->bottom=l1;
             temp=temp->bottom;
             l1=l1->bottom;
         }
         else
         {
             temp->bottom=l2;
             temp=temp->bottom;
             l2=l2->bottom;
         }
     }
     while(l1)
     {
             temp->bottom=l1;
             temp=temp->bottom;
             l1=l1->bottom;
     }
     while(l2)
     {
             temp->bottom=l2;
             temp=temp->bottom;
             l2=l2->bottom;
     }
     return dummy->bottom;
}

Node *flatten(Node *root)
{
    if(!root || !root->next)
    {
        return root;
    }
    // firstly we'll reach till end of LL and then we'll recursively come back while merging the LL from last and will link the merged LL to root->next
    root->next=flatten(root->next);
    // when we'll get two LL then we'll perform merge operation on them and will merge it and then return root of LL
    root= mergelist(root,root->next);
    return root;
}
