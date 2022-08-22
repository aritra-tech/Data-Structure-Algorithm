package Striver_SDE_Sheet.Linked_List.Palindrome_Linked_List;

public class Flattening {
    Node flatten(Node root)
    {
    	if(root == null || root.next ==  null)
    		return root;
    	
    	// Recursion for right lists
    	root.next = flatten(root.next);
    	
    	// Now merging them all
    	root = mergeTwoLists(root, root.next);
    	
    	return root; // Returning root in merge with its Left
    }
    
    Node mergeTwoLists(Node a, Node b){
    	// pointing variables
        Node temp = new Node(0); 
        Node res = temp;
        
        while(a != null && b != null){
        	// comparison and  Goes on
            if(a.data < b.data){ 
                temp.bottom = a;
                temp = temp.bottom;
                a = temp.bottom;
            }else{
                temp.bottom = b;
                temp = temp.bottom;
                b = temp.bottom;
            }
        }
        
        if(a != null) temp.bottom = a; 
        else temp.bottom = b;
        
        return res.bottom; // Head of flatten LL
    }
}