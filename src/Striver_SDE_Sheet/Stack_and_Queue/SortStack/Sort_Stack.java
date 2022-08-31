package Striver_SDE_Sheet.Stack_and_Queue.SortStack;
import java.util.*;

public class Solution {

	static void sortedInsert(Stack<Integer> stack , int num){
		if(stack.empty() || (!stack.empty() && stack.peek()<num)){
			stack.push(num) ;
			return ;
		}
		int n = stack.peek();
		stack.pop();
		
		sortedInsert(stack , num);
		stack.push(n);
	}
	
	public static void sortStack(Stack<Integer> stack) {
		if(stack.empty()){
			return ;
		}
		int num = stack.peek();
		stack.pop();
		sortStack(stack);
		sortedInsert(stack , num);
	}
	
}