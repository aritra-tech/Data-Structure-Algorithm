package Striver_SDE_Sheet.Stack_and_Queue.GreaterElement;
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){            
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);            
        }
        
        int i=0;        
        for(int num : nums1)
            result[i++] = map.getOrDefault(num, -1);
        return result;
    }
}