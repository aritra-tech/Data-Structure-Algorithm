#Approach-1 Brute Force


class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        int length=0,count=0;           
        ListNode* temp=head,prev;
        ListNode* curr;
        //if linkedlist is empty then will return NULL
        if(!head) return 0;
        // if only 1 element exist in LL then will delete that element and return null
        if(!head->next)
        {
            delete head;
            return 0;
        }
        // Finding the length of LL
        while(temp!=NULL)
        {
            temp=temp->next;
            length++;
        }
        //for finding the middle element dividing it by 2
        //since it's 0 based indexing that's why when we simply divide length by 2 it will give the exact int value
        count=length/2;
        temp=head;
        while(count!=0)
        {
            curr=temp;
            temp=temp->next;
            count--;
        }
        // when count gets 0 , temp will be the middle element & we'll delete it
        curr->next=temp->next;
        delete temp;
        return head;
    }
};



#Approach-2 Slow & Fast pointer 


class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        ListNode* slow=head;
        ListNode* fast=head;
        // maintaining the prev pointer which will be just behind slow
        ListNode* prev;
        if(!head) return 0;
        if(!head->next)
        {
            delete head;
            return 0;
        }
        // at the end when fast or fast->next will be null we'll get our middle element which is to be deleted
        while(fast && fast->next)
        {
            prev=slow;
            slow=slow->next;
            fast=fast->next->next;
        }
        // hence we'll delete slow as it is our middle element 
        prev->next=slow->next;
        delete slow;
        return head;
    }
};