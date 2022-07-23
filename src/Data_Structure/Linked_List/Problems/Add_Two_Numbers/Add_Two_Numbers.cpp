#include <iostream>

using namespace std;

class ListNode {
public:
    int val;
    ListNode *next; 
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int sum = 0, carry = 0;
        ListNode * head = new ListNode(), *temp = head;
        while(l1 != NULL || l2 != NULL || carry != 0) {
            sum = carry;
            if(l1 != NULL) {
                sum += l1 -> val;
                l1 = l1 -> next;
            }
            if(l2 != NULL) {
                sum += l2 -> val;
                l2 = l2 -> next;
            }
            carry = sum / 10;
            sum %= 10;
            temp -> next = new ListNode(sum);
            temp = temp -> next;
        }
        return head -> next;
    }
};

int main() {
    int m, n;

    cin >> m >> n;

    ListNode *l1 = new ListNode(), *l2 = new ListNode();
    ListNode *tail1 = l1, *tail2 = l2;

    // note: input is in reverse (as stated in the question)
    // creating 1st linked list
    for(int i = 0; i < m; ++i) {
        int temp;
        cin >> temp;
        tail1 -> next = new ListNode(temp);
        tail1 = tail1 -> next;
    }

    // creating 2nd linked list
    for(int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;
        tail2 -> next = new ListNode(temp);
        tail2 = tail2 -> next;
    }

    Solution s;
    ListNode *l3 = s.addTwoNumbers(l1 -> next, l2 -> next);

    // printing the new linked list holding the sum
    while(l3 != NULL) {
        cout << l3 -> val << " ";
        l3 = l3 -> next;
    }

    return 0;
}
