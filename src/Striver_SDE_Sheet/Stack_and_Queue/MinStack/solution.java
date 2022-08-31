package Striver_SDE_Sheet.Stack_and_Queue.MinStack; 


import java.io.*;
import java.util.*;
class MinStack {
	Stack<Node> s;
	
	class Node{
		int val;
		int min;
		public Node(int val,int min){
			this.val=val;
			this.min=min;
			
		}
		
	}

	/** initialize your data structure here. */
	public MinStack() {
		this.s=new Stack<Node>();
	}
	public void push(int x) {
		if(s.isEmpty()){
			this.s.push(new Node(x,x));
		}else{
			int min=Math.min(this.s.peek().min,x);
			this.s.push(new Node(x,min));
		}	
	}
	public int pop() {
	
			return this.s.pop().val;
	}
	public int top() {
		
			return this.s.peek().val;
	}
	public int getMin() {
		
			return this.s.peek().min;	
	}
}


class GFG {
	
	

	public static void main (String[] args) {
	MinStack s=new MinStack();
	s.push(-1);
	s.push(10);
	s.push(-4);
	s.push(0);
	System.out.println(s.getMin());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.getMin());
		
		
	}
}
