class Solution
{
    public:
    void linkdelete(struct Node  *head, int M, int N)
    {
         struct Node  *curr=head;Node* temp;
         while(curr!=NULL)
         {
            //moving curr to the one position before the desired node's position & simultaneously checking if curr doesn't get NULL in btwn
             for(int count=1;count<M && curr!= NULL ; count++)
             {
                 curr=curr->next;
             }
             
             //if curr gets Null in between then we'll return 
             if(curr==NULL) return; 
             //moving temp to next of current as temp will be the node which is to be deleted 
             temp=curr->next;
             
            //  Now will delete the N nodes 
             for(int i=1;i<=N && temp!=NULL; i++)
             {
                 Node* del;
                 del=temp;
                 temp=temp->next;
                 delete del;
             }
             //linking curr->next to temp & moving curr to temp
             curr->next=temp;
             curr=temp;
         }
    }
};
