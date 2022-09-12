class Solution{
  public:
    Node* mergeSort(Node* head) {
        if(!head || !head->next) return head;
        Node* fast=head;
        Node* slow=head;
        Node* temp; //we'll keep a temp pointer which will be just behind the slow pointer
        // Finding the middle element of LL
        while(fast && fast->next)
        {
            temp=slow;
            slow=slow->next;
            fast=fast->next->next;
        }
        //Now we'll divide the LL into two parts so one part will be from head to temp and other from slow to last.
        // Thereby we have done temp->next as 0
        temp->next=0;
        
        // Pass these two LL again and they'll keep on dividing until we get a single node LL
        Node* l1=mergeSort(head);
        Node* l2=mergeSort(slow);
        
        // Now merge the 2 linkedlist
        Node* ans= mergelist(l1,l2);
        return ans;
    }
    // This is the same approach of Merge 2 sorted LL
    Node* mergelist(Node* l1,Node* l2)
    {
        Node* dummy=new Node(-1);
        Node* temp=dummy;
        
        if(!l1) return l2;
        if(!l2) return l1;
        while(l1 && l2)
        {
            if(l1->data <=l2->data)
            {
                dummy->next=l1;
                dummy=dummy->next;
                l1=l1->next;
            }
            else
            {
                dummy->next=l2;
                dummy=dummy->next;
                l2=l2->next;
            }
        }
        if(l1)
        {
                 dummy->next=l1;
                dummy=dummy->next;
                l1=l1->next;
        }
        if(l2)
        {
                dummy->next=l2;
                dummy=dummy->next;
                l2=l2->next;   
        }
        return temp->next;
    }
};