
/* Two Pointers - fast and slow
Faster pointer moves two steps a time, and slow pointer moves one step a time.
Faster pointer will meet slow pointer eventually.
If x == 1, then in the next time, fast pointer will meet slow pointer.
If x > 1, then in the next tme, fast pointer will get one step closer to slow pointer.
The process continues until faster pointer is just one step behind slow pointer.
Then in the next time, they meet together.
*/

#include <iostream>
#include <unordered_set>

using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    bool hasCycle(ListNode *head) {

        if(head == NULL)
            return false;

        if(head->next == NULL)
            return false;

        ListNode* slow = head;
        ListNode* fast = head->next;
        while(fast != slow){
            if(fast->next == NULL)
                return false;
            if(fast->next->next == NULL)
                return false;

            fast = fast->next->next;
            slow = slow->next;
        }

        return true;
    }
};

int main() {

    return 0;
}

