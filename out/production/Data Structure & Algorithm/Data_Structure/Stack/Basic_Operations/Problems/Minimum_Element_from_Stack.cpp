class GfG
{
    class Node{
        int val, min;
        Node next;
        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    
    Node head = null;
    
    int getMin(){
        if(head==null)
            return -1;
    	return head.min;
    }
    
    int pop(){
        if(head==null)
            return -1;
		int popped = head.val;
		head = head.next;
		return popped;
    }

    void push(int x){
		if(head == null)
		    head = new Node(x,x,null);
	    else
	        head = new Node(x, Math.min(x, head.min), head);
    }
}
