// Given a singly linked list, rotate the linked list counter-clockwise by k nodes.
// Where k is a given positive integer. For example, if the given linked list is 10->20->30->40->50->60 and k is 4,
// the list should be modified to 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in a linked list



#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};


class Solution
{
    public:
  
     Node* rotate(Node* head, int k)
    {
        if(head==NULL || head->next==NULL)
        return head;
        
      Node *curr = head;
      Node *temp = head;
      Node *p;
      while(curr->next!=NULL)
      curr=curr->next;
     curr->next = head;
     for(int i = 1;i<k;i++)
     temp=temp->next;
     p = temp->next;
     temp->next = NULL;
     
      return p;
    }
};
    



void printList(Node *n)
{
    while (n != NULL)
    {
        cout<< n->data << " ";
        n = n->next;
    }
    cout<< endl;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, val, k;
        cin>>n;
        
        cin>> val;
        Node *head = new Node(val);
        Node *tail = head;
        
        for(int i=0; i<n-1; i++)
        {
            cin>> val;
            tail->next = new Node(val);
            tail = tail->next;
        }
        
        cin>> k;
        
        Solution ob;
        head = ob.rotate(head,k);
        printList(head);
    }
    return 1;
}
