
Node *flatten(Node *root)
{
   
   vector<int> v;
   Node* temp=root;
   while(temp!=NULL){
       Node* b=temp;
       while(b!=NULL){
           v.push_back(b->data);
           b=b->bottom;
       }
       temp=temp->next;
   }
   sort(v.begin(),v.end());
   Node* head=new Node(0);
   Node* temp1=head;
   for(int i=0;i<v.size();i++){
        Node* ans=new Node(v[i]);
        temp1->bottom=ans;
        temp1=temp1->bottom;
   }
   temp1->next=NULL;
   return head->bottom;
}