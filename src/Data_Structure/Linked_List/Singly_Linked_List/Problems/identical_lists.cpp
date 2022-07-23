bool areIdentical(struct Node *a, 
                  struct Node *b)
{
    while (a != NULL && b != NULL)
    {
        if (a->data != b->data)
            return false;
  
       
        a = a->next;
        b = b->next;
    }
  
    return (a == NULL && b == NULL);
}
  

void push(struct Node** head_ref, int new_data)
{
   
    struct Node* new_node =
        (struct Node*) malloc(sizeof(struct Node));
  
  
    new_node->data = new_data;
  
    
    new_node->next = (*head_ref);
  
    
    (*head_ref) = new_node;
}