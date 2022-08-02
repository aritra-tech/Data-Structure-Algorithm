
class Solution
{
    public:
    Node* segregate(Node *head) {
        int zero=0,one=0,two=0;
        Node * temp=head;
        // just stored the counts of the elements 0,1,2
        while(temp)
        {
            if(temp->data==0) zero++;
            else if(temp->data==1)one++;
            else two++;
            
            temp=temp->next;
        }
        temp=head;
        // with the help of count arrange the elements in sorted order by changing the values in nodes
        while(temp)
        {
            if(zero>0)
            {
                temp->data=0;
                zero--;
            }
            else if(one>0)
            {
                temp->data=1;   
                one--;
            }
            else temp->data=2;
            
            temp=temp->next;
        }
        return head;
    }
};

