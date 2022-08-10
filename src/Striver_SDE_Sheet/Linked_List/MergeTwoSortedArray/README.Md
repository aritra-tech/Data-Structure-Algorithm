# Problem Link

[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)




### Approach

### Using Recursion 
     class Solution {
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
    
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
             list2.next=mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

- Time Complexity O(N+M)
- Space Complexity O(N+M)

### Optimal Approach:

Using a dummy node to keep track of the real head.
This is very useful for storing a reference to the real head to return. Using this method you don't have to be concerned with the reference ever being null during your logic.
Using the input references to keep track of your current position in each list.
This is just useful because you don't have to make copies. It doesn't impact performance (in both directions) at all.
Here I am using the references provided as arguments as the pointers to the current position in each list.

- Time Complexity - O(N)
- Space Complexity - O(1)
where N is the size of the input LinkedList.

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        while(list1 != null || list2 != null) {
            
            boolean takeList2Value = list1 == null;
            if(list2 != null && list1 != null && list2.val < list1.val) takeList2Value = true;
            
            if(takeList2Value) {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            } else { //If not list 2 then we must take list 1
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }
            
        }
        
        return dummy.next;
    }